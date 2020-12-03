package victorm.day_07;

public class CustomString implements IValue {
	
	double value = 0;
	
	public CustomString(String s) {
		value = (double)s.length();
	}

	@Override
	public double ReturnValue() {
		// TODO Auto-generated method stub
		return value;
	}
}
