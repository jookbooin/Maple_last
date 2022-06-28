package NPC;

import javax.xml.stream.events.StartDocument;

public class GoldTemple implements Runnable {

	
	public void start() {
		
	}
	
	@Override
	public void run() {
		System.out.print("[¶ó¹Ù³ª] : ");
		 String [] r1 = {"Äô!",".",".",".",".","Äô","Äô","Äô","Äô\n\n"
				 ,"[½Â·Áµé] : ","À¸",".",".","¾Ç",".",".",".","»ì",".",".","·Á",".",".","Áà",".",".",".","." };
		 
		 for(int i = 0; i<r1.length;i++) {
				System.out.print(r1[i]);
			
		
				try {
					Thread.sleep(100);
				}catch(InterruptedException e) {}
		}
		 
		

}
}
