package PhThread;

import java.util.Scanner;

public class PhantomStory implements Runnable{

	static void indent() {
		System.out.printf("\n\t\t\t\t\tENTER\n");
		Scanner ch = new Scanner(System.in);
		ch.nextLine();

	}
	@Override
	public void run() {
		String[] story1 = {"��","��","��","��","��","��"," ","��","��","��","��","��","�� ",
				"ħ","��","��","�� ", "��","��",",", "��","��","�� ", "��","��","�� ", 
				"��","��","��","�� ", "\n��","��","�� ", "��","��","�� ", "��","��","�� " 
				,"��","�� ", "��","��","��", "Ȱ","��","��","�� ", "��","�� ", "��","��",
				"��","�� ", "��","��","��","�� ","��","��","�� ", "��","��","��","." 
		};
		for(int i=0; i<story1.length; i++) {
			System.out.print(story1[i]);
			
			try {
				Thread.sleep(15);
			}catch(InterruptedException e) {
				
			}
		}
		indent();
		String story2 = "\n�����鸸 ��ĥ �� �ƴ°� �ƴ϶� �����µ� ����� �����ߴ� ������ ���δ�.\n"
				+ "������ �������� �����̶�� �ҹ��� '��ī�̾�'�� ��ġ�� ���� �����꿡 �����Ѵ�.\n"
				+ "�׷��� �� �������� �Ƹ��� ������ �� ������ �Ƿ� �׳�� ģ���� �ǰ� ����ؼ�\n"
				+ "�㸶�� �����꿡 ��Ÿ���� �Ƹ��ƿ� ������ �ȴ�.\n";
        char[] story_2 = story2.toCharArray();
        try {
            for (int i = 0; i < story_2.length; i++) {
                System.out.print(story_2[i]);
                Thread.sleep(15);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        indent();
        String story3 = "�׸��� �ð��� �귯 ���� �������� ����� ������ ��ӵǴ� ����, \n"
        		+ "�Ƹ��ƴ� �������� ȸ���� ������� �ϰ� ������ ������ ǥ���� ���� ä ���� ���ϴ� \n"
        		+ "�Ƹ��ƿ��� \"�׷��� ����� ǥ���� ������ ���� �Ĵ´�? ����� ���� ���� ���� \n"
        		+ "�� ����\"��� �����ϸ� ī�带 ��̷� �ٲ� �ǳ��ش�.\n";
        char[] story_3 = story3.toCharArray();
        try {
            for (int i = 0; i < story_3.length; i++) {
                System.out.print(story_3[i]);
                Thread.sleep(15);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        indent();
        String story4 = "�׸��� Ȱ¦ ������ �Ƹ��ƴ� �δ��� ��ü�� �߰ߵȴ�. ȸ���� ������ ��, \n"
        		+ "ȸ�������� �޷��� ������ ���� ä ������ �Ƹ��Ƹ� ���� �ȴ�. ȸ���� ���̷� ��������� \n"
        		+ "�Ƹ��� ������ ������ ���̴�.\n";
        char[] story_4 = story4.toCharArray();
        try {
            for (int i = 0; i < story_4.length; i++) {
                System.out.print(story_4[i]);
                Thread.sleep(15);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        indent();
        String story5 = "�Ƹ����� ������ ���� ����� ���� ������ �׳��� ������ ���� �� �����ٴ� \n"
        		+ "�ż����Լ� ������ '������ ��'�� ���� �� �巡�� ������ �����忡�Է� ���Եȴ�. \n"
        		+ "������ ������ ������ �����شٴ� �Ҹ��� ó������ ���������̳ĸ� �Ǳ����� ��������, \n"
        		+ "�����尡 �Ƹ��� Ȳ���� ������ ����� �׸� ī�带 ���� \"�����������ٰ�, \n"
        		+ "���ѱ���ΰ�\" ��� ������ ������ �����ϰ� ���� ������ �����ϸ� ����� �������ְ�, \n"
        		+ "�ﰢ ���� �뿭�� �շ��ϰ� �ȴ�. ȯ���Ѵٴ� �������� ���� ������ \n"
        		+ "\"������ �Ǵ� ������... ������ ���ݾ�?\"��� �߾�Ÿ���.\n";
        char[] story_5 = story5.toCharArray();
        try {
            for (int i = 0; i < story_5.length; i++) {
                System.out.print(story_5[i]);
                Thread.sleep(15);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        indent();
        String stortend = "������ �����Ͻ÷��� Enter�� �����ּ���!";
        char[] story_end = stortend.toCharArray();
        try {
            for (int i = 0; i < story_end.length; i++) {
                System.out.print(story_end[i]);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	}
}
