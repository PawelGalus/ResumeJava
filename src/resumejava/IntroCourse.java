package resumejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import objects.Car;
import objects.Cat;
import objects.Dog;
import objects.Level;
import objects.OuterClass;
import objects.Student;
import objects.Vehicle;

/**
 * Course: Introduction to Java Programming - Course for Absolute Beginners.
 */

public class IntroCourse {

	public static void main(String[] args) {
		IntroCourse intro = new IntroCourse();
		
		intro.helloWorld();
		//intro.varioDataTypes();
		//intro.basicOper();
		//intro.inputScanner();
		//intro.condBool();
		//intro.ifElse();
		//intro.nestedStatements();
		//intro.arr();
		//intro.forLoops();
		//intro.foreachLoops();
		//intro.whileLoops();
		//intro.setList();
		//intro.mapsHashMaps();
		//intro.mapsExample();
		//intro.introObjects();
		//intro.createClass();
		//intro.inheritance();
		//intro.staticMean();
		//intro.overloadCompare();
		//intro.innerClass();
		//intro.interfaces();
		//intro.enumMethod();
	}
	
	//First application
	public void helloWorld() {
		System.out.println("Hello World!");
	}
	
	//Variables & Data Types
	public void varioDataTypes() {
		// primitive data types
		int num1 = 5;
		double num2 = 5.0;
		boolean bool = true;
		char ch = 't';
		// non-primitive data type
		String str = "Hello";
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(bool);
		System.out.println(ch);
		System.out.println(str);
	}
	
	//Basic Operations
	public void basicOper() {
		int i;
		int x = 5;
		int y = 7;
		int z = 57;
		double sum;
		double d;
		
		sum = (double) z / x;
		d = Math.pow(x,y);
		//% - modulo
		i = 56 % 5;
		
		System.out.println(sum);
		System.out.println(d);
		System.out.println(i);
	}
	
	//Input & Scanners
	public void inputScanner() {
		Scanner sc = new Scanner(System.in);
		String scanned = sc.next();
		//int scanned = sc.nextInt();
		//double scanned = sc.nextDouble();
		//boolean scanned = sc.nextBoolean();
		int x;
		
		x = Integer.parseInt(scanned);
		
		System.out.println(x);
		sc.close();
	}
	
	//Conditions & Booleans
	public void condBool() {
		int x = 6;
		int y = 7;
		int z = 10;
		
		// > < == != >= <=
		// && - AND, || - OR, !() - Negative
		boolean compare;
		
		compare = ! (x < y && z < y) ;
		
		System.out.println(compare);
	}
	
	//If / Else / Else If
	public void ifElse() {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		//Compare Strings
		if( str.equals("tim") ) {
			System.out.println("You typed tim");
		}
		else if(str.equals("hello")) {
			System.out.println("Hi!");
		}
		else if(str.equals("hi")) {
			System.out.println("Hello!");
		}
		else {
			System.out.println("--PRINT--");
		}
		
		sc.close();
	}
	
	//Nested Statements
	public void nestedStatements() {
		Scanner sc = new Scanner(System.in);
		String str;
		String food;
		int age;
		
		System.out.print("Input your age: ");
		str = sc.nextLine();
		age = Integer.parseInt(str);
		
		if (age >= 18) {
			System.out.println("You are an adult.");
			System.out.print("Input your favourite food: ");
			food = sc.nextLine();
			
			if ( food.equals("pizza") ) {
				System.out.print("Mine too.");
			}
			else {
				System.out.print("Not mine.");
			}
		}
		else if (age >= 13) {
			System.out.println("You are teenanger.");
		}
		else {
			System.out.println("You are not a teenager or an adult.");
		}
		
		sc.close();
	}
	
