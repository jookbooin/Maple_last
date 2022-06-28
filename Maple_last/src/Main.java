import java.sql.Savepoint;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import Boss.BlackSlime;
import Boss.BlackWizard;
import Boss.Boss;
import Boss.MolKing;
import Boss.Ravana;
import Character.Luminus;
import Character.Luminus_40;
import NPC.DarkRoad1;
import NPC.GoldTemple;
import NPC.Hainz;
import NPC.Manzi1;
import NPC.Second_Master;
import NPC.Viouwan;
import PhThread.PhantomStory;
import PhThread.Skillend;
import PhThread.Storystart;
import Skillset.Darknight;
import Skillset.DualBlade;
import Skillset.NightLoad;
import Skillset.Paladin;
import Thread.LoadingThread;
import scene.Battle;


public class Main {
	
   static void printSpace() {
	        for (int i = 0; i < 60; i++) {
	            System.out.println("");
	        }
	  	    }
	   
	static void indent() {
		System.out.printf("\n\t\t\t\t\tENTER\n");
		Scanner ch = new Scanner(System.in) ;
				ch.nextLine();
			
			}
	static void sleep_15() {
		
		try {
            Thread.sleep(1500);
        } catch (InterruptedException e) { }
	
	}
	
	static Queue inventory_l = new LinkedList();
//	static Queue inventory_P = new LinkedList();
	
//	static Queue armor = new LinkedList();

