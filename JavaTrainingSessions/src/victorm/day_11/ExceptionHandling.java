package victorm.day_11;

public class ExceptionHandling {
	
	public ExceptionHandling() {
		
	}
	
	
	public void  GeneralExceptionHandle() {
		
		try {
			int i = 10/ 0;
		}
		catch(Throwable e) {
			System.out.println("An Exception was caught: "+e);
			System.out.println("In file: "+e.getStackTrace()[0].getFileName());
			System.out.println("In class: "+e.getStackTrace()[0].getClassName());
			System.out.println("In method: "+e.getStackTrace()[0].getMethodName());
			System.out.println("On line: "+e.getStackTrace()[0].getLineNumber());
			
			System.out.println("=================================================");
			System.out.println("Full Stack Trace:");
			
			e.printStackTrace();
			
		}
		
	}
	
	public void ThrowAnException() throws Exception {
		Exception e = new Exception();
		throw e;
	}
	
	public void ThrowCustomException() throws Exception{
		try {
			int i = 0/0;
		}
		catch(Throwable t) {
			throw new CustomException("This is a Custom Exception!:", t);
		}
	}
	
}
