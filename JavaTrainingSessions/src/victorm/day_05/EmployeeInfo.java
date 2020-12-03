package victorm.day_05;

public class EmployeeInfo {
		
		public Employee employee;
		
		public EmployeeInfo(int empId, String firstName, String lastName, double salary, int department, String address) {
			employee = new Employee();
			employee.address = address;
			employee.department = department;
			employee.empId = empId;
			employee.setFirstName(firstName);;
			employee.lastName = lastName;
			employee.salary = salary;
			
			//I know we can use the getters and setters in case the properties were private.
		}
		
		public void DisplayEmployeeInfo(Employee employee) {
			System.out.println("Name: "+employee.getFirstName() + " " + employee.lastName);
			System.out.println("ID: "+employee.empId+"|"+" "+"Department: "+employee.department);
			System.out.println("Salary: "+employee.salary);
		}
}
