package victorm.day_7;

public class CustomChar implements IValue {
	
	double value = 0;
	
	public CustomChar(char c) {
		int value1 = (int)c;
		value = (double)value1;
	}
	
	
	@Override
	public double ReturnValue() {
		
		return value;
	}
	
	
}
