package xmas;

public class PtMember extends MemberInfo{
	
	int PTstartdate;
	int PTenddate;
	int id;
	
	int getId() {
		return id;
	}
	int getPTstartdate() {
		return PTstartdate;
	}
	int getPTenddate() {
		return PTenddate;
	}
	PtMember(){
	}
	PtMember(int id,String name, int age, double weight, int PTstartdate, int PTenddate){
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.PTstartdate = PTstartdate;
		this.PTenddate = PTenddate;
		this.id = id;
	}
	public void printInfo() {
		System.out.println("name: " + name);
		System.out.println("age: " + age);
		System.out.println("weight: "+weight);
		System.out.println("PT start : " + PTstartdate);
		System.out.println("PT finish : " + PTenddate);
		System.out.println("");
	}
	
	
}
