package victorm.day_03;

public class CompareNumber {
	public CompareNumber() {}
	
	public int compareTwo(int one, int two) {
		
		if(one > two) {return one;}
		else if (one == two) {return one;}
		else {return two;}
	}
	
	public int compareThree(int one, int two, int three) {
		
		// 5, 20, 1
		// 5, 5, 15
		// 10, 5, 5
		// 5, 10, 5
		
		
		if(one < two && one < three) {return one;}
		else if (two < one && two < three) {return two;}
		else if (three < one && three < two) {return three;}
		if(one == two) {
			if(one < three) {return one;}
			else {return three;}
		}
		if(one == three) {
			if(one < two) {return one;}
			else {return two;}
		}
		if(two == three) {
			if(two < one) {return two;}
			else {return one;}
		}
		
		return 0;
	}

	private int compareFour(int a, int b) {
		if(a <= b) {return a;}
		else {return b;}
	}
	
	public int compareFive(int a, int b, int c) {
		
		int smallFromA = compareFour(compareFour(a,b), compareFour(a,c));
		int smallFromB = compareFour(b,c);
		
		return compareFour(smallFromA, smallFromB);
	}
}
