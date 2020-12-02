package victorm.day10;

public class CustomException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5519072539444662189L;
	
	
	public CustomException(String errorMessage, Throwable t) {
		super(errorMessage, t);
	}
	
	
}
