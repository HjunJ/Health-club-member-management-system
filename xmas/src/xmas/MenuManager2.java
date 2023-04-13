package xmas;
import java.util.ArrayList;
import java.util.Scanner;
public class MenuManager2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		ArrayList<MemberInfo> memberList = new ArrayList<MemberInfo>();
		int NumAccept = 0;
		
		while(true) {
			System.out.println("1. Add Member");
			System.out.println("2. Delete Member");
			System.out.println("3. Edit Member");
			System.out.println("4. View Member");
			System.out.println("5. Menu");
			System.out.println("6. Exit");
			int a = input.nextInt();
			 
			if(a == 1) {
				System.out.println("메뉴로 나가시려면 0을, 회원 입력을 계속하시려면 1을 입력하십시오 :");
				NumAccept = input.nextInt();				
				if(NumAccept == 0) continue;
				else if(NumAccept == 1) {
					System.out.println("나이, 이름, 몸무게, PTdate1, PTdate2를 입력하십시오: ");
					System.out.println("0을 입력하시면 메뉴로 나갑니다. ");
					while(true) { 
						int mage = input.nextInt();
						if(mage == 0) break;
						else {	
							String buffer = input.nextLine();
							String mname = input.nextLine();
							double mmass = input.nextDouble();
							int mPTdate1 = input.nextInt();
							int mPTdate2 = input.nextInt();
							memberList.add(new MemberInfo(mname, mage, mmass, mPTdate1, mPTdate2));
							continue;
						
						}
					}
				}
			}		
			else if(a == 2) {
				System.out.println("메뉴로 나가시려면 0을, 회원 정보를 삭제하시려면 1을 입력하십시오 :");
				NumAccept = input.nextInt();
				if(NumAccept == 0) break;
				else if(NumAccept == 1) {
					System.out.println("목록 전체를 삭제하시려면 0, 특정 번호를 삭제하시려면 멤버 번호를 입력하십시오: ");
					int deleteAll = input.nextInt();
					if(deleteAll == 0) {
						memberList.clear();
						continue;
					}
					else {
						memberList.remove(deleteAll-1);
					}
					
					System.out.println("삭제가 완료되었습니다.");
					System.out.println("");
					continue;
				}
			}
			else if(a == 3) {
				
				System.out.println("변경할 회원 번호를 입력하십시오: ");
				int membernum = input.nextInt();
				memberList.remove(membernum-1);
				System.out.println("변경할 회원 정보를 입력하십시오(나이, 이름, 몸무게, PTdate1, PTdate2): ");
				int mage = input.nextInt();
				String buffer = input.nextLine();
				String mname = input.nextLine();
				double mmass = input.nextDouble();
				int mPTdate1 = input.nextInt();
				int mPTdate2 = input.nextInt();
				
				memberList.add(membernum-1, new MemberInfo(mname, mage, mmass, mPTdate1, mPTdate2));
				
				System.out.println(membernum+"번 회원 정보의 변경이 완료되었습니다.");
			}
			else if(a == 4) {
				System.out.println("");
				if(memberList.size() == 0) {
					System.out.println("empty");
					System.out.println("");
					continue;
				}
				
				for(int i = 0; i<memberList.size(); i++) {
					System.out.print("회원 "+(i+1)+": ");
					MemberInfo member = memberList.get(i);
					member.printInfo();
					
				}
				System.out.println("");
			}
			else if(a == 5) {
				continue;
			}
			else if(a == 6) {
				break;
			}
		}
	}
}

