package Character;

import java.util.Scanner;

import Boss.BlackWizard;
import Boss.Boss;
import Thread.SkillEffectThread;

public class Luminus_40 extends Character  {

private int mp;
	
	public int MAX_Hp() {
		return 1000+400*(lv-1);
	}
	public Luminus_40 (){
		this(45,1000+400*(45-1),500+200*45,120+100*40,"�ð��� ����");
	}
	public Luminus_40 (int lv) {
		this(lv ,1000+400*(lv-1),500+200*lv,120+100*lv,"�ð��� ����");
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "��̳ʽ�";
	}
	
	 Luminus_40(int lv, int hp ,int strength, int defence, String location){
			super(lv,hp, strength,defence,location);
	}
	 	
	public void LevelUp(){
		lv+=5;
		setHp(getHp()+400*5);
		setStrength(getStrength()+200*5);
		setDefence(getDefence()+100*5);
		System.out.printf(lv+"Lv�� �Ǿ����ϴ�.");
		try {
			Thread.sleep(500);
		}catch(InterruptedException e) {}
	}
	public void LevelUp(int n) {
		lv +=n;
		hp +=400*n;
		strength+=200*n;
		defence +=50*n ;
		System.out.printf( "Lv "+n+" �ö� "+lv+"Lv�� �Ǿ����ϴ�.\n");
		
	
		try {
			Thread.sleep(500);
		}catch(InterruptedException e) {}
		
	}
	
	
//	public double getMp() {
//		return mp;
//	}
//	public void setMp(int mp) {
//		this.mp = mp;
//	}
	
	
	
	public void attack(BlackWizard boss) {
	
		 hyperAttack_1();

		System.out.println(getName()+" "+boss.getName()+"�� "+getStrength()+"������");
		boss.setHp(boss.getHp()-this.getStrength());
		
	}
	
	public void heal() {
		int max_h = MAX_Hp();
		int hsize =(int)(max_h*0.4);
		int tmp = getHp();
		
		System.out.println("===================================================");
		System.out.println("                                                   ");
		System.out.println("  H     H     EEEEEEE         A         LL         ");
		System.out.println("  H     H     E	             A A        LL         ");
		System.out.println("  H     H     E	            A   A       LL         ");
		System.out.println("  HHHHHHH     EEEEEEE      AAAAAAA      LL         ");
		System.out.println("  H     H     E	          AA     AA     LL         ");
		System.out.println("  H     N     E	         A         A    LL         ");
		System.out.println("  H     N     EEEEEEE   A           A   LLLLLLLLL  "); 
		System.out.println("                                                   ");
		System.out.println("===================================================");
		
		
		if(getHp() > max_h*0.4) {
			System.out.println("1.��̳ʽ� HP"+(max_h-getHp())+"ȸ��");
			hp = max_h;

		}
		else {
		System.out.println("2.��̳ʽ� HP "+hsize+"ȸ�� ");
		setHp(getHp()+hsize);
		
		System.out.println("��̳ʽ� HP = "+getHp()+"\n");
		}
		
		}
	
