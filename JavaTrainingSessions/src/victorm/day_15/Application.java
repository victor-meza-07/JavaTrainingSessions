package victorm.day_15;

import java.util.List;
import java.util.Scanner;

public class Application {
	CustomController cc;
	
	public Application() {
		cc = new CustomController();
	}
	
	public void RegisterUser() {
		User u = new User();
		
		Scanner sc = new Scanner(System.in);
		boolean passwordConfirmed = false;
		System.out.println("=========== USER REGISTRATION ===============");
		while(passwordConfirmed == false) {
			System.out.println("Please enter First Name");
			u.firstName = sc.nextLine();
			System.out.println("Please enter Last Name");
			u.lastName = sc.nextLine();
			System.out.println("Please enter User Name");
			u.userName = sc.nextLine();
			System.out.println("Please enter Date of Birth MM/DD/YYYY");
			u.DOB = sc.nextLine();
			System.out.println("Please enter Password");
			u.password = sc.nextLine();
			System.out.println("Please enter Confirm Password");
			String cpas = sc.nextLine();
			
			passwordConfirmed = confirmPassword(cpas, u.password);
		}
		cc.Create(u);
	}

	public boolean LogUserIn() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please Enter Username");
		String username = s.nextLine();
		System.out.println("Please Eneter Password");
		String pass = s.nextLine();
		
		if(CheckAllUsers(username, pass)) {
			System.out.println("User is registered");
			cc.CloseConnection();
			return true;
		}
		else {
			System.out.println("Please Register User");
			RegisterUser();
			return false;
		}
		
	}
	
	public void RunPrompt() {
		boolean run = false;
		while(run == false) {
			run = LogUserIn();
		}
	}
	
	
	
	private boolean confirmPassword(String p, String pp) {
		if(p.equals(pp)) {return true;}
		else {System.out.println("Passwords did not match please try again"); return false;}
	}
	private boolean CheckAllUsers(String un, String p) {
		List<User> uu = cc.RetrieveAll();
		for(User u:uu) {
			if(u.userName.equals(un)) {
				if(u.password.equals(p)) {
					return true;
				}
			}
		}
		return false;
	}

}
