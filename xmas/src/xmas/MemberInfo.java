package xmas; 

import java.util.Scanner;

public class MemberInfo extends CommonMember{
	protected String name;
	protected int age;
	protected double weight;
	Scanner input = new Scanner(System.in);
	MemberInfo(String name, int age, double weight){
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	MemberInfo(String name, int age){
		this.name = name;
		this.age = age;
	}
	MemberInfo() {
	}
	public int getAge() {
		return this.age;
	}
	public String getName() {
		return this.name;
	}
	public double getWeight() {
		return this.weight;
	}
	
	public void printInfo() {
		System.out.println("");
		System.out.println("name : " +name);
		System.out.println(" age : " + age);
		System.out.println("weight : " + weight);
		
	}
	public void initInfo() {
		this.name = null;
		this.age = -1;
		this.weight = -1;
	}
	
	
}
