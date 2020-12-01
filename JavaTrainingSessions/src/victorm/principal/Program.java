package victorm.principal;

import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;

import victorm.day_2.Two;
import victorm.day_3.CompareNumber;
import victorm.day_4.SwitchExample;
import victorm.day_5.EmployeeInfo;
import victorm.day_6.ExtendsSubClass;
import victorm.day_6.ISubClass;
import victorm.day_6.SubClass;
import victorm.day_7.Calculator;
import victorm.day_7.Circle;
import victorm.day_7.Oval;
import victorm.day_7.Rectangle;
import victorm.day_7.Shape;
import victorm.day_7.ShapeDrawer;
import victorm.day_7.Square;
import victorm.day_8.Encapsulation;
import victorm.day_9.OuterClass;
import victorm.day_9.OuterClass.ImplementingClass;
import victorm.day_9.OuterClass.MemberInnerClass;

public class Program {
	/*
	 * @author Victor M. 
	 */
	public static void main(String[] args) {
		Test1();
	
	}
	
	public static void Test1() {
		
		MemberInnerClass mic = new OuterClass().new MemberInnerClass();
		ImplementingClass ic = new OuterClass().new ImplementingClass();
		
		
		mic.printMessage();
		new OuterClass.InnerStaticClass().printMessage();
		ic.printMessage();
		
	}
	
}