	public void hyperAttack_1() {		//q ��ų
				 
		System.out.println();
				
		System.out.println();
		Thread s1 = new Thread(new SkillEffectThread("luminus_q"));
		s1.start();
		 try {
			 s1.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
		
		
		}

	public void hyperAttack_2() {		//R ��ų
		 
		System.out.println();
				
		System.out.println();
		Thread s2 = new Thread(new SkillEffectThread("luminus_r"));
		s2.start();
		 try {
			 s2.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
		
	
		}
	
	public void hyperAttack_3() {		//e ��ų
		 
		System.out.println();
				
		System.out.println();
		Thread s2 = new Thread(new SkillEffectThread("luminus_e"));
		s2.start();
		 try {
			 s2.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
		
	
		}
	
	
	
	
	// ��̰� ���� �ۼ� 
	public void Dungeon () {
		BlackWizard bw = new BlackWizard();
		
		
		Thread bw_attack = new Thread (new Runnable() {
					
			@Override
			public void run() {
								try {
									while(bw.getHp()>=0 || getHp()>=0) {
										if(bw.getHp()>0) {
											Thread.sleep(3000);   // 3�� ������ ���� 
											
											int percent = (int )(Math.random()*13);
											
											if(percent >4) {
												 bw.setStrength((int)(MAX_Hp()*0.25));
												 
												System.out.println("\t\t\t\t\t\t\t\t["+bw.getName()+" �⺻����]");
													bw.attack_1();
												
												System.out.println("\t\t\t\t\t\t\t\t"+bw.getName()+" "+getName()+"�� "+bw.getStrength()+"������\n");
									
												setHp(getHp()-bw.getStrength());
												
												System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t_____________________________________________________________");
												System.out.printf("\t\t\t\t\t\t\t\t\t\t\t\t\t\t��̳ʽ�  MAX_HP : "+MAX_Hp()+"\t �� ��     MAX_HP : "+bw.MAX_Hp()+
																 "\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t��̳ʽ�  CUR_HP : "+getHp()+"\t �� ��     CUR_HP : "+bw.getHp()+"\n");	
												System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t_____________________________________________________________");
											
											}else {
												bw.setStrength((int)(MAX_Hp()*0.38));
												
												System.out.println("\t\t\t\t\t\t\t\t["+bw.getName()+"�ñر�]");
												bw.attack_2();
												
												
												System.out.println("\t\t\t\t\t\t\t\t"+bw.getName()+" "+getStrength()+"������\n");
												
												setHp(getHp()-bw.getStrength());
											
												System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t_____________________________________________________________");
												System.out.printf("\t\t\t\t\t\t\t\t\t\t\t\t\t\t��̳ʽ�  MAX_HP : "+MAX_Hp()+"\t �� ��     MAX_HP : "+bw.MAX_Hp()+
																 "\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t��̳ʽ�  CUR_HP : "+getHp()+"\t �� ��     CUR_HP : "+bw.getHp()+"\n");	
												System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t_____________________________________________________________");
											}
												
									}if(bw.getHp()<=0) {  // ���� ������ ��� 
										System.out.println("���� �����縦 �̰���ϴ� !!!");
										break;
									}else if (getHp()<0) {  //���ΰ� ��� 
										
										 System.out.println("��̳ʽ��� ����߽��ϴ�....");
										  break;	
									}
										
									}//while(bw.getHp()>=0 || getHp()>=0) 
									
								}catch(InterruptedException e) {}
			}
		});
		bw_attack.setDaemon(true);
		bw_attack.start();
		int n = 0;
		
		while(getHp()!= 0) {
			Scanner input = new Scanner(System.in);
		
			
			System.out.printf("� �ൿ�� �Ͻðڽ��ϱ�  <Q> : ����   <E> : ȸ�� / <R> : �ñر�  - [��ų ��� Ƚ�� =%d]  >>",n);
			String act = input.nextLine();
			if("q".equalsIgnoreCase(act)) {
				n= (n%3)+1;
				attack(bw);
				System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t_____________________________________________________________");
				System.out.printf("\t\t\t\t\t\t\t\t\t\t\t\t\t\t��̳ʽ�  MAX_HP : "+MAX_Hp()+"\t �� ��     MAX_HP : "+bw.MAX_Hp()+
								 "\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t��̳ʽ�  CUR_HP : "+getHp()+"\t �� ��     CUR_HP : "+bw.getHp()+"\n");	
				System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t_____________________________________________________________");
				if(bw.getHp()<=0) {
					System.out.println("�������� �¸��߽��ϴ�.\n");
					break ;
				}
				
		   }if("w".equalsIgnoreCase(act)) {
			   		n= (n%3)+1;
					heal();
					System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t_____________________________________________________________");
					System.out.printf("\t\t\t\t\t\t\t\t\t\t\t\t\t\t��̳ʽ�  MAX_HP : "+MAX_Hp()+"\t �� ��     MAX_HP : "+bw.MAX_Hp()+
									 "\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t��̳ʽ�  CUR_HP : "+getHp()+"\t �� ��     CUR_HP : "+bw.getHp()+"\n");	
					System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t_____________________________________________________________");
					
		   }if("e".equalsIgnoreCase(act)){
			   n= (n%3)+1;	
			  hyperAttack_3();
			  System.out.println(getName()+" "+bw.getName()+"�� "+3*getStrength()+"������");
				bw.setHp(bw.getHp()-3*this.getStrength());
			 System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t_____________________________________________________________");
				System.out.printf("\t\t\t\t\t\t\t\t\t\t\t\t\t\t��̳ʽ�  MAX_HP : "+MAX_Hp()+"\t �� ��     MAX_HP : "+bw.MAX_Hp()+
								 "\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t��̳ʽ�  CUR_HP : "+getHp()+"\t �� ��     CUR_HP : "+bw.getHp()+"\n");	
				System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t_____________________________________________________________");
			
				
				
				if(bw.getHp()<=0) {
					System.out.println("�������� �¸��߽��ϴ�.\n");
					break ;
									}
				
		   }else if("r".equalsIgnoreCase(act)&&(n%2==0)) {
				n=0;
				hyperAttack_2();
				System.out.println(getName()+" "+bw.getName()+"�� "+5*getStrength()+"������");
				bw.setHp(bw.getHp()-5*this.getStrength());
				System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t_____________________________________________________________");
				System.out.printf("\t\t\t\t\t\t\t\t\t\t\t\t\t\t��̳ʽ�  MAX_HP : "+MAX_Hp()+"\t �� ��     MAX_HP : "+bw.MAX_Hp()+
								 "\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t��̳ʽ�  CUR_HP : "+getHp()+"\t �� ��     CUR_HP : "+bw.getHp()+"\n");	
				System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t_____________________________________________________________");
			
				if(bw.getHp()<=0) {
					System.out.println("�������� �¸��߽��ϴ�.\n");
					break ;
					}
		   					}
		   		}
			
		}
	
	}

