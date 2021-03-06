
package com.visual.vm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaExpressions {

  
    public static void main(String args[]) {
    		Student s1 = new Student("AAkashVani", "Pune");
    		Student s2 = new Student("Neha", "Mumbai");
    		Student s3 = new Student("Dupia", "Chennai");
    		Student s4 = new Student("Akash", "Delhi");
    		Student s5 = new Student("Papa", "Mzssssssnali");
    		int value = 100;
    		List<Student> l = new ArrayList<Student>();
    		l.add(s1);
    		l.add(s2);
    		l.add(s3);
    		l.add(s4);
    		l.add(s5);
    		
    		System.out.println("************** SORT by NAME *********************");
    		
    		Comparator<Student> c = (Student s, Student ss) -> s.getName().compareTo(ss.getName());
    		
    		Collections.sort(l, c);
    		
    		l.forEach(stud -> System.out.println(stud));
    		
    		System.out.println("************** END *********************");
    		
    		
    		System.out.println("************** SORT by CITY *********************"); 
    		
    		Comparator<Student> c1 = (Student s, Student ss) -> s.getCity().compareTo(ss.getCity());
    		
    		Collections.sort(l, c1);
    		
    		l.forEach(stud -> System.out.println(stud.toString()));
    		
    		System.out.println("************** END *********************");
    		
    		System.out.println("START ******* Lamda Expressions for MATHEMATICAL OPERATIONS");
    		
    		variousMathsOperations v = (a,b,operation) -> {
    			if("add".equals(operation)) {
    				return a+b;
    			}
    			if("sub".equals(operation)) {
    				return a-b;
    			}
    			if("mul".equals(operation)) {
    				return a*b;
    			}
    			if("div".equals(operation)) {
    				if(b == 0) {
    					return 0;
    				}else {
    					return a/b;
    				}
    			}
    			if("rem".equals(operation)) {
    				if(b == 0) {
    					return 0;
    				}else {
    					return a%b;
    				}
    			}
    			else
    			{
    				return 0;
    			}
    		};
    		
    		System.out.println(v.operation(10, 10, "add"));
    		System.out.println(v.operation(20, 10, "sub"));
    		System.out.println(v.operation(10, 10, "mul"));
    		System.out.println(v.operation(10, 5, "div"));
    		System.out.println(v.operation(10, 3, "rem"));
    		
    		System.out.println("Lamda Expressions for MATHEMATICAL OPERATIONS **** END");
    		
    		
    		System.out.println("************* Usage of STREAM API JAVA 8 Fucntions START **********************");
    		
    		List<Employee> list = new ArrayList<Employee>();
    		Employee e1 = new Employee("Ruby", 101);
    		Employee e2 = new Employee("Emarald", 220);
    		Employee e3 = new Employee("blue Diamond", 222);
    		Employee e4 = new Employee("White Diamond", 150);
    		Employee e5 = new Employee("One Gram Gold", 65);
    		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		
		Stream<Employee> filteredData = list.stream().filter(p -> p.getEmpNumber() > 200);
		
		filteredData.forEach(emp -> System.out.println(emp.toString()));
		
		System.out.println("************* Usage of STREAM API JAVA 8 Fucntions END **********************");
		
		System.out.println("************* Usage of STREAM API JAVA 8 Fucntion - STREAM MAP, COLLECTORS #### START **********************");
		
		List<String> furtherFiltered = list.stream().filter(p -> p.getEmpNumber() > value).map(p -> p.getName()).collect(Collectors.toList());
		
		furtherFiltered.forEach(p -> System.out.println("The names of the people who has EMPLOYEE NUMBER greater than " +value+ " are " +p));
		
		System.out.println("*********************USAGE AGAIN Usage of STREAM API JAVA 8 Fucntion - STREAM MAP, COLLECTORS #### END **********************");
    }

		System.out.println("*************USAGE AGAIN  Usage of STREAM API JAVA 8 Fucntion - STREAM MAP, COLLECTORS #### END **********************");
    }
  
>>>>>>> b2
  
}
class Student {
	private String name;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	private String city;
	
	Student(){
		this.name = "";
		this.city= "";
	}
	
	Student(String name, String city){
		this.name = name;
		this.city = city;
	}
	
	public String toString(){
		return "Name --> " + this.name + " - - City --> " + this.city;
		
	}
	
}
class Employee{
	private String name;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the empNumber
	 */
	public int getEmpNumber() {
		return empNumber;
	}
	/**
	 * @param empNumber the empNumber to set
	 */
	public void setEmpNumber(int empNumber) {
		this.empNumber = empNumber;
	}
	private int empNumber;
	
	Employee(){
		this.name = "";
		this.empNumber = 0;
	}
	Employee(String name, int num){
		this.name = name;
		this.empNumber = num;
	}
	public String toString() {
		return "Name --> " + this.name + " - - City --> " + this.empNumber;
	}
}
interface variousMathsOperations{
	public int operation(int a, int b, String op) ;
}

