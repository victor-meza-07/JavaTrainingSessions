package victorm.day_14;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

import victorm.principal.Secret;

public class Day14 {
	Random r;
	Set<Employee> EmployeeHashSet;
	Map<String, Company> CompanySet;
	Set<Student> StudentHash;
	List<Book> BookLinkedList;
	Student test;
	Secret s;
	
	public Day14() {
		r = new Random();
		EmployeeHashSet = new LinkedHashSet<Employee>();
		CompanySet = new HashMap<String, Company>();
		StudentHash = new LinkedHashSet<Student>();
		BookLinkedList = new LinkedList<Book>();
		populateSet();
		TestLastHash();
		s = new Secret();
	}


	private void TestLastHash() {
		StudentHash.add(test);
	}
	private void populateSet() {
		for(int i = 0; i < 5; i++) {
			Employee e = PopulateEmployee(r.nextInt(Integer.SIZE - 1));
			EmployeeHashSet.add(e);
			
			Company c = PopulateCompany(i);
			CompanySet.put(c.CompanyName, c);
			
			Student s = PopulateStudent(i);
			StudentHash.add(s);
			test = s;
			
			Book b = PopulateBook(i);
			BookLinkedList.add(b);
			
			
		}
	}
	
	
	public void PrintEmployeeeResults() {
		
		
		for(Employee e:EmployeeHashSet) {
			System.out.println(e.name+"| Age:"+e.age+"| trustworthy:"+e.isTrustworthy+"| Grade:"+e.grade);
			System.out.println("------------------------------------------------");
		}
		for(int i = 0; i < 5; i++) {
			Company c = CompanySet.get("Company Name: "+i);
			System.out.println(c.CompanyName+"|"+c.MarketCap+"| Number of Employees: "+c.NumberOfEmployees);
		}
		for(Student s:StudentHash) {
			System.out.println(s.name);
			System.out.println("-------------------------------------------------");
		}
		for(Book b:BookLinkedList) {
			System.out.println("Printing from bottom to top");
			System.out.println(b.name);
		}
	}
	
	private Employee PopulateEmployee(int randomSeed) {
		Employee e = new Employee();
		int sample = r.nextInt(randomSeed);
		
		e.age = sample;
		
		e.name = "My Name is "+ randomSeed;
		
		if(sample % 2 == 0) {
			e.isTrustworthy = true;
			e.grade = 'A';
		}
		else {e.isTrustworthy = false; e.grade = 'F';}
		return e;
	}
	
	private Company PopulateCompany(int i) {
		Company c = new Company();
		
		c.CompanyName = "Company Name: " + i;
		c.MarketCap = "Market Cap: "+"$"+i + "Bn";
		c.NumberOfEmployees = i;
		return c;
	}
	
	private Student PopulateStudent(int i) {
		Student s = new Student();
		s.name = "My name is: "+i;
		
		return s;
	}

	private Book PopulateBook(int i) {
		Book b = new Book();
		b.name = "Book Name: "+i;
		return b;
	}

}










class Employee implements Comparable{
	
	Employee(){}
	
	String name;
	int age;
	boolean isTrustworthy;
	char grade;
	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		
		
		return 0;
	}
}

class Company{
	Company() {}
	String CompanyName;
	String MarketCap;
	int NumberOfEmployees;
}

class Student{
	Student(){}
	String name;
}

class Book{
	String name;
}
