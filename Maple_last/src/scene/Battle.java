package scene;

import java.util.Scanner;

import javax.naming.LinkLoopException;

import Boss.Boss;
import Character.Luminus;

public class Battle {
	
	public void printHp(Luminus lu, Boss bw) {
		System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t_____________________________________________________________");
		System.out.printf("\t\t\t\t\t\t\t\t\t\t\t\t\t\t��̳ʽ�  MAX_HP : "+lu.MAX_Hp()+"\t �� ��     MAX_HP : "+bw.MAX_Hp()+
						 "\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t��̳ʽ�  CUR_HP : "+lu.getHp()+"\t �� ��     CUR_HP : "+bw.getHp()+"\n");	
		System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t_____________________________________________________________");
		
	}
	
		
	public void print(Luminus lu , Boss b) {
		lu.setHp(lu.MAX_Hp());
		
		System.out.println("\n\n\t\t\t\t\t\t\t\t\t\t\t\t__________[Battle]___________________________________________");
		
		System.out.printf("\t\t\t\t\t\t\t\t\t\t\t\t\t��̳ʽ�  MAX_HP : "+lu.MAX_Hp()+"\t �� ��     MAX_HP : "+b.MAX_Hp()+
						  "\n\t\t\t\t\t\t\t\t\t\t\t\t\t��̳ʽ�  CUR_HP : "+lu.getHp()+"\t �� ��     CUR_HP : "+b.MAX_Hp()+"\n");
	       	System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t_____________________________________________________________");
	       
	       	int n = 0;
		
		 do {
			Scanner input = new Scanner(System.in);
			
			System.out.printf("\n� �ൿ�� �Ͻðڽ��ϱ� [��ų ��� Ƚ�� =%d]  >>",n);
			String act = input.nextLine();
			
	if("q".equalsIgnoreCase(act)) {
		n= (n%2)+1;
			lu.attack(b);
			printHp(lu, b);
			if(b.getHp()<=0) {
				System.out.println("�������� �¸��߽��ϴ�.\n");
				break ;
					}
			
	}if ("w".equalsIgnoreCase(act)) {
		n= (n%2)+1;
				lu.heal();
				printHp(lu, b);
			}
	
	
	if("e".equalsIgnoreCase(act)) {
		n= (n%2)+1;
		lu.hyperAttack_2(b);
		printHp(lu, b);
		if(b.getHp()<=0) {
			System.out.println("�������� �¸��߽��ϴ�.\n");
			break ;
		
		}
	}else if(("r".equalsIgnoreCase(act))&&(n%2==0)&&(lu.lv>=30)) {  //���� 30 �̻��̾�� ȹ�� 
		n= (n%2)+1;
			lu.hyperAttack_1(b);
			
			printHp(lu, b);
			if(b.getHp()<=0) {
				System.out.println("�������� �¸��߽��ϴ�.\n");
				break ;
	}
			
	}
	else if(("r".equalsIgnoreCase(act)&&(n%2==0)&&(lu.lv<30))) {
		System.out.println("\n������ ���� ��ų��� �Ұ��մϴ�.");
		continue;
	}
	
	try {
		Thread.sleep(1000);
	}catch(InterruptedException e) {}
	
		b.attack(lu);					//���� ��̳ʽ� ����
		
		 if(lu.getHp()<=0) {
			 for(int i = 0 ; i< 60 ; i++) 
			 System.out.println();
			 
			
			 System.out.println("��̳ʽ��� ����߽��ϴ�....");
			 lu.setHp(0);
//				System.out.println("_____________________________________________________________");
//				System.out.printf("\t��̳ʽ�  MAX_HP : "+lu.MAX_Hp()+"\t �� ��     MAX_HP : "+b.MAX_Hp()+
//								 "\n\t��̳ʽ�  CUR_HP : "+lu.getHp()+"\t �� ��     CUR_HP : "+b.getHp()+"\n");	
//				System.out.println("_____________________________________________________________");
//			
			 printHp(lu, b);
			System.out.println("\n��Ȱ �Ͻðڽ��ϱ� [ y / n ]");
			
			do {
					String c = input.nextLine();
					System.out.print("[y/n] :");
					if("y".equalsIgnoreCase(c)) {
						System.out.println("��̳ʽ��� ��Ȱ�մϴ�.");
						lu.setHp(lu.MAX_Hp());
						b.setHp(b.MAX_Hp());
						break;
						
					}
					if("n".equals(c)) {
						System.out.println("������ �����մϴ�.");
						System.exit(0);
					}
					else {	
						System.out.println("�߸��� �Է��Դϴ�.");
						continue;
					}
					
		 }while(true);
	 }
		 
	try {
			Thread.sleep(1000);
	}catch(InterruptedException e) {}
	for(int i = 0 ; i<40 ; i++)
		System.out.println();
	
//	System.out.println("_____________________________________________________________");
//	System.out.printf("\t��̳ʽ�  MAX_HP : "+lu.MAX_Hp()+"\t �� ��     MAX_HP : "+b.MAX_Hp()+
//					 "\n\t��̳ʽ�  CUR_HP : "+lu.getHp()+"\t �� ��     CUR_HP : "+b.getHp()+"\n");	
//	System.out.println("_____________________________________________________________");
		 	printHp(lu, b);
		
	
		 
	}while(true);
		
	}
}
	
		 

	

