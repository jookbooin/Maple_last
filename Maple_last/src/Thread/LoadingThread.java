package Thread;

public class LoadingThread implements Runnable{
	
	private String type;
	public LoadingThread(String type) {
		this.type = type;		
	}
	
	//ó�� �����ϴ� ������ 
	public void loading() {
		for(int i=0; i<60; i++) {
			System.out.println("");
		}
		
		System.out.print("�ε���");
		
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
		System.out.print("�̵��� �Դϴ�.");
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
		System.out.print("�丮������ �̵���");
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
		System.out.print("Ŀ�׽�Ƽ�� �̵���");
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
		System.out.print("������Ƽ�� ������");
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
		System.out.print("Ȳ�ݻ������ ������");
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
		System.out.print("�������� ������");
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
		
		System.out.print("�� ������ ���۵˴ϴ� �غ��Ͻʽÿ�!!!!");
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
		System.out.println("[����]: ����  �񺸸� �� ��� ");
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



