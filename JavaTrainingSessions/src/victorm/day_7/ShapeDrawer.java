package victorm.day_7;

import java.util.Scanner;

import javax.swing.JFrame;

public class ShapeDrawer {
	public ShapeDrawer() {
		
	}
	
	public void PromptAndDraw() {
		Shape circle = new Circle();
		Shape square = new Square();
		Shape rectangle = new Rectangle();
		Shape oval = new Oval();
		
		boolean run = true;
		
		while(run == true) {
			System.out.println("What do you want to draw?");
			System.out.println("1. Circle");
			System.out.println("2. Oval");
			System.out.println("3. Rectangle");
			System.out.println("4. Square");
			System.out.println("0. Exit");
			Scanner s = new Scanner(System.in);
			String answer = s.nextLine();
			
			switch(answer) {
			case "0":
				run = false;
				System.exit(0);
				break;
			case "1":
				run = false;
				draw(1);
				break;
			case "2":
				run = false;
				draw(2);
				break;
			case "3":
				draw(3);
				run = false;
				break;
			case "4":
				draw(4);
				run = false;
				break;
			default:
				System.out.println(answer+" "+"is not an option please select from the displayed numbers");
				break;
			}
		}
	}
	
	private void draw(int i) {
		JFrame frame = new JFrame();
		if(i == 1) {frame.add(new Circle());}
		else if(i == 2) {frame.add(new Oval());}
		else if(i == 3) {frame.add(new Rectangle());}
		else if(i == 4) {frame.add(new Square());}
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
