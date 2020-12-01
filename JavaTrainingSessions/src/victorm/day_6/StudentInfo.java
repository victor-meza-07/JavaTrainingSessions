package victorm.day_6;

public class StudentInfo implements IStudentSpec {
	
	private Student student;
	
	public StudentInfo() {
		student = new Student();
	}
	

	@Override
	public void ShowStudentInfo(Student student) {
		// TODO Auto-generated method stub
		System.out.println(student.getFirstName() +" "+student.getLastName());
		System.out.println(student.getAge());
		System.out.println(student.getRollNo() +" "+ student.getDepartment());
		System.out.println(student.getFree());
		
	}

	@Override
	public void SaveInformation() {
		// TODO Auto-generated method stub
		System.out.println("The Students info has been saved");
	}


	@Override
	public void CreateInformation(int rollNo, String firstName, String lastName, String department, int age,
			int free) {
		// TODO Auto-generated method stub
		
		student.setAge(age);
		student.setDepartment(department);
		student.setFirstName(firstName);
		student.setLastName(lastName);
		student.setFree(free);
		student.setRollNo(rollNo);
		
	}

}
