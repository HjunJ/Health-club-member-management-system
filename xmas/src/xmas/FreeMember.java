package xmas;

public class FreeMember extends MemberInfo{
	static int qualify = 0;
	
	int firstuse;
	int term;
	int id;
	
	int getId() {
		return id;
	}
	
	int getFirstuse() {
		return firstuse;
	}
	
	int getTerm() {
		return term;
	}
	FreeMember(){
		
	}
	FreeMember(int id,String name, int age, int firstuse, int term){
		this.name = name;
		this.age = age;
		this.firstuse = firstuse;
		this.term = term;
		this.id = id;
	}
	
	public void printInfo() {
		System.out.println("name: " + name);
		System.out.println("age: " + age);
		System.out.println("start date : " + firstuse);
		System.out.println("available : " + term);
		System.out.println("");
	}
	
}
