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
		
		System.out.println(input+"�� ȹ���߽��ϴ�.\n");
		
			if(inventory_l.size()<5) 
				inventory_l.offer(input);
				
			
			else System.out.println("�κ��丮�� �� á���ϴ�.");
			
		}
	static Queue skill_p = new LinkedList();
	public static void save1(String input) {
		System.out.println(input+"��ų�� ȹ���Ͽ����ϴ�.");
		
//		if (skill_p.size() < 3) {
//			skill_p.offer(input);
//		}
		if (!"".equals(input)) {
			skill_p.offer(input);
		}
		if(skill_p.size() > 3) {
			
			System.out.println("��ų�� ��á���ϴ�.");
			skill_p.poll();
		}
	}
	static Scanner input = new Scanner(System.in);
	// �ι� <> ���� ## �κ� || 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������ ĳ���͸� ���� �ϼ���\n(1)Luminus (2)Pantom>>");
		int select =input.nextInt();
		//��̳ʽ�
		if(select==1) {
//__________________________________________________________
//     <ȭ�� + ��ü>
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
		//������ --> ��ü���� ���� (�񺸿� ���� ���� )
		save("|�η縶��|");
		
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
	
		System.out.println("<�ܰ�>\n=========================\n 1~10 [�丮��]  -> [������Ƽ]\n10~20 [Ŀ�׽�Ƽ] -> [������Ƽ]\n"
				+ "20~30 [������]  -> [������Ƽ]\n30~40 [Ȳ�ݻ��] -> [������Ƽ]\n==========================\n\n[���� ���� ="+lu.lv+"]\n");
		System.out.println("->���� �̵��Ͻðڽ��ϱ�  / (�κ��丮 ������ : i �Դϴ�)   ");

		String world = input.nextLine();
		
			if("�丮��".equals(world)) {// ���� 
					
					printSpace();
					Thread p = new Thread(new LoadingThread("Pmove"));
					
					p.start();
					try {
						p.join();
					}catch (InterruptedException e) {}
				
					System.out.println("\n__________[�丮��]____________________\n");
					lu.location ="�丮��";
		
			
					Thread manzi1 = new Thread(new Manzi1());
					manzi1.start();
					 try {
						 manzi1.join();
				        } catch (InterruptedException e) {
				            e.printStackTrace();
				        }
					 
					indent();
					
					
					save("|�¾��� ��|");
					lu.LevelUp();indent();//6
					printSpace();
					System.out.printf("[������Ƽ]�� ���� <��>�� ��ȭ�Ͻʽÿ�.>>");indent();
	
				
					num1++; //2
					
			}else if("Ŀ�׽�Ƽ".equals(world) && ( lu.lv >= 10)){  
					printSpace();
					Thread c = new Thread(new LoadingThread("Cmove"));
					c.start();
				try {
					c.join();
				}catch (InterruptedException e) {}
				
					System.out.println("\n__________[Ŀ�׽�Ƽ]____________________\n");
					lu.location ="Ŀ�׽�Ƽ";
					
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
					System.out.println("\t#�� ������#�� ��Ÿ�����ϴ� ");
					indent();
		
					System.out.println("*************������ ���۵˴ϴ�.**************************\n");
					Thread b1= new Thread(new LoadingThread("battle"));
					b1.start();
					try {
						b1.join();
					}catch (InterruptedException e) {}
		
					battle.print(lu, bs);	

					lu.LevelUp(4);indent();//14
					
					save("|����� ��|");
					
					lu.LevelUp(3);indent();//17
					printSpace();
					System.out.printf("[������Ƽ]�� ���� <��>�� ��ȭ�Ͻʽÿ�.>>");indent();
		
					
					num1++;//4
					
			}else if("������".equals(world) && ( lu.lv>= 20)) {
				printSpace();
				Thread l = new Thread(new LoadingThread("Lmove"));
					l.start();
				try {
					l.join();
				}catch (InterruptedException e) {}
				
					System.out.println("\n__________[������]____________________\n");
					lu.location ="������";
					
					System.out.println("\t#��ŷ#�� ��Ÿ�����ϴ�");indent();
					MolKing ml= new MolKing();
					Thread b2= new Thread(new LoadingThread("battle"));
					b2.start();
					try {
						b2.join();
					}catch (InterruptedException e) {}
					
					battle.print(lu,ml);
					
					lu.LevelUp(3);indent();//23
					
					save("|������ ��|");
					lu.LevelUp(3);indent();//26
					printSpace();
					System.out.printf("[������Ƽ]�� ���� <��>�� ��ȭ�Ͻʽÿ�.>>");indent();
					
					num1++;//6
					
			}else if("Ȳ�ݻ��".equals(world) &&(lu.lv >= 30)){
				printSpace();
				Thread h = new Thread(new LoadingThread("Hmove"));
					h.start();
				try {
					h.join();
				}catch (InterruptedException e) {}
				
					System.out.println("\n__________[Ȳ�� ���]____________________\n");
					lu.location="Ȳ�ݻ��";
					Thread g2 = new Thread(new GoldTemple());
					g2.start();
					try {
							g2.join();
						} catch (InterruptedException e) {
							        	e.printStackTrace();
					    }
				
					Ravana ra= new Ravana();
					System.out.println("\n\n\t#��ٳ�#�� ��Ÿ�����ϴ� ");indent();
					
					Thread b3= new Thread(new LoadingThread("battle"));
					b3.start();
					
					try {
						b3.join();
					}catch (InterruptedException e) {}
			
					
					battle.print(lu,ra);
					lu.LevelUp(2);indent();//35
					System.out.printf("|�ñ���_��|�� ȹ���մϴ�.");indent();
					save("|�ñ���_��|");
					printSpace();
					System.out.printf("[������Ƽ]�� ���� <��>�� ��ȭ�Ͻʽÿ�.>>");indent();
					
					
					lu.LevelUp();indent();
					
					
					num1++;//8
					
			}else if("i".equals(world)) {
					printSpace();
					LinkedList list = (LinkedList)inventory_l;
					
					final int SIZE = list.size();
					for(int i = 0; i<SIZE;i++)
						System.out.println(i+1+"."+list.get(i));
					System.out.println();
			}else if("���� ".equals(world)) {
					
					System.out.println("������ �ݴϴ�");
						
			}else if("������Ƽ".equals(world) && (num1%2==0)) {
				printSpace();
				Thread s = new Thread(new LoadingThread("Smove"));
					s.start();
				try {
					s.join();
				}catch (InterruptedException e) {}
				
						System.out.println("\n__________[������Ƽ]____________________\n");
						lu.location="������Ƽ";
				
				if(num== 0) {
						
						
						lu.LevelUp(2);indent();//8		
						System.out.println("[����] : |�¾��� ��|�� ���ؿ��̱���");indent();
						System.out.println("[����] : [Ŀ�׽�Ƽ] �������� ������ ������ ������ ��ũ�ε� ���� ���� ���ζ� �����־��ٰ��մϴ�\n");indent();
						System.out.println("\t�׿��� �̸� ������ [��̳ʽ�]���� ���ٰ� ���س��� �����Դϴ�.");indent();
					
						lu.LevelUp(2);indent();//8	
						System.out.printf("\n[Ŀ�׽�Ƽ]�� ���� <��ũ�ε�>�� ��ȭ�Ͻʽÿ�.>>");indent();
						lu.LevelUp(2);indent();//10
							}
				
				else if ( num ==1) {
						System.out.println("[����] : |����� ��|�� ���ؿ��̱���");indent();
						System.out.println("[����] : [������]�� ������ �ܺ��ο� �ſ� �������� �ι��Դϴ�.");indent();
						System.out.println("[����] : [������]�������� ���ϸ�  �ֱ� <��ŷ>�̶� ���Ͱ� �̻��� ������ ȹ���� �� ���ٰ� �մϴ�");indent();
						System.out.print("[����] : ������ ��������� ����... <��ŷ>�� ó���ϰ� Ȯ���� ���� ���� ���� ������ �����ϴ�....>>>");indent();
						lu.LevelUp(1);indent();	//18
						System.out.println("[��] : ����� ���ϴ�....");indent();
						lu.LevelUp(2);indent();//20
				}else if ( num ==2) {
					    System.out.println("[����] : ���� 1�� ���ұ���....");indent();					
						Thread v2 = new Thread(new Viouwan("start2"));
						v2.start();
					try {
						v2.join();
					}catch (InterruptedException e) {};indent();
					
						lu.LevelUp();indent();//30
				}else if( num == 3) {
						
						System.out.println("���� �񺸸� �� ��ұ��� .....\n");indent();
						lu.LevelUp();
						
						break;
				}	

			num++;num1++; //3 //5 //7
		}else	{ 		printSpace();
						System.out.println("!!!!!!!!!�ܰ踦 ���󰡽ʽÿ�!!!!!!!!!!!!\n\n"); }
							
		
						}//while
		
		
		printSpace();
		System.out.println("�񺸵��� ���� ���� ���� ���ɴϴ�!!! ");
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
//		//����
//		 
		  System.out.print("���� ������� �ο췯 ���ðڽ��ϱ�?[y / else ] >>");
		   String answer= input.next();
				
		   while(true) {
		   System.out.printf("\n��带 �����Ͻʽÿ�. [1. normal /2. hard ]>>");
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
					System.out.println("���������簡 ��Ÿ�����ϴ�!!!!!!!!!\n\n\n\n");
					try {
							Thread.sleep(1000);
					}catch(InterruptedException e) {}
					
				lu_40.Dungeon();
				}
				else {
					System.out.println("�����ϼ̽��ϴ�.");
					System.exit(0);
				}
			
		  }
		  else {
			  System.out.println("���� �ȸ�������ϴ�. �ӵ��� ������ �ϸ� �˴ϴ�.");
		  }
		  
		   }