	static void save(String input) {
		
		System.out.println(input+"을 획득했습니다.\n");
		
			if(inventory_l.size()<5) 
				inventory_l.offer(input);
				
			
			else System.out.println("인벤토리가 꽉 찼습니다.");
			
		}
	static Queue skill_p = new LinkedList();
	public static void save1(String input) {
		System.out.println(input+"스킬을 획득하였습니다.");
		
//		if (skill_p.size() < 3) {
//			skill_p.offer(input);
//		}
		if (!"".equals(input)) {
			skill_p.offer(input);
		}
		if(skill_p.size() > 3) {
			
			System.out.println("스킬이 꽉찼습니다.");
			skill_p.poll();
		}
	}
	static Scanner input = new Scanner(System.in);
	// 인물 <> 몬스터 ## 인벤 || 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("진행할 캐릭터를 선택 하세요\n(1)Luminus (2)Pantom>>");
		int select =input.nextInt();
		//루미너스
		if(select==1) {
//__________________________________________________________
//     <화면 + 객체>
		Battle battle = new Battle();

	
		Luminus lu = new Luminus();
		Luminus_40 lu_40 = new Luminus_40();
		BlackWizard b = new BlackWizard();
// __________________________________________________________
	
		Start_Story story = new Start_Story();
		
		story.start_story();
		story.birth();
				Thread loading1 = new Thread(new LoadingThread("loading"));
				loading1.start();
				try {
					loading1.join();
				}catch (InterruptedException e) {}
				
		
		
	
		
		
		int num = 0, num1= 1;
		//하인즈 --> 전체적인 개요 (비보에 대한 설명 )
		save("|두루마기|");
		
				Thread Hainz = new Thread(new Hainz());
				Hainz.start();
				 try {
					 Hainz.join();
			        } catch (InterruptedException e) {
			            e.printStackTrace();
			        }
				
				 indent();
				 
				Thread loading2 = new Thread(new LoadingThread("loading"));
				loading2.start();
				try {
					loading2.join();
				}catch (InterruptedException e) {}
				
				
				Thread v1 = new Thread(new Viouwan("start"));
				v1.start();
				try {
					v1.join();
				}catch (InterruptedException e) {}
				
				indent();
		while(true) {
	
		System.out.println("<단계>\n=========================\n 1~10 [페리온]  -> [세레니티]\n10~20 [커닝시티] -> [세레니티]\n"
				+ "20~30 [리에나]  -> [세레니티]\n30~40 [황금사원] -> [세레니티]\n==========================\n\n[현재 레벨 ="+lu.lv+"]\n");
		System.out.println("->어디로 이동하시겠습니까  / (인벤토리 보려면 : i 입니다)   ");

		String world = input.nextLine();
		
			if("페리온".equals(world)) {// 만지 
					
					printSpace();
					Thread p = new Thread(new LoadingThread("Pmove"));
					
					p.start();
					try {
						p.join();
					}catch (InterruptedException e) {}
				
					System.out.println("\n__________[페리온]____________________\n");
					lu.location ="페리온";
		
			
					Thread manzi1 = new Thread(new Manzi1());
					manzi1.start();
					 try {
						 manzi1.join();
				        } catch (InterruptedException e) {
				            e.printStackTrace();
				        }
					 
					indent();
					
					
					save("|태양의 비보|");
					lu.LevelUp();indent();//6
					printSpace();
					System.out.printf("[세레니티]로 가서 <비어만>과 대화하십시오.>>");indent();
	
				
					num1++; //2
					
			}else if("커닝시티".equals(world) && ( lu.lv >= 10)){  
					printSpace();
					Thread c = new Thread(new LoadingThread("Cmove"));
					c.start();
				try {
					c.join();
				}catch (InterruptedException e) {}
				
					System.out.println("\n__________[커닝시티]____________________\n");
					lu.location ="커닝시티";
					
							Thread darkroad1 = new Thread(new DarkRoad1("start1"));
							darkroad1.start();
							 try {
								 darkroad1.join();
						        } catch (InterruptedException e) {
						            e.printStackTrace();
						        }
					 
					indent();
					
							Thread darkroad2 = new Thread(new DarkRoad1("start2"));
							darkroad2.start();
							 try {
								 darkroad2.join();
						        } catch (InterruptedException e) {
						            e.printStackTrace();
						        } 
					 indent();
					BlackSlime bs= new BlackSlime();
					System.out.println("\t#블랙 슬라임#이 나타났습니다 ");
					indent();
		
					System.out.println("*************전투가 시작됩니다.**************************\n");
					Thread b1= new Thread(new LoadingThread("battle"));
					b1.start();
					try {
						b1.join();
					}catch (InterruptedException e) {}
		
					battle.print(lu, bs);	

					lu.LevelUp(4);indent();//14
					
					save("|어둠의 비보|");
					
					lu.LevelUp(3);indent();//17
					printSpace();
					System.out.printf("[세레니티]로 가서 <비어만>과 대화하십시오.>>");indent();
		
					
					num1++;//4
					
			}else if("리에나".equals(world) && ( lu.lv>= 20)) {
				printSpace();
				Thread l = new Thread(new LoadingThread("Lmove"));
					l.start();
				try {
					l.join();
				}catch (InterruptedException e) {}
				
					System.out.println("\n__________[리에나]____________________\n");
					lu.location ="리에나";
					
					System.out.println("\t#몰킹#이 나타났습니다");indent();
					MolKing ml= new MolKing();
					Thread b2= new Thread(new LoadingThread("battle"));
					b2.start();
					try {
						b2.join();
					}catch (InterruptedException e) {}
					
					battle.print(lu,ml);
					
					lu.LevelUp(3);indent();//23
					
					save("|얼음의 비보|");
					lu.LevelUp(3);indent();//26
					printSpace();
					System.out.printf("[세레니티]로 가서 <비어만>과 대화하십시오.>>");indent();
					
					num1++;//6
					
			}else if("황금사원".equals(world) &&(lu.lv >= 30)){
				printSpace();
				Thread h = new Thread(new LoadingThread("Hmove"));
					h.start();
				try {
					h.join();
				}catch (InterruptedException e) {}
				
					System.out.println("\n__________[황금 사원]____________________\n");
					lu.location="황금사원";
					Thread g2 = new Thread(new GoldTemple());
					g2.start();
					try {
							g2.join();
						} catch (InterruptedException e) {
							        	e.printStackTrace();
					    }
				
					Ravana ra= new Ravana();
					System.out.println("\n\n\t#라바나#가 나타났습니다 ");indent();
					
					Thread b3= new Thread(new LoadingThread("battle"));
					b3.start();
					
					try {
						b3.join();
					}catch (InterruptedException e) {}
			
					
					battle.print(lu,ra);
					lu.LevelUp(2);indent();//35
					System.out.printf("|궁극의_비보|을 획득합니다.");indent();
					save("|궁극의_비보|");
					printSpace();
					System.out.printf("[세레니티]로 가서 <비어만>과 대화하십시오.>>");indent();
					
					
					lu.LevelUp();indent();
					
					
					num1++;//8
					
			}else if("i".equals(world)) {
					printSpace();
					LinkedList list = (LinkedList)inventory_l;
					
					final int SIZE = list.size();
					for(int i = 0; i<SIZE;i++)
						System.out.println(i+1+"."+list.get(i));
					System.out.println();
			}else if("도움말 ".equals(world)) {
					
					System.out.println("도움말을 줍니다");
						
			}else if("세레니티".equals(world) && (num1%2==0)) {
				printSpace();
				Thread s = new Thread(new LoadingThread("Smove"));
					s.start();
				try {
					s.join();
				}catch (InterruptedException e) {}
				
						System.out.println("\n__________[세레니티]____________________\n");
						lu.location="세레니티";
				
				if(num== 0) {
						
						
						lu.LevelUp(2);indent();//8		
						System.out.println("[비어완] : |태양의 비보|를 구해오셨군요");indent();
						System.out.println("[비어완] : [커닝시티] 정보상이 보내온 정보에 따르면 다크로드 문은 대대로 오로라에 속해있었다고합니다\n");indent();
						System.out.println("\t그에게 미리 접촉해 [루미너스]님이 간다고 전해놓은 상태입니다.");indent();
					
						lu.LevelUp(2);indent();//8	
						System.out.printf("\n[커닝시티]로 가서 <다크로드>와 대화하십시오.>>");indent();
						lu.LevelUp(2);indent();//10
							}
				
				else if ( num ==1) {
						System.out.println("[비어완] : |어둠의 비보|를 구해오셨군요");indent();
						System.out.println("[비어완] : [리에나]의 리린은 외부인에 매우 적대적인 인물입니다.");indent();
						System.out.println("[비어완] : [리에나]정보원에 의하면  최근 <몰킹>이란 몬스터가 이상한 물건을 획득한 것 같다고 합니다");indent();
						System.out.print("[비어완] : 리린을 만나고오기 보단... <몰킹>만 처리하고 확인해 보고 오는 것이 나을것 같습니다....>>>");indent();
						lu.LevelUp(1);indent();	//18
						System.out.println("[비어만] : 행운을 빕니다....");indent();
						lu.LevelUp(2);indent();//20
				}else if ( num ==2) {
					    System.out.println("[비어완] : 이제 1개 남았군요....");indent();					
						Thread v2 = new Thread(new Viouwan("start2"));
						v2.start();
					try {
						v2.join();
					}catch (InterruptedException e) {};indent();
					
						lu.LevelUp();indent();//30
				}else if( num == 3) {
						
						System.out.println("드디어 비보를 다 모았군요 .....\n");indent();
						lu.LevelUp();
						
						break;
				}	

			num++;num1++; //3 //5 //7
		}else	{ 		printSpace();
						System.out.println("!!!!!!!!!단계를 따라가십시오!!!!!!!!!!!!\n\n"); }
							
		
						}//while
		
		
		printSpace();
		System.out.println("비보들이 빛을 내며 무언가 나옵니다!!! ");
		indent();
		Thread m2 = new Thread(new Second_Master());
		m2.start();
		 try {
			 m2.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
		
//	
////************************************************************************************
//		//던전
//		 
		  System.out.print("검은 마법사와 싸우러 가시겠습니까?[y / else ] >>");
		   String answer= input.next();
				
		   while(true) {
		   System.out.printf("\n모드를 선택하십시오. [1. normal /2. hard ]>>");
		  String answer1 = input.next();
		  if("1".equals(answer1)) {
				if(answer.equalsIgnoreCase("y")) {
				
					System.out.println("");
					printSpace();
					Thread b4 = new Thread(new LoadingThread("battle"));
					b4.start();
					try {
						b4.join();
					}catch (InterruptedException e) {}
					
					printSpace();
					System.out.println("검은마법사가 나타났습니다!!!!!!!!!\n\n\n\n");
					try {
							Thread.sleep(1000);
					}catch(InterruptedException e) {}
					
				lu_40.Dungeon();
				}
				else {
					System.out.println("수고하셨습니다.");
					System.exit(0);
				}
			
		  }
		  else {
			  System.out.println("아직 안만들었습니다. 속도만 빠르게 하면 됩니다.");
		  }
		  
		   }
//***************************************************************************************
//보스 1 2 3  확인용 		
//		lu.LevelUp(14);
//		BlackSlime bs= new BlackSlime();
//		
//		System.out.println("\n\t#블랙 슬라임#이 나타났습니다\n");
//		sleep_15();
//		System.out.println("*************전투가 시작됩니다.**************************\n");
//		Thread b5= new Thread(new LoadingThread("battle"));
//		b5.start();
//		try {
//			b5.join();
//		}catch (InterruptedException e) {}
//		
//		battle.print(lu, bs);
////***************************************************************************************		
//		lu.LevelUp(10);
//		System.out.println("\t#몰킹#이 나타났습니다");indent();
//		MolKing ml= new MolKing();
//		Thread b2= new Thread(new LoadingThread("battle"));
//		b2.start();
//		try {
//			b2.join();
//		}catch (InterruptedException e) {}
//		
//		battle.print(lu,ml);	
////***************************************************************************************	
//		lu.LevelUp(32);
//		Ravana ra= new Ravana();
//		sleep_15();
//		System.out.println("*************전투가 시작됩니다.**************************\n");
//		Thread b6= new Thread(new LoadingThread("battle"));
//		b6.start();
//		try {
//			b6.join();
//		}catch (InterruptedException e) {}
//		
//		battle.print(lu, ra);
//***************************************************************************************
// 던전 
//
		
//***************************************************************************************	

		}
		
		//팬텀
		if(select==2) {
			Thread Storystart = new Thread(new Storystart());
			Storystart.start();
			try {
				Storystart.join();
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			indent();
			Thread PhantomStory = new Thread(new PhantomStory());
			PhantomStory.start();
			try {
				PhantomStory.join();
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			Thread Skillset = new Thread(new PhThread.Skillset());
			Skillset.start();
			try {
				Skillset.join();
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			Scanner input = new Scanner(System.in);
			Darknight d = new Darknight();
			DualBlade b = new DualBlade();
			NightLoad n = new NightLoad();
			Paladin p = new Paladin();
			//		HashSet hash = new HashSet(skill_p);
			//		LinkedList list = new LinkedList(hash);
			// TODO Auto-generated method stub
			LinkedList list = (LinkedList)skill_p;
			while(true) {
			indent();
			System.out.println("팬텀 도움말을 보시려면 help를 눌러주세요");
			String help = input.nextLine();
			if("help".equals(help)) {
				System.out.println("k - 스킬 리스트를 보여줍니다.");
				System.out.println("j - 스킬 리스트를 초기화시켜줍니다.");
			}
			System.out.println("스킬 리스트를 보시려면 k를 눌러주세요");
			String skillset = input.nextLine();
			if("k".equals(skillset)) {
				System.out.println(skill_p);
				System.out.println(list);
//				LinkedList list = (LinkedList)skill_p;
				final int SIZE =  list.size();
				for(int i=0; i<SIZE; i++)
					System.out.println((i+1)+"."+list.get(i));
			}
			System.out.println("스킬을 초기화 하려면 j를 눌러주세요");
			String sk = input.nextLine();
			if("j".equals(sk)) {
				skill_p.clear();
				System.out.println("스킬이 초기화 되었습니다.");
			}
			System.out.println("스킬은 총 3개 훔칠 수 있습니다! \n"
					+ "스킬이 꽉찼을 때 추가하면 처음 넣은거 부터 사라집니다.");
			indent();
			while(true) {
				try {
					if(skill_p.size() == 3) {
						System.out.println("스킬 리스르 종료를 원하시면 exit를 눌러주세요\n"
								+ "Enter누르고 exit 입력해주세요"
								+ "스킬을 바꾸시려면 Enter를 눌러주세요.");
						indent();
						String exit = input.nextLine();
						if("exit".equals(exit)) {
							Thread Skillend = new Thread(new Skillend());
							Skillend.start();
							try {
								Skillend.join();
							}catch (InterruptedException e) {
								e.printStackTrace();
							}
							break;
							// Thread로 게임 종료 문구 알리기 
						}
					}
				System.out.println("어떤 계열의 스킬을 훔치시겠습니까?\n"
						+ "1. 전사\t 2. 도적\n");
				String job = input.nextLine();
				if("1".equals(job)) {
					indent();
					System.out.println("어떤 직업을 훔치시겠습니까?\n1.다크나이트 \t2.팔라딘\n");
					String job1 = input.nextLine();
					System.out.println("Enter를 눌러 훔칠 스킬을 확인 하세요.");
					indent();
					if ("1".equals(job1)) {
						System.out.println("어떤 스킬을 가져오시겠습니까?\n"
								+ "1. " + d.skill1 + " 2. "+d.skill2 + " 3. " + d.skill3) ;
						String skill = input.nextLine();
						if("1".equals(skill)) {
							save1(d.skill1);
							indent();
							continue;
						}
						if("2".equals(skill)) {
							save1(d.skill2);
							indent();
							continue;
						}
						if("3".equals(skill)) {
							save1(d.skill3);
							indent();
							continue;
						}
					}
					if ("2".equals(job1)) {
						System.out.println("어떤 스킬을 가져오시겠습니까?\n"
								+ "1. " + p.skill1 + " 2. "+p.skill2 + " 3. " + p.skill3) ;
						String skill = input.nextLine();
						if("1".equals(skill)) {
							save1(p.skill1);
							indent();
							continue;
						}
						if("2".equals(skill)) {
							save1(p.skill2);
							indent();
							continue;
						}
						if("3".equals(skill)) {
							save1(p.skill3);
							indent();
							continue;
						}
					}

				}
				if("2".equals(job)) {
					System.out.println("어떤 직업을 훔치시겠습니까?\n1.나이트로드 \t2.듀얼블레이드\n");
					String job1 = input.nextLine();
					System.out.println("Enter를 눌러 훔칠 스킬을 확인 하세요.");
					indent();
					if ("1".equals(job1)) {
						System.out.println("어떤 스킬을 가져오시겠습니까?\n"
								+ "1. " + n.skill1 + " 2. "+n.skill2 + " 3. " + n.skill3) ;
						String skill = input.nextLine();
						if("1".equals(skill)) {
							save1(n.skill1);
							indent();
							continue;
						}
						if("2".equals(skill)) {
							save1(n.skill2);
							indent();
							continue;
						}
						if("3".equals(skill)) {
							save1(n.skill3);
							indent();
							continue;
						}
					}
					if ("2".equals(job1)) {
						System.out.println("어떤 스킬을 가져오시겠습니까?\n"
								+ "1. " + b.skill1 + " 2. "+b.skill2 + " 3. " + b.skill3) ;
						String skill = input.nextLine();
						if("1".equals(skill)) {
							save1(b.skill1);
							indent();
							continue;
						}
						if("2".equals(skill)) {
							save1(b.skill2);
							indent();
							continue;
						}
						if("3".equals(skill)) {
							save1(b.skill3);
							indent();
							continue;
						}
					}
				}
			
			
			}catch(Exception e) {
				System.out.println("입력 오류!");
			}
		}
		}
		}
				}//main
		}//class
