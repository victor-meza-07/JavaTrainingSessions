package victorm.day_6;

public interface IStudentSpec {
	public void CreateInformation(int rollNo, String firstName, String lastName, String department, int age, int free );
	public void ShowStudentInfo(Student student);
	public void SaveInformation();
}
