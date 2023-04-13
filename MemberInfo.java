package xmas;

import java.util.Scanner;

public class MemberInfo {
	String name;
	int age;
	double mass;
	int PTdate1;
	int PTdate2;
	Scanner input = new Scanner(System.in);
	MemberInfo(String name, int age, double mass, int PTdate1, int PTdate2){
		this.name = name;
		this.age = age;
		this.mass = mass;
		this.PTdate1 = PTdate1;
		this.PTdate2 = PTdate2;
	}
	MemberInfo() {
	}
	void setInfo() {
		System.out.println("name: ");
		this.name = input.next();
		System.out.println("age: ");
		this.age = input.nextInt();
		System.out.println("mass: ");
		this.mass = input.nextDouble();
		System.out.println("PT start date (ex yyyymmdd): ");
		this.PTdate1 = input.nextInt();
		System.out.println("PT finish date (ex yyyymmdd): ");
		this.PTdate2 = input.nextInt();
	}
	void printInfo() {
		System.out.println("");
		System.out.println("name : " +name);
		System.out.println(" age : " + age);
		System.out.println("mass : " + mass);
		System.out.println("PT start : " + PTdate1);
		System.out.println("PT finish : " + PTdate2);
		System.out.println("");
	}
	void initInfo() {
		this.name = null;
		this.age = -1;
		this.mass = -1;
		this.PTdate1 = 0;
		this.PTdate2 = 0;
	}
}
