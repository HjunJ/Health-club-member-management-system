package xmas;
import java.util.ArrayList;
import java.util.Scanner;
public class MenuManager2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		ArrayList<PtMember> PtmemberList = new ArrayList<PtMember>();
		ArrayList<FreeMember> FreeMemberList = new ArrayList<FreeMember>();
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
					while(true){
						System.out.println("PT 회원이라면 1을, 자유 이용 회원이라면 0을 입력해주십시오: ");//
						int freeorpt = input.nextInt();//
						if(freeorpt != 0 && freeorpt != 1) break;
						if(freeorpt == 1) {//
					
							System.out.println("나이, 이름, 몸무게, PTstart date, PTend date를 입력하십시오: ");
							System.out.println("0을 입력하시면 메뉴로 나갑니다. ");
						  
							int mage = input.nextInt();
							if(mage == 0) break;
							else {	
								String buffer = input.nextLine();
								String mname = input.nextLine();
								double mmass = input.nextDouble();
								int mPTdate1 = input.nextInt();
								int mPTdate2 = input.nextInt();
								PtmemberList.add(new PtMember(mname, mage, mmass, mPTdate1, mPTdate2)); //
								System.out.println("등록 완료");
								System.out.println("0과 1 이외의 숫자를 입력하시면 메뉴로 나갑니다. :");
								continue;
						
							}
						}
						else if(freeorpt == 0) {//
							System.out.println("나이, 이름, 이용 시작일, 결제 일수를 입력하십시오: ");
							System.out.println("0을 입력하시면 메뉴로 나갑니다. ");
							  
							int mage = input.nextInt();
							if(mage == 0) break;
							else {	
								String buffer = input.nextLine();
								String mname = input.nextLine();
								int mfst = input.nextInt();
								int capable = input.nextInt();
								FreeMemberList.add(new FreeMember(mname, mage, mfst, capable)); //
								System.out.println("등록 완료");
								System.out.println("0과 1 이외의 숫자를 입력하시면 메뉴로 나갑니다. :");
								continue;
							
							}
						}
					}
				}	
			}		
			else if(a == 2) {
				
				System.out.println("메뉴로 나가시려면 0을, 회원 정보를 삭제하시려면 1을 입력하십시오 :");
				NumAccept = input.nextInt();
				if(NumAccept == 0) break;
				else if(NumAccept == 1) {
					System.out.println("PT 회원이라면 1을, 일반 회원이라면 0을 입력하십시오: ");
					int freeorpt = input.nextInt();
					if(freeorpt == 1) {
					
						System.out.println("목록 전체를 삭제하시려면 0, 특정 번호를 삭제하시려면 멤버 번호를 입력하십시오: ");
						int deleteAll = input.nextInt();
						if(deleteAll == 0) {
							PtmemberList.clear();
							continue;
						}
						else {
							PtmemberList.remove(deleteAll-1);
						}
					}
					else if(freeorpt == 0) {//
						System.out.println("목록 전체를 삭제하시려면 0, 특정 번호를 삭제하시려면 멤버 번호를 입력하십시오: ");
						int deleteAll = input.nextInt();
						if(deleteAll == 0) {
							FreeMemberList.clear();
							continue;
						}
						else {
							FreeMemberList.remove(deleteAll-1);
						}
					}//
					System.out.println("삭제가 완료되었습니다.");
					System.out.println("");
					continue;
				}
			}
			else if(a == 3) {
				System.out.println("PT 회원이라면 1을, 일반 회원이라면 0을 입력하십시오: ");
				int freeorpt = input.nextInt();
				if(freeorpt == 1) {
					System.out.println("변경할 회원 번호를 입력하십시오: ");
					int membernum = input.nextInt();
					PtmemberList.remove(membernum-1);
					System.out.println("변경할 회원 정보를 입력하십시오(나이, 이름, 몸무게, PTdate1, PTdate2): ");
					int mage = input.nextInt();
					String buffer = input.nextLine();
					String mname = input.nextLine();
					double mmass = input.nextDouble();
					int mPTstartdate = input.nextInt();
					int mPTenddate = input.nextInt();
				
					PtmemberList.add(membernum-1, new PtMember(mname, mage, mmass, mPTstartdate, mPTenddate));
				
					System.out.println(membernum+"번 회원 정보의 변경이 완료되었습니다.");
				}
				else if(freeorpt == 0) {
					System.out.println("변경할 회원 번호를 입력하십시오: ");
					int membernum = input.nextInt();
					FreeMemberList.remove(membernum-1);
					System.out.println("변경할 회원 정보를 입력하십시오(나이, 이름, 이용 시작일, 결제 일수): ");
					int mage = input.nextInt();
					String buffer = input.nextLine();
					String mname = input.nextLine();
					int mfirstdate = input.nextInt();
					int mcapable = input.nextInt();
				
					FreeMemberList.add(membernum-1, new FreeMember(mname, mage, mfirstdate, mcapable));
				
					System.out.println(membernum+"번 회원 정보의 변경이 완료되었습니다.");
				}
			}
			else if(a == 4) {
				System.out.println("");
				if(PtmemberList.size() == 0 && FreeMemberList.size() == 0) {
					System.out.println("현재 회원 정보가 없습니다.");
					System.out.println("");
					continue;
				}
				if(PtmemberList.size() != 0 && FreeMemberList.size() == 0) {
					System.out.print("\n=========PT회원=========\n");
					for(int i = 0; i<PtmemberList.size(); i++) {
						System.out.print("회원 "+(i+1)+": ");
						PtMember member = PtmemberList.get(i);
						member.printInfo();	
					}
					System.out.print("\n=========일반회원=========\n");
					System.out.println("현재 일반 회원 정보가 없습니다.");
				}
				else if(PtmemberList.size() == 0 && FreeMemberList.size() != 0) {
					System.out.print("\n=========PT회원=========\n");
					System.out.println("현재 PT 회원 정보가 없습니다.");
					System.out.print("\n=========일반회원=========\n");
					for(int i = 0; i<FreeMemberList.size(); i++) {
						System.out.print("회원 "+(i+1)+": ");
						FreeMember member = FreeMemberList.get(i);
						member.printInfo();	
					}
				}
				
				else {
					System.out.print("\n=========PT회원=========\n");
					for(int i = 0; i<PtmemberList.size(); i++) {
						System.out.print("회원 "+(i+1)+": ");
						PtMember member = PtmemberList.get(i);
						member.printInfo();	
					}
					System.out.print("\n=========일반회원=========\n");
					for(int i = 0; i<FreeMemberList.size(); i++) {
						System.out.print("회원 "+(i+1)+": ");
						FreeMember member = FreeMemberList.get(i);
						member.printInfo();	
					}
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

