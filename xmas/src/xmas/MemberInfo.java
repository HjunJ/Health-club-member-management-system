package xmas; 

import java.util.Scanner;

public class MemberInfo {
	protected String name;
	protected int age;
	protected double mass;
	Scanner input = new Scanner(System.in);
	MemberInfo(String name, int age, double mass){
		this.name = name;
		this.age = age;
		this.mass = mass;
	}
	MemberInfo(String name, int age){
		this.name = name;
		this.age = age;
	}
	MemberInfo() {
	}
	int getAge() {
		return this.age;
	}
	String getName() {
		return this.name;
	}
	double getMass() {
		return this.mass;
	}
	void setInfo() {
		System.out.println("name: ");
		this.name = input.next();
		System.out.println("age: ");
		this.age = input.nextInt();
		System.out.println("mass: ");
		this.mass = input.nextDouble();
	}
	void printInfo() {
		System.out.println("");
		System.out.println("name : " +name);
		System.out.println(" age : " + age);
		System.out.println("mass : " + mass);
		
	}
	void initInfo() {
		this.name = null;
		this.age = -1;
		this.mass = -1;
	}
	
}
