package victorm.day_09;

public class OuterClass {
	
	public class MemberInnerClass{
		public void printMessage() {
			System.out.println("This is an inner MemberClass");
		}
	}
	
	public static class InnerStaticClass{
		public void printMessage() {
			System.out.println("This is an inner static class");
		}
	}
	
	public interface IInnerInterface{
		public void printMessage();
	}
	
	public class ImplementingClass implements IInnerInterface{

		@Override
		public void printMessage() {
			System.out.println("This is the implemented message");
		}
		
	}

}