	//Arrays
	public void arr() {
		String[] newArr = new String[5];
		newArr[0] = "one";
		newArr[1] = "two";
		newArr[2] = "three";
		newArr[3] = "four";
		newArr[4] = "five";
		
		String x = newArr[4];
		System.out.println(x);
		
		int[] nums = {1, 2, 3, 4, 5};
		int y = nums[4];
		System.out.println(y);
	}
	
	//For Loops
	public void forLoops() {
		int[] arr = {1, 2, 3, 4, 5, 6};
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 5) {
				System.out.println("Found a 5 at index " + i + ".");
			}
		}
	}
	
	//For Loops (Continued)
	public void foreachLoops() {
		int[] nums = {1, 2, 3, 4, 5, 6};
		String[] names = new String[5];
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		
		
		for (int element : nums) {
			System.out.println(element + " " + count);
			count++;
		}
				
		for (int i = 0; i < names.length; i++) {
			System.out.print("Input " + i + ": ");
			String input = sc.nextLine();
			names[i] = input;
		}
		
		for (String n : names) {
			System.out.println(n);
			if (n.equals("tim")) {
				break;
			}
		}
		
		sc.close();
	}
	
	//While Loops
	public void whileLoops() {
		Scanner sc = new Scanner(System.in);
		int x;
		int count = 0;
		
		//I version
		System.out.print("Type a number: ");
		x = sc.nextInt();
		
		while (x != 10) {
			System.out.println("Type 10...");
			System.out.print("Type a number: ");
			x = sc.nextInt();
			count++;
		}
		
		//II version
		do {
			System.out.print("Type a number: ");
			x = sc.nextInt();
		} while (x != 10);
		
		System.out.println("Count: " + count + ".");
		
		sc.close();
	}
	
	//Sets and Lists
	public void setList() {
		ArrayList<Integer> al = new ArrayList<Integer>();
		LinkedList<Integer> ll = new LinkedList<Integer>();
		Set<Integer> t = new HashSet<Integer>();
		Set<Integer> ts = new TreeSet<Integer>();
		boolean b;
		int s;
		
		//HashSet
		System.out.println("--HashSet--");
		t.add(5);
		t.add(7);
		t.add(5);
		t.add(9);
		t.add(-8);
		
		b = t.contains(5);
		System.out.println(b);
		
		t.remove(9);
		//t.clear();
		//t.isEmpty();
		s = t.size();
		System.out.println(s);
		
		System.out.println(t);
		
		//TreeSet
		System.out.println("--TreeSet--");
		ts.add(5);
		ts.add(7);
		ts.add(10);
		ts.add(9);
		ts.add(-8);
		
		System.out.println(ts);
		
		//ArrayList
		System.out.println("--ArrayList--");
		al.add(1);
		al.add(2);
		al.add(1);
		al.add(2);
		al.add(1);
		al.add(2);
		al.get(0); //get values at index
		al.set(1, 5);
		al.size();
		
		
		System.out.println(al);
		System.out.println(al.subList(1, 3));
		
		//LinkedList
		System.out.println("--LinkedList--");
		ll.add(1);
		System.out.println(ll);
	}
	
	//Maps & HashMaps
	public void mapsHashMaps() {
		Map<String, Integer> m = new HashMap<String, Integer>(); //key-value
		Map<String, Integer> tm = new TreeMap<String, Integer>();
		Map<String, Integer> lm = new LinkedHashMap<String, Integer>();
		
		//HashMap
		System.out.println("--HashMap--");
		m.put("tim", 5);
		m.put("joe", 7);
		m.put("mike", 10);
		
		m.containsValue(7);
		m.containsKey("jack");
		
		//m.clear();
		m.isEmpty();
				
		System.out.println(m);
		System.out.println(m.get("tim"));
		System.out.println(m.get("5"));
		System.out.println(m.values());
		
		//TreeMap
		System.out.println("--TreeMap--");
		tm.put("tim", 5);
		tm.put("joe", 7);
		tm.put("mike", 10);
		
		System.out.println(tm);
		
		//LinkedHashMap
		System.out.println("--LinkedHashMap--");
		lm.put("tim", 5);
		lm.put("joe", 7);
		lm.put("mike", 10);
		
		System.out.println(lm);
	}
	
	//MapsExample
	public void mapsExample() {
		Map<Character, Integer> m = new HashMap<Character, Integer>();
		String str = "Hello my name is Paul and i am cool";
		int[] t = {-99, 5, 6, 2, 1, 7, 9, 8};
		
		//HashMap
		System.out.println("--HashMap--");
		
		for (char ch : str.toCharArray()) {
			if (m.containsKey(ch)) {
				int old = m.get(ch);
				m.put(ch, old + 1);
			}
			else {
				m.put(ch, 1);
			}
		}
		
		m.remove(' ');
		
		System.out.println(m);
		
		//Array
		System.out.println("--Array--");
		
		Arrays.sort(t, 1, 7);
		
		for(int i : t) {
			System.out.print(i + ", ");
		}
	}
	
	//Introduction to Objects
	public void introObjects() {
		paul("Paul!", 4);
		System.out.println(add(6));
		System.out.println(str("Hello"));
	}
	
	public void paul(String str, int x) {
		for (int i = 0; i < x; i++) {
			System.out.println(str);
		}
	}
	
	public int add(int x) {
		return x + 2;
	}
	
	public String str(String x) {
		return x + "!";
	}
	
	//Creating Classes
	public void createClass() {
		Dog dog1 = new Dog("Tim", 4);
		dog1.speak();
		Dog dog2 = new Dog("Bill", 7);
		dog2.speak();
		Dog dog3 = new Dog("Bob", 11);
		dog3.speak();
		
		int x = dog1.getAge();
		System.out.println(x);
		
		dog1.setAge(10);
		dog1.speak();
	}
	
	//Inheritance
	public void inheritance() {
		Cat cat1 = new Cat("Tim", 18, 100);
		Cat cat2 = new Cat("Bob", 7);
		Cat cat3 = new Cat("Joe");
		
		cat1.speak();
		cat2.speak();
		cat3.speak();
	}
	
	//Static mean
	public void staticMean() {
		Dog tim = new Dog("Tim", 9);
		Dog bill = new Dog("Bill", 10);
		
		tim.speak();
		bill.speak();
		System.out.println(tim.getCount());
	}
	
	//Overloading Methods & Object Comparisons
	public void overloadCompare() {
		Student stud1 = new Student("Joe");
		Student stud2 = new Student("Bill");
		Student stud3 = new Student("Joe");
		
		System.out.println(stud1.equals(stud2));
		System.out.println(stud1.equals(stud3));
		
		System.out.println(stud1.compareTo(stud2));
		System.out.println(stud1.compareTo(stud3));
		
		System.out.println(stud1);
	}
	
	//Inner Classes
	public void innerClass() {
		 OuterClass out = new OuterClass();
		 OuterClass.InnerClassPublic in = out.new InnerClassPublic();
		 
		 out.inner();
		 in.display();
		 out.innerNew();
	}
	
	//Interfaces
	public void interfaces() {
		Car ford = new Car();
		ford.speedUp(10);
		ford.changeGear(2);
		ford.display();
		
		int x = Vehicle.math(5);
		System.out.println(x);
	}
	
	//Enumerations
	public void enumMethod() {
		Level lvl = Level.LOW;
		Level[] arr = Level.values();
		
		for (Level e : arr) {
			System.out.println(e);
		}
		
		if (lvl == Level.LOW) {
			System.out.println(lvl);
		}
		else if (lvl == Level.MEDIUM) {
			System.out.println(lvl);
		}
		else {
			System.out.println(lvl);
		}
		
		System.out.println(lvl.getLvl());
		System.out.println(Level.valueOf("LOW"));
		
		lvl.setLvl(5);
		System.out.println(lvl.getLvl());
	}
}