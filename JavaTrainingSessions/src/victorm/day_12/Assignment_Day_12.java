package victorm.day_12;

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment_Day_12 {
	
	public Assignment_Day_12(){
		
	}
	
	
	public <T> void PartOne(ArrayList arr, T element) {
		arr.remove(arr.indexOf(element));
	}
	public int PartTwo(int[][] matrix) {
		
		int sum = 0;
		
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				sum += matrix[i][j];
			}
		}
		
		return sum;
	}
	public <T> boolean PartThree(T[][] matrix, T element) {
		for(int i =0; i < matrix.length; i++) {
			for(int j =0;j<matrix[i].length; j++) {
				if(matrix[i][j] == element) {
					return true;
				}
			}
		}
		return false;
	}
	public ArrayList PartFour(ArrayList a) {
		ArrayList b = new ArrayList();
		
		a.forEach((o) -> b.add(o));
		b.forEach(o -> System.out.println(o));
		
		return b;
	}
	public void PartFive(ArrayList<Employee> EmployeeList) {
		EmployeeList = PartFiveHelperPopulateList(EmployeeList);
		
		
		boolean run = true;
		
		while(run) {
			String name = PromptUserForSearchCriteria();
			if(name.equals("0")) {
				run = false;
			}
			else {
				Employee possibleEmployee = SearchListForEmployee(EmployeeList, name);
				
				System.out.println("========= SEARCH RESULT =========");
				if(possibleEmployee == null) {
					System.out.println("Not Registered");
				}
				else {
					System.out.println("Registered");
					System.out.println("First Instance Found:");
					System.out.println("Name: "+possibleEmployee.getFirstName()+" "+possibleEmployee.getLastName());
					System.out.println("ID: "+possibleEmployee.getId());
				}
			}
		}
		
		
	}
	
	public int[][] PopulateArray(int[][] arr){
		
		for(int i =0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = i+j;
			}
		}
		
		return arr;
	}
	private ArrayList<Employee> PartFiveHelperPopulateList(ArrayList<Employee> e) {
		Scanner in = new Scanner(System.in);
		
		int employeesLeftToPopulate = 5;
		while(employeesLeftToPopulate > 0) {
			System.out.println("Employees Left to Populate: "+employeesLeftToPopulate);
			System.out.println("Please Enter Employee Info:");
			System.out.println("Please Enter Employee First Name");
			String fname = in.nextLine();
			System.out.println("Please Enter Employee Last Name");
			String Lname = in.nextLine();
			
			if(!fname.equals("") && !Lname.equals("")) {
				Employee emp = new Employee();
				emp.setFirstName(fname);
				emp.setLastName(Lname);
				e.add(emp);
				employeesLeftToPopulate --;
			}
			else {
				if(fname.equals("")) {System.out.println("You need to enter a First Name!");}
				if(Lname.equals("")) {System.out.println("You need to enter a Last Name!");}
			}
		}
		
		System.out.println("All Employees Populated");
		return e;
	}
	private String PromptUserForSearchCriteria() {
		Scanner in = new Scanner(System.in);
		System.out.println("================== SEARCH PROMPT =============");
		System.out.println("Please enter an employees first name");
		String possibleName = in.nextLine();
		possibleName = possibleName.trim();
		
		return possibleName;
	}
	private Employee SearchListForEmployee(ArrayList<Employee> arr, String name) {
		for(int i = 0; i < arr.size(); i++) {
			Employee e = arr.get(i);
			if(e.getFirstName().toLowerCase().equals(name.toLowerCase())) {
				return e;
			}
		}
		return null; 
	}
}
