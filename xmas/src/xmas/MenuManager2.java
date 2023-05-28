package xmas;
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.time.*;
public class MenuManager2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		
		ArrayList<PtMember> PtmemberList = new ArrayList<PtMember>();
		ArrayList<FreeMember> FreeMemberList = new ArrayList<FreeMember>();
		SimpleDateFormat form = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		int NumAccept = 0;
		
		while(true)  {
			try{
				
				
				FileOutputStream fos = new FileOutputStream("LogFile.txt", true);
				Date d1 = new Date();
				String str1 = form.format(d1) + "	" + "Show Menu\n";
				fos.write(str1.getBytes());
				
			
				System.out.println("1. Add Member");
				System.out.println("2. Delete Member");
				System.out.println("3. Edit Member");
				System.out.println("4. View Member");
				System.out.println("5. Menu");
				System.out.println("6. Exit");
				int a = input.nextInt();
			
				if(a == 1) {
					Date menu1date = new Date();
					String menu1String = form.format(menu1date) + "	Menu 1\n";
					fos.write(menu1String.getBytes());				
					
					
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
									
									Date menu1PT = new Date();
									String menu1PTstr = form.format(menu1PT) + "	Menu1 : Add PT member\n";
									fos.write(menu1PTstr.getBytes());
									
									
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
										
										Date menu1PTmemb = new Date();
										String menu1PTmembinfo = form.format(menu1PTmemb) + "	Member Added: "+"\n||name: " + mname + "\n||age: " + mage + "\n||mass: " + mmass + "\n||PT start date: " + mPTdate1 + "\n||PT end date: " + mPTdate2+"\n";
										fos.write(menu1PTmembinfo.getBytes());
										
										System.out.println("등록 완료");
										System.out.println("0과 1 이외의 숫자를 입력하시면 메뉴로 나갑니다. :");
										continue;
							
									}
								}
								else if(freeorpt == 0) {//
									
									Date menu1FR = new Date();
									String menu1FRstr = form.format(menu1FR) + "	Menu1 : Add Free member\n";
									fos.write(menu1FRstr.getBytes());
									
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
										
										Date menu1FRmemb = new Date();
										String menu1FRmembinfo = form.format(menu1FRmemb) + "	Member Added: "+ "\n||name: " + mname + "\n||age: " + mage + "\n||Start date: " + mfst + "\n||Available: " + capable+" days\n";
										fos.write(menu1FRmembinfo.getBytes());
										
										System.out.println("등록 완료");
										System.out.println("0과 1 이외의 숫자를 입력하시면 메뉴로 나갑니다. :");
										continue;
								
									}
								}
							}
							
							catch(MyException e) {
								
								Date menu1Err = new Date();
								String menu1Errstr = form.format(menu1Err) + "	Invalid Input\n";
								fos.write(menu1Errstr.getBytes());
								
								System.out.println("나이 또는 날짜를 올바르게 입력해 주십시오. 메뉴로 돌아갑니다.");
								break;
							}
						}//while문 끝
						continue;
						
					}	
				}		
				else if(a == 2) {
					
					Date menu2 = new Date();
					String menu2str = form.format(menu2) + "	Menu 2\n";
					fos.write(menu2str.getBytes());
					
					System.out.println("메뉴로 나가시려면 0을, 회원 정보를 삭제하시려면 1을 입력하십시오 :");
					NumAccept = input.nextInt();
					if(NumAccept == 0) continue;
					else if(NumAccept == 1) {
						System.out.println("PT 회원이라면 1을, 일반 회원이라면 0을 입력하십시오: ");
						int freeorpt = input.nextInt();
						if(freeorpt == 1) {
							
							Date menu2PT = new Date();
							String menu2PTstr = form.format(menu2PT) + "	Menu 2: Delete PT member\n";
							fos.write(menu2PTstr.getBytes());
							
							System.out.println("목록 전체를 삭제하시려면 0, 특정 번호를 삭제하시려면 멤버 번호를 입력하십시오: ");
							int deleteAll = input.nextInt();
							if(deleteAll<0) {
								continue;
							}
							if(deleteAll == 0) {
								Date menu2PTDelall = new Date();
								String menu2PTDelallstr = form.format(menu2PTDelall) + "	Deleted all PT member\n";
								fos.write(menu2PTDelallstr.getBytes());
								
								PtmemberList.clear();
								continue;
							}
							else {
								Date menu2PTDelnum = new Date();
								String menu2PTDelnumstr = form.format(menu2PTDelnum) + "	Deleted PT member " + deleteAll + "\n";
								fos.write(menu2PTDelnumstr.getBytes());
								PtmemberList.remove(deleteAll-1);
							}
						}
						else if(freeorpt == 0) {//
							
							Date menu2FR = new Date();
							String menu2FRstr = form.format(menu2FR) + "	Menu 2: Delete Free member\n";
							fos.write(menu2FRstr.getBytes());
							
							System.out.println("목록 전체를 삭제하시려면 0, 특정 번호를 삭제하시려면 멤버 번호를 입력하십시오: ");
							int deleteAll = input.nextInt();
							if(deleteAll == 0) {
								
								Date menu2FRDelall = new Date();
								String menu2FRDelallstr = form.format(menu2FRDelall) + "	Deleted all Free member\n";
								fos.write(menu2FRDelallstr.getBytes());
								
								FreeMemberList.clear();
								continue;
							}
							else {
								
								Date menu2FRDelnum = new Date();
								String menu2FRDelnumstr = form.format(menu2FRDelnum) + "	Deleted Free member " + deleteAll + "\n";
								fos.write(menu2FRDelnumstr.getBytes());
								
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
						
						Date menu3 = new Date();
						String menu3str = form.format(menu3) + "	Menu 3\n";
						fos.write(menu3str.getBytes());
						
						System.out.println("PT 회원이라면 1을, 일반 회원이라면 0을 입력하십시오: ");
						int freeorpt = input.nextInt();
						if(freeorpt == 1) {
							
							Date menu3PT = new Date();
							String menu3PTstr = form.format(menu3PT) + "	Menu 3: Edit PT member\n";
							fos.write(menu3PTstr.getBytes());
							
							System.out.println("변경할 회원 번호를 입력하십시오: ");
							int membernum = input.nextInt();
							if(membernum > PtmemberList.size() || membernum < 1) {
								throw new IndexOutOfBoundsException();
							}
							
							Date menu3PTmembnum = new Date();
							String menu3PTmembnumstr = form.format(menu3PTmembnum) + "	Selected PT member: " + membernum + "\n";
							fos.write(menu3PTmembnumstr.getBytes());
							
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
							
							Date menu3PTmemb = new Date();
							String menu3PTmembinfo = form.format(menu3PTmemb) + "	Member Edited: "+ "\n||name: " + mname + "\n||age: " + mage + "\n||mass: "+ mmass + "\n||PT start date: " + mPTstartdate + "\n||PT end date: " + mPTenddate;
							fos.write(menu3PTmembinfo.getBytes());
					
							System.out.println(membernum+"번 회원 정보의 변경이 완료되었습니다.");
						}
						else if(freeorpt == 0) {
							
							Date menu3FR = new Date();
							String menu3FRstr = form.format(menu3FR) + "	Menu 3: Edit Free member\n";
							fos.write(menu3FRstr.getBytes());
							
							System.out.println("변경할 회원 번호를 입력하십시오: ");
							int membernum = input.nextInt();
							if(membernum > PtmemberList.size() || membernum < 1) {
								throw new IndexOutOfBoundsException();
							}
							
							Date menu3FRmembnum = new Date();
							String menu3FRmembnumstr = form.format(menu3FRmembnum) + "	Selected FR member: " + membernum + "\n";
							fos.write(menu3FRmembnumstr.getBytes());
							
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
							
							Date menu3FRmemb = new Date();
							String menu3FRmembinfo = form.format(menu3FRmemb) + "	Member Edited: " + "\n||name: " + mname + "\n||age: " + mage + "\n||Start date: " + mfirstdate + "\n||Available: " + mcapable+" days\n";
							fos.write(menu3FRmembinfo.getBytes());
					
							System.out.println(membernum+"번 회원 정보의 변경이 완료되었습니다.");
						}
					
					}
					catch(MyException e) {
						
						Date menu3Err = new Date();
						String menu3Errstr = form.format(menu3Err) + "	Invalid Input\n";
						fos.write(menu3Errstr.getBytes());
						
						System.out.println("나이 또는 날짜를 올바르게 입력해주십시오. 메뉴로 돌아갑니다.");
						continue;
					}
					
				}
				else if(a == 4) {
					
					Date menu4 = new Date();
					String menu4str = form.format(menu4) + "	Menu 4: View Members\n";
					fos.write(menu4str.getBytes());
					
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
					Date menu6 = new Date();
					String menu6str = form.format(menu6) + "	Finish\n";
					fos.write(menu6str.getBytes());
					break;
				} //while 끝
				fos.close();
				
				

			}
			catch(InputMismatchException e) {
				input.nextLine();
				System.out.println("입력 타입 에러: 메뉴로 돌아갑니다.");
				continue;
			}
			catch(IndexOutOfBoundsException e) {
				System.out.println("선택한 번호의 회원이 존재하지 않습니다. 메뉴로 돌아갑니다.");
				continue;
			}catch(FileNotFoundException e) {
				e.printStackTrace();
				continue;
			}catch(IOException e) {
				e.printStackTrace();
				continue;
			} 
			
		}
		
	}
}