//***************************************************************************************
//���� 1 2 3  Ȯ�ο� 		
//		lu.LevelUp(14);
//		BlackSlime bs= new BlackSlime();
//		
//		System.out.println("\n\t#�� ������#�� ��Ÿ�����ϴ�\n");
//		sleep_15();
//		System.out.println("*************������ ���۵˴ϴ�.**************************\n");
//		Thread b5= new Thread(new LoadingThread("battle"));
//		b5.start();
//		try {
//			b5.join();
//		}catch (InterruptedException e) {}
//		
//		battle.print(lu, bs);
////***************************************************************************************		
//		lu.LevelUp(10);
//		System.out.println("\t#��ŷ#�� ��Ÿ�����ϴ�");indent();
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
//		System.out.println("*************������ ���۵˴ϴ�.**************************\n");
//		Thread b6= new Thread(new LoadingThread("battle"));
//		b6.start();
//		try {
//			b6.join();
//		}catch (InterruptedException e) {}
//		
//		battle.print(lu, ra);
//***************************************************************************************
// ���� 
//
		
//***************************************************************************************	

		}
		
		//����
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
			System.out.println("���� ������ ���÷��� help�� �����ּ���");
			String help = input.nextLine();
			if("help".equals(help)) {
				System.out.println("k - ��ų ����Ʈ�� �����ݴϴ�.");
				System.out.println("j - ��ų ����Ʈ�� �ʱ�ȭ�����ݴϴ�.");
			}
			System.out.println("��ų ����Ʈ�� ���÷��� k�� �����ּ���");
			String skillset = input.nextLine();
			if("k".equals(skillset)) {
				System.out.println(skill_p);
				System.out.println(list);
//				LinkedList list = (LinkedList)skill_p;
				final int SIZE =  list.size();
				for(int i=0; i<SIZE; i++)
					System.out.println((i+1)+"."+list.get(i));
			}
			System.out.println("��ų�� �ʱ�ȭ �Ϸ��� j�� �����ּ���");
			String sk = input.nextLine();
			if("j".equals(sk)) {
				skill_p.clear();
				System.out.println("��ų�� �ʱ�ȭ �Ǿ����ϴ�.");
			}
			System.out.println("��ų�� �� 3�� ��ĥ �� �ֽ��ϴ�! \n"
					+ "��ų�� ��á�� �� �߰��ϸ� ó�� ������ ���� ������ϴ�.");
			indent();
			while(true) {
				try {
					if(skill_p.size() == 3) {
						System.out.println("��ų ������ ���Ḧ ���Ͻø� exit�� �����ּ���\n"
								+ "Enter������ exit �Է����ּ���"
								+ "��ų�� �ٲٽ÷��� Enter�� �����ּ���.");
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
							// Thread�� ���� ���� ���� �˸��� 
						}
					}
				System.out.println("� �迭�� ��ų�� ��ġ�ðڽ��ϱ�?\n"
						+ "1. ����\t 2. ����\n");
				String job = input.nextLine();
				if("1".equals(job)) {
					indent();
					System.out.println("� ������ ��ġ�ðڽ��ϱ�?\n1.��ũ����Ʈ \t2.�ȶ��\n");
					String job1 = input.nextLine();
					System.out.println("Enter�� ���� ��ĥ ��ų�� Ȯ�� �ϼ���.");
					indent();
					if ("1".equals(job1)) {
						System.out.println("� ��ų�� �������ðڽ��ϱ�?\n"
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
						System.out.println("� ��ų�� �������ðڽ��ϱ�?\n"
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
					System.out.println("� ������ ��ġ�ðڽ��ϱ�?\n1.����Ʈ�ε� \t2.�����̵�\n");
					String job1 = input.nextLine();
					System.out.println("Enter�� ���� ��ĥ ��ų�� Ȯ�� �ϼ���.");
					indent();
					if ("1".equals(job1)) {
						System.out.println("� ��ų�� �������ðڽ��ϱ�?\n"
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
						System.out.println("� ��ų�� �������ðڽ��ϱ�?\n"
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
				System.out.println("�Է� ����!");
			}
		}
		}
		}
				}//main
		}//class
