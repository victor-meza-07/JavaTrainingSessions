package victorm.day_15;

import victorm.principal.Secret;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CustomController {
	
	private Secret s;
	private String username = s.getSQLUsername();
	private String password = s.getSQLPassword();
	private String url = "jdbc:sqlserver://DESKTOP-3FUVOJH\\SQLEXPRESS;databaseName=GalaxE_Assignment;";
	private Statement statement;
	private Connection connection;
	
	
	
	
	public CustomController() {
		s = new Secret();
		SetUpLocalVariables();
		
	}
	
	

	public void Create(User u) {
		StringBuilder sb = new StringBuilder();
		
		sb.append("insert into [users] (firstName, lastName, userName, password, DOB)");
		sb.append(" ");
		sb.append("values");
		sb.append(" ");
		sb.append("(");
		sb.append("'"+u.firstName+"'");
		sb.append(",");
		sb.append("'"+u.lastName+"'");
		sb.append(",");
		sb.append("'"+u.userName+"'");
		sb.append(",");
		sb.append("'"+u.password+"'");
		sb.append(",");
		sb.append("'"+u.DOB+"'");
		sb.append(");");
		
		
		SubmitQueryToDb(sb.toString());
		System.out.println("User Created!");
	}
	public void Update(User u) {
		
		StringBuilder sb = new StringBuilder();
		List<User> usersReturned = Retrieve(u);
		if(usersReturned.size() == 0) {
			System.out.println("There were no users matching the criteria");
		}
		else {
			//update all of them;
			sb.append("update [users] set");
			sb.append(" ");
			sb.append("firstName=");
			sb.append("'"+u.firstName+"'");
			sb.append(",");
			sb.append(" ");
			sb.append("lastName=");
			sb.append("'"+u.lastName+"'");
			sb.append(",");
			sb.append(" ");
			sb.append("userName=");
			sb.append("'"+u.userName+"'");
			sb.append(",");
			sb.append(" ");
			sb.append("DOB=");
			sb.append("'"+u.DOB+"'");
			sb.append(",");
			sb.append(" ");
			sb.append("password=");
			sb.append("'"+u.password+"'");
			sb.append(" ");
			sb.append("where ID=");
			sb.append(u.ID);
			sb.append(";");
			
			
			SubmitQueryToDb(sb.toString());
		}
		
		
		
		System.out.println("User updated!");
		
		
		
	}
	public void Delete(User u) {
		StringBuilder sb = new StringBuilder();
		
		sb.append("delete from users where ID=");
		sb.append(u.ID);
		sb.append(";");
		
		SubmitQueryToDb(sb.toString()); 
	}
	public List<User> Retrieve(User u) {
		StringBuilder sb = new StringBuilder();
		
		
		sb.append("select * from users where id=");
		sb.append(u.ID);
		sb.append(";");
		
		ResultSet rs = GetQueryResultSet(sb.toString());
		
		List<User> userCollection = new ArrayList<User>();
		
		try {
			while(rs.next()) {
				User nU = new User();
				nU.ID = Integer.parseInt(rs.getString(1));
				nU.firstName = rs.getString(2);
				nU.lastName = rs.getString(3);
				nU.userName = rs.getString(4);
				nU.password = rs.getString(5);
				nU.DOB = rs.getString(6);
				
				userCollection.add(nU);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return userCollection;
	}
	public List<User> RetrieveAll(){
		StringBuilder sb = new StringBuilder();
		sb.append("select * from [users];");
		
		ResultSet rs = GetQueryResultSet(sb.toString());
		
		List<User> userCollection = new ArrayList<User>();
		
		try {
			while(rs.next()) {
				User nU = new User();
				nU.ID = Integer.parseInt(rs.getString(1));
				nU.firstName = rs.getString(2);
				nU.lastName = rs.getString(3);
				nU.userName = rs.getString(4);
				nU.password = rs.getString(5);
				nU.DOB = rs.getString(6);
				
				userCollection.add(nU);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return userCollection;
	}
	
	
	
	
	private void SubmitQueryToDb(String query) {
		ClearStatement();
		try {
			statement.execute(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private ResultSet GetQueryResultSet(String query) {
		ClearStatement();
		ResultSet rs = null;
		
		try {
			rs = statement.executeQuery(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return rs;
	}
	
	
	
	private void SetUpLocalVariables() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			connection = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			statement = connection.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void CloseConnection() {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private void ClearStatement() {
		try {
			statement.clearBatch();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	


}
