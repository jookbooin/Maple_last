package NPC;

public class Hainz implements Runnable{
	
	
	
	public void run() {
		
		String[]d0 = { "[�η縶��] : ","|��","��","��"," ","��","��|","  ","|��","��","��"," ","��","��|","  ","|��","��","��"," ","��","��|"
				," ","��","��","��"," ","|��"," ","��|",".",".",".",".","."};

		for(int i = 0; i<d0.length;i++) {
			System.out.print(d0[i]);
			try {
				Thread.sleep(300);
			}catch(InterruptedException e) {}
	}
		
		
		// TODO Auto-generated method stub
		System.out.print("\n\n[������]: ");
		System.out.println("��û�� �η縶�� ������ �м� ������  ");
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {}
		
		String[] d1 = {"\t","��","��","��"," ","��","��","��"," ","��","��","��","��","��"," ","��","��","��","\n"
				,"\t","|��","��|"," ","|��","��|"," ","|��","��|"," ","|��","��|"," ","��","��","��"," ","��","��","��","��"
				,"\n","\t"
				,"[��","��","��]","->","[Ŀ","��","��","Ƽ]","->","��","��","��]","->","[Ȳ","��","��","��]"
				," ","��","��","��"," ","��","��","��"," ","��","��","��",".",".","."};
		
		for(int i = 0; i<d1.length;i++) {
			System.out.print(d1[i]);

	
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {}
	}
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {}
		
	}
	
}


