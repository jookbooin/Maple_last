package NPC;

import javax.xml.stream.events.StartDocument;

public class DarkRoad1 implements Runnable{

	private String type;
	public DarkRoad1(String type) {
		this.type = type;		
	}
	
	public void start1() {
		System.out.print("[��ũ�ε�]: ");
		String[] d1 = {"��","��","��"," ","��","��"," ","��","��"," ","��","��"," ","��","��","��",".",".",".","."};
		
		for(int i = 0; i<d1.length;i++) {
			System.out.print(d1[i]);
	
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {}
	}
	}
	
	public void start2() {
		System.out.print("[��ũ�ε�]: ");
		String[] d2  = {"��","��","��"," ","��","��","��"," ","��","��","��"," ","��","��","��","��"," ","��","��","��","��"
				,"��","��","��","��"," ","��","��","��"," ","��","��","��"," ","��","��","��","��","��","��"," ","��","��","��"
				," ","��","��","��","��","��"," ","��","��","��\n\n\t"," ","��","��"," ","��","��"," ","��","��","��"," "
				,"��","��" ," ","��","��","��"," ","ó","��","��","��","��" ," ","��","��","��",".","."};
	
		for(int i = 0; i<d2.length;i++) {
			System.out.print(d2[i]); 
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {}
	
	}
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		switch(type) {
		case "start1":
			start1();break;
			
		case "start2":
			start2();break;
		}
		
		
	}
	
}
