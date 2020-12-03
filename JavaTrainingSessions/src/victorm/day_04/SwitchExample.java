package victorm.day_04;

public class SwitchExample {
	
	public SwitchExample() {}
	
	public void FizzBuzz(int I) {
		for(int i = 1; i <= I; i++) { System.out.println(( (i % 5 == 0 && i%3==0) ? "FizzBuzz" : (i % 5 != 0 && i%3==0) ? "Buzz" : (i % 5 == 0 && i%3!=0) ? "Fizz" : i ));}
	}

	public void Example(int i) {
		
		switch(i) {
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("February");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("August");
			break;
		case 9:
			System.out.println("September");
			break;
		case 10:
			System.out.println("October");
			break;
		case 11:
			System.out.println("November");
			break;
		case 12:
			System.out.println("December");
			break;
		default:
			if(i > 7) {System.out.println("Months don't go that high");}
			if(i == 0) {System.out.println("This is not an array we start counting at 1");}
			if(i < 0) {System.out.println("Months don't go that low there is no"+" "+i+" "+"Month");}
		}
		
	}
	
	public void StarLoop() {
		for(int i = 5; i >= 1; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
	
	public void TablePrinter(int i, int k) {
		
		for(int j = 1; j <= k; j++) {
			System.out.println(i+" x "+j+" = "+i*j);
		}
	}
	
	public String FullName(String firstName, String LastName) {
		return firstName.concat(" ").concat(LastName);
	}
	
}