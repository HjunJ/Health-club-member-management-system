package xmas;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
public class MenuManager2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		ArrayList<PtMember> PtmemberList = new ArrayList<PtMember>();
		ArrayList<FreeMember> FreeMemberList = new ArrayList<FreeMember>();
		int NumAccept = 0;
		while(true)  {
			try{
			
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
							try {
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
										if(mmass<20 || mage < 1 || mage > 110 ||mPTdate1<20000000 || mPTdate1 > 21000000 ||mPTdate2 <20000000 || mPTdate2 >21000000 || mPTdate1 > mPTdate2) {
											throw new MyException();
										}
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
										if(mage < 1 || mage > 110 ||mfst<20000000 || mfst > 21000000 ||capable <1 || capable >1000) {
											throw new MyException();
										}
										FreeMemberList.add(new FreeMember(mname, mage, mfst, capable)); //
										System.out.println("등록 완료");
										System.out.println("0과 1 이외의 숫자를 입력하시면 메뉴로 나갑니다. :");
										continue;
								
									}
								}
							}
							
							catch(MyException e) {
								System.out.println("나이 또는 날짜를 올바르게 입력해 주십시오. 메뉴로 돌아갑니다.");
								break;
							}
						}//while문 끝
						continue;
						
					}	
				}		
				else if(a == 2) {
					
					System.out.println("메뉴로 나가시려면 0을, 회원 정보를 삭제하시려면 1을 입력하십시오 :");
					NumAccept = input.nextInt();
					if(NumAccept == 0) continue;
					else if(NumAccept == 1) {
						System.out.println("PT 회원이라면 1을, 일반 회원이라면 0을 입력하십시오: ");
						int freeorpt = input.nextInt();
						if(freeorpt == 1) {
					
							System.out.println("목록 전체를 삭제하시려면 0, 특정 번호를 삭제하시려면 멤버 번호를 입력하십시오: ");
							int deleteAll = input.nextInt();
							if(deleteAll<0) {
								continue;
							}
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
					try {
						System.out.println("PT 회원이라면 1을, 일반 회원이라면 0을 입력하십시오: ");
						int freeorpt = input.nextInt();
						if(freeorpt == 1) {
							System.out.println("변경할 회원 번호를 입력하십시오: ");
							int membernum = input.nextInt();
							
							System.out.println("변경할 회원 정보를 입력하십시오(나이, 이름, 몸무게, PTdate1, PTdate2): ");
							int mage = input.nextInt();
							String buffer = input.nextLine();
							String mname = input.nextLine();
							double mmass = input.nextDouble();
							int mPTstartdate = input.nextInt();
							int mPTenddate = input.nextInt();
							if(mmass < 20 || mage < 1 || mage > 110 || mPTstartdate<20000000 || mPTstartdate > 21000000 ||mPTenddate > 21000000 || mPTenddate < 2000000 || mPTenddate < mPTstartdate) {
								throw new MyException();
							}
							PtmemberList.remove(membernum-1);
							PtmemberList.add(membernum-1, new PtMember(mname, mage, mmass, mPTstartdate, mPTenddate));
					
							System.out.println(membernum+"번 회원 정보의 변경이 완료되었습니다.");
						}
						else if(freeorpt == 0) {
							System.out.println("변경할 회원 번호를 입력하십시오: ");
							int membernum = input.nextInt();
							
							System.out.println("변경할 회원 정보를 입력하십시오(나이, 이름, 이용 시작일, 결제 일수): ");
							int mage = input.nextInt();
							String buffer = input.nextLine();
							String mname = input.nextLine();
							int mfirstdate = input.nextInt();
							int mcapable = input.nextInt();
							if(mage < 1 || mage > 110 ||mfirstdate<20000000 || mfirstdate > 21000000 ||mcapable > 1000 || mcapable < 1) {
								throw new MyException();
							}
							FreeMemberList.remove(membernum-1);
							FreeMemberList.add(membernum-1, new FreeMember(mname, mage, mfirstdate, mcapable));
					
							System.out.println(membernum+"번 회원 정보의 변경이 완료되었습니다.");
						}
					
					}
					catch(MyException e) {
						System.out.println("나이 또는 날짜를 올바르게 입력해주십시오. 메뉴로 돌아갑니다.");
						continue;
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
							System.out.print("회원 "+(i+1)+": \n");
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
							System.out.print("회원 "+(i+1)+": \n");
							FreeMember member = FreeMemberList.get(i);
							member.printInfo();	
						}
					}
				
					else {
						System.out.print("\n=========PT회원=========\n");
						for(int i = 0; i<PtmemberList.size(); i++) {
							System.out.print("회원 "+(i+1)+": \n");
							PtMember member = PtmemberList.get(i);
							member.printInfo();	
						}
						System.out.print("\n=========일반회원=========\n");
						for(int i = 0; i<FreeMemberList.size(); i++) {
							System.out.print("회원 "+(i+1)+": \n");
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
			catch(InputMismatchException e) {
				input.nextLine();
				System.out.println("입력 타입 에러: 메뉴로 돌아갑니다.");
				continue;
			}
			catch(IndexOutOfBoundsException e) {
				System.out.println("선택한 번호의 회원이 존재하지 않습니다. 메뉴로 돌아갑니다.");
				continue;
			}
			
		}
		
	}
}

