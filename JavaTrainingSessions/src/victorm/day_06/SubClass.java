package victorm.day_06;

public class SubClass implements ISubClass {

	@Override
	public void PrintMessage() {
		System.out.println("this is the message that I want to print out.");
	}

	@Override
	public void PrintMessage(String message) {
		System.out.println(message);
	}

}
