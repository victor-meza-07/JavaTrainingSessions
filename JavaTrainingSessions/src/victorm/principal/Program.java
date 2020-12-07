package victorm.principal;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;

import victorm.day_02.Two;
import victorm.day_03.CompareNumber;
import victorm.day_04.SwitchExample;
import victorm.day_05.EmployeeInfo;
import victorm.day_06.ExtendsSubClass;
import victorm.day_06.ISubClass;
import victorm.day_06.SubClass;
import victorm.day_07.Calculator;
import victorm.day_07.Circle;
import victorm.day_07.Oval;
import victorm.day_07.Rectangle;
import victorm.day_07.Shape;
import victorm.day_07.ShapeDrawer;
import victorm.day_07.Square;
import victorm.day_08.Encapsulation;
import victorm.day_09.OuterClass;
import victorm.day_09.OuterClass.ImplementingClass;
import victorm.day_09.OuterClass.MemberInnerClass;
import victorm.day_11.ExceptionHandling;
import victorm.day_12.Assignment_Day_12;
import victorm.day_12.Employee;
import victorm.day_14.Day14;

public class Program {
	/*
	 * @author Victor M. 
	 */
	public static void main(String[] args) {
		
		Test2();
		
	}
	
	public static <T> void Test1() {
		Assignment_Day_12 ad12 = new Assignment_Day_12();
		ArrayList ar = new ArrayList();
		ar.add("Hello");
		ar.add("World");
		
		ad12.PartOne(ar, "World");
		System.out.println(ar.contains("World"));
		
		int[][] matrix = ad12.PopulateArray(new int[20][10]);
		System.out.println(ad12.PartTwo(matrix));
		
		T[][] matrixT = (T[][]) new String[10][20];
		System.out.println(ad12.PartThree(matrixT,"hello"));
		
		ar.add("World");
		ar.add("Love Collections");
		ad12.PartFour(ar);
		
		ArrayList<Employee> emp = new ArrayList();
		ad12.PartFive(emp);
		
	}

	public static void Test2() {
		Day14 d14 = new Day14();
		
		d14.PrintEmployeeeResults();
	}
}
