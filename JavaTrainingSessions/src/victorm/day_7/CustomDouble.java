package victorm.day_7;

public class CustomDouble implements IValue{
	double value = 0;
	public CustomDouble(double d) {
		value = d;
	}
	@Override
	public double ReturnValue() {
		// TODO Auto-generated method stub
		return value;
	}
}
