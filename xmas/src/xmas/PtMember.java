package xmas;

public class PtMember extends MemberInfo{
	
	static int qualify = 1;
	int PTstartdate;
	int PTenddate;
	
	int getPTstartdate() {
		return PTstartdate;
	}
	int getPTenddate() {
		return PTenddate;
	}
	
	PtMember(String name, int age, double mass, int PTstartdate, int PTenddate){
		this.name = name;
		this.age = age;
		this.mass = mass;
		this.PTstartdate = PTstartdate;
		this.PTenddate = PTenddate;
	}
	void printInfo() {
		System.out.println("name: " + name);
		System.out.println("age: " + age);
		System.out.println("mass: "+mass);
		System.out.println("PT start : " + PTstartdate);
		System.out.println("PT finish : " + PTenddate);
		System.out.println("");
	}
}
