package NPC;

import javax.xml.stream.events.StartDocument;

public class DarkRoad1 implements Runnable{

	private String type;
	public DarkRoad1(String type) {
		this.type = type;		
	}
	
	public void start1() {
		System.out.print("[다크로드]: ");
		String[] d1 = {"도","적","이"," ","되","고"," ","싶","은"," ","자","는"," ","나","에","게",".",".",".","."};
		
		for(int i = 0; i<d1.length;i++) {
			System.out.print(d1[i]);
	
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {}
	}
	}
	
	public void start2() {
		System.out.print("[다크로드]: ");
		String[] d2  = {"선","대","가"," ","말","했","던"," ","영","웅","이"," ","당","신","인","가"," ","아","쉽","게","도"
				,"선","대","께","서"," ","자","네","의"," ","물","건","을"," ","블","랙","슬","라","임","과"," ","싸","우","다"
				," ","잃","어","버","렸","다"," ","하","더","군\n\n\t"," ","워","낙"," ","강","한"," ","슬","라","임"," "
				,"이","라" ," ","자","네","가"," ","처","리","해","줄","수" ," ","있","을","까",".","."};
	
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
