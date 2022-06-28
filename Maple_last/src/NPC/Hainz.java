package NPC;

public class Hainz implements Runnable{
	
	
	
	public void run() {
		
		String[]d0 = { "[두루마기] : ","|차","가","운"," ","불","꽃|","  ","|뜨","거","운"," ","얼","음|","  ","|파","멸","의"," ","어","둠|"
				," ","그","리","고"," ","|궁"," ","극|",".",".",".",".","."};

		for(int i = 0; i<d0.length;i++) {
			System.out.print(d0[i]);
			try {
				Thread.sleep(300);
			}catch(InterruptedException e) {}
	}
		
		
		// TODO Auto-generated method stub
		System.out.print("\n\n[하인즈]: ");
		System.out.println("요청한 두루마기 내용을 분석 결과라네  ");
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {}
		
		String[] d1 = {"\t","이","것","은"," ","지","역","을"," ","의","미","하","는","것"," ","같","더","군","\n"
				,"\t","|불","꽃|"," ","|얼","음|"," ","|어","둠|"," ","|궁","극|"," ","이","라","는"," ","걸","로","보","아"
				,"\n","\t"
				,"[페","리","온]","->","[커","닝","시","티]","->","리","에","나]","->","[황","금","사","원]"
				," ","순","서","로"," ","조","사","해"," ","보","시","게",".",".","."};
		
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


