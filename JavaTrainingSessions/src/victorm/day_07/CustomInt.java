package victorm.day_07;

public class CustomInt implements IValue {
	
	public CustomInt(int i) {
		value = (double)i;
	}
	
	double value = 0;
	
	@Override
	public double ReturnValue() {
		
		return value;
	}
	
	
}
