package NPC;

public class Manzi1 implements Runnable{
	
	public void run() {	
		System.out.print("[����] :");
		
	String[] manzi1 = {"��","��"," ","��","��","��"," ","��","��","��"," ","��","��","��",".",".",".",".\n\n\t"
						,"��?",".",".", "��","��","��"," ","�� ","��",".",".","��","��","��"," ","��","��","��","��"," ","��","��","��",".",".","."};
	
						
		for(int i = 0; i<manzi1.length;i++) {
			System.out.print(manzi1[i]);

	
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {}
	}
	}		
}

