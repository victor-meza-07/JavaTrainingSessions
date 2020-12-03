package victorm.day_07;

import java.util.HashMap;
import java.util.Scanner;

public class Calculator {
	 
	Scanner _scan;
	
	public Calculator() {
		_scan = new Scanner(System.in);
	}
	
	public void Calculate(IValue val1, IValue val2) {
		double answer = val1.ReturnValue() + val2.ReturnValue();
		System.out.println("The Answer is: "+ answer);
	}
	
	public void GetValues() {
		
		System.out.println("Please give me value 1");
		String val1Primative = _scan.nextLine();
		System.out.println("Please give me value 2");
		String val2Primative = _scan.nextLine();
		
		IValue val1 = getValueType(val1Primative);
		IValue val2 = getValueType(val2Primative);
		
		Calculate(val1, val2);
		
	}
	
	
	
	private IValue getValueType(String value) {
		
		IValue val;
		
		//lets check if it is a char, int, string, double
		if(CheckInt(value) == true) {
			val = new CustomInt(Integer.parseInt(value));
		}//this is an int
		else if(CheckDouble(value) == true) {
			val = new CustomDouble(Double.parseDouble(value));
		} // this is a double
		else if(CheckChar(value) == true) {
			val = new CustomChar(value.charAt(0));
		}//this is a char
		else {
			val = new CustomString(value);
		}//this is a string;
		
		return val;
	}
	
	private boolean CheckInt(String value) {
		try {
			Integer.parseInt(value);
			return true;
		}
		catch(Exception e) {
			return false;
		}
	}
	private boolean CheckDouble(String value) {
		try {
			Double.parseDouble(value);
			return true;
		}
		catch(Exception e) {
			return false;
		}
	}
	private boolean CheckChar(String value) {
		if(value.length() > 1) {
			return false;
		}
		else {
			return true;
		}
	}
}
