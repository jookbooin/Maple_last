package NPC;

import javax.xml.stream.events.StartDocument;

public class GoldTemple implements Runnable {

	
	public void start() {
		
	}
	
	@Override
	public void run() {
		System.out.print("[��ٳ�] : ");
		 String [] r1 = {"��!",".",".",".",".","��","��","��","��\n\n"
				 ,"[�·���] : ","��",".",".","��",".",".",".","��",".",".","��",".",".","��",".",".",".","." };
		 
		 for(int i = 0; i<r1.length;i++) {
				System.out.print(r1[i]);
			
		
				try {
					Thread.sleep(100);
				}catch(InterruptedException e) {}
		}
		 
		

}
}
