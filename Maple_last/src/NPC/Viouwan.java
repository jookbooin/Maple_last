package NPC;

import javax.xml.stream.events.StartDocument;

public class Viouwan implements Runnable{
	private String type;
	
	public Viouwan(String type) {
		this.type = type;
	}
	
	public void start() {
		
	
		String [] v1 = {"[비어완] : ","규","칙"," ","설","명"," "," "," "," "," "
				,"\n\n\t","1.각 맵에는 오로라 단원의 후예","  [만지],"," [다크로드]"," [리엔]"," "
				,"이","있습니다."," "," "," "," "," ","\n\n\t"
				,"2.맵이 끝나면 [세레니티]로 돌아옵니다. "," "," "," "," ","\n\n\t"
				,"Q (기본공격)\n\n\tW (체력 30% 회복)\n\n\tE (강화공격)\n\n\tR(궁극기  - 30레벨 활성화 -> 단 2번당 1회 사용 )"};
		
		for(int i = 0; i<v1.length;i++) {
			System.out.print(v1[i]);

	
			try {
				Thread.sleep(200);
			}catch(InterruptedException e) {}
			
		
		}
		
		
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {}
	
	}
	
	
	public void start2() {
		String [] v2 = {"[비어완] : ", "고서를 뒤지다가 이런 문구를 발견했습니다 .\n\n\t","'궁극의 빛은 황금으로 둘러 쌓여 고요히 잠든다\n\n\t"
				,"황금 사원도 한번 조사해 볼 가치가 있을것 같습니다.\n\n\t","황금 사원도 한번 조사해 주십시오.\n\n\t 그리고 30 렙 달성으로 하이퍼스킬이 개방되었습니다!!"};
		
	for(int i = 0; i<v2.length;i++) {
		System.out.print(v2[i]);


		try {
			Thread.sleep(400);
		}catch(InterruptedException e) {}
		
	
	
	}
	}

	@Override
	public void run() {
		
		switch(type) {
		case "start":
			start(); break;
		
		case "start2":
		start2(); break;
	}
		
	}

}
