package NPC;

public class Second_Master implements Runnable{

	@Override
	public void run() {	
		System.out.print("[2대 마스터] : ");
		
	String[] m2 = {"이","걸","볼","떄","는"," ","비","보","를"," ","전","부","찾","았","겠","구","나",".",".",".\n\n\t\t"
						,"마","지","막"," ","순","간"," ","메","시","지","를 "," ","남","긴","다",".",".",".",".\n\n\t\t"
						,"별","의","아","이"," ","너","는"," ","'그 '","의"," ","절","반","이","었","다",".",".",".",".\n\n\t\t"
						,"오","로","라","를"," ","위","해"," ","검","은","마","법","사","를"," ","꼭"," ","이","겨","다","오\n\n\t\t"
						};
	
	
		for(int i = 0; i<m2.length;i++) {
			System.out.print(m2[i]);
		

	
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {}
	}
	}		
}
