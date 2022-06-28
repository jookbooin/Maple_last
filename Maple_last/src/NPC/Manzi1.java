package NPC;

public class Manzi1 implements Runnable{
	
	public void run() {	
		System.out.print("[만지] :");
		
	String[] manzi1 = {"나","는"," ","마","지","막"," ","검","사","의"," ","후","예","다",".",".",".",".\n\n\t"
						,"뭐?",".",".", "드","디","어"," ","왔 ","군",".",".","물","건","이"," ","반","응","하","는"," ","주","인","이",".",".","."};
	
						
		for(int i = 0; i<manzi1.length;i++) {
			System.out.print(manzi1[i]);

	
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {}
	}
	}		
}

