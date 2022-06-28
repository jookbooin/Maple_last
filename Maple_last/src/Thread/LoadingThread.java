package Thread;

public class LoadingThread implements Runnable{
	
	private String type;
	public LoadingThread(String type) {
		this.type = type;		
	}
	
	//처음 입장하는 쓰레드 
	public void loading() {
		for(int i=0; i<60; i++) {
			System.out.println("");
		}
		
		System.out.print("로딩중");
		
		for(int i=0; i<20; i++ ) {
			System.out.print('.');
		
			try {
				Thread.sleep(140);
			} catch (InterruptedException e) {}
			
		}
		
	
		for(int i=0; i<60; i++) {
			System.out.println("");
		}
	}
	
	
	public void move() {
		System.out.print("이동중 입니다.");
		for(int i=0; i<20; i++ ) {
			System.out.print('.');

			try {
				Thread.sleep(140);
			} catch (InterruptedException e) {}
		}
		for(int i=0; i<60; i++) {
			System.out.println("");
		}
	}
	
	public void Pmove() {
		System.out.print("페리온으로 이동중");
		for(int i=0; i<20; i++ ) {
			System.out.print('.');

			try {
				Thread.sleep(140);
			} catch (InterruptedException e) {}
		}
		for(int i=0; i<60; i++) {
			System.out.println("");
		}
	}
	
	public void	 Cmove() {
		System.out.print("커닝시티로 이동중");
		for(int i=0; i<20; i++ ) {
			System.out.print('.');

			try {
				Thread.sleep(140);
			} catch (InterruptedException e) {}
		}
		for(int i=0; i<60; i++) {
			System.out.println("");
		}
	}
	public void Smove() {
		System.out.print("세레니티로 가는중");
		for(int i=0; i<20; i++ ) {
			System.out.print('.');

			try {
				Thread.sleep(140);
			} catch (InterruptedException e) {}
		}
		for(int i=0; i<60; i++) {
			System.out.println("");
		}
	}
	
	public void Hmove() {
		System.out.print("황금사원으로 가는중");
		for(int i=0; i<20; i++ ) {
			System.out.print('.');

			try {
				Thread.sleep(140);
			} catch (InterruptedException e) {}
		}
		for(int i=0; i<60; i++) {
			System.out.println("");
		}
	}
	public void Lmove() {
		System.out.print("리에나로 가는중");
		for(int i=0; i<20; i++ ) {
			System.out.print('.');

			try {
				Thread.sleep(140);
			} catch (InterruptedException e) {}
		}
		for(int i=0; i<60; i++) {
			System.out.println("");
		}
	}
	public void battle() {
		
		System.out.print("곧 전투가 시작됩니다 준비하십시오!!!!");
		for(int i=0; i<20; i++ ) {
			System.out.print('.');
		
			try {
				Thread.sleep(140);
			} catch (InterruptedException e) {}
		
		}
		for(int j = 3 ; j>0 ; j--) {
			System.out.print(j+" ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
	
	}
	
	public void vevo() {
		System.out.println("[비어완]: 드디어  비보를 다 모았 ");
		for(int i=0; i<10; i++ ) {
			System.out.println("||||||||||||||||||||");
		
			try {
				Thread.sleep(140);
			} catch (InterruptedException e) {}
		
		}
		
	}

	
	
	
	public void run() {
		switch(type) {
		case "loading":
			loading();
			break;
			
		case "Pmove" :
			Pmove();
			break;
			
		case "Cmove" :
			Cmove();
			break;
			
		case "Smove" :
			Smove();
			break;
			
		case "Lmove" :
			Lmove();
			break;
			
		case "Hmove" :
			Hmove();
			break;
			
		case "battle":
			battle();
			break;
		
		}	
	}	
}



