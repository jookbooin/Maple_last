package PhThread;

import java.util.Scanner;

public class PhantomStory implements Runnable{

	static void indent() {
		System.out.printf("\n\t\t\t\t\tENTER\n");
		Scanner ch = new Scanner(System.in);
		ch.nextLine();

	}
	@Override
	public void run() {
		String[] story1 = {"검","은","마","법","사","가"," ","메","이","플","월","드","를 ",
				"침","략","하","기 ", "이","전",",", "팬","텀","은 ", "메","이","플 ", 
				"월","드","에","서 ", "\n부","유","한 ", "자","들","의 ", "재","산","을 " 
				,"터","는 ", "괴","도","로", "활","동","했","고 ", "이","에 ", "사","람",
				"들","은 ", "괴","도","팬","텀 ","이","라","고 ", "불","렀","다","." 
		};
		for(int i=0; i<story1.length; i++) {
			System.out.print(story1[i]);
			
			try {
				Thread.sleep(15);
			}catch(InterruptedException e) {
				
			}
		}
		indent();
		String story2 = "\n보물들만 훔칠 줄 아는게 아니라 전투력도 상당히 출중했던 것으로 보인다.\n"
				+ "팬텀은 에레브의 보물이라고 소문난 '스카이아'를 훔치기 위해 에레브에 잠입한다.\n"
				+ "그러나 그 과정에서 아리아 여제를 본 팬텀은 되려 그녀와 친구가 되고 계속해서\n"
				+ "밤마다 에레브에 나타나서 아리아와 만나게 된다.\n";
        char[] story_2 = story2.toCharArray();
        try {
            for (int i = 0; i < story_2.length; i++) {
                System.out.print(story_2[i]);
                Thread.sleep(15);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        indent();
        String story3 = "그리고 시간이 흘러 검은 마법사의 군대와 전쟁이 계속되던 와중, \n"
        		+ "아리아는 군단장들과 회담을 가지기로 하고 팬텀은 착잡한 표정을 지은 채 웃지 못하는 \n"
        		+ "아리아에게 \"그렇게 우울한 표정만 지으면 빨리 늙는다? 당신은 웃는 얼굴이 제일 \n"
        		+ "잘 어울려\"라고 위로하며 카드를 장미로 바꿔 건네준다.\n";
        char[] story_3 = story3.toCharArray();
        try {
            for (int i = 0; i < story_3.length; i++) {
                System.out.print(story_3[i]);
                Thread.sleep(15);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        indent();
        String story4 = "그리고 활짝 웃었던 아리아는 싸늘한 시체로 발견된다. 회담이 벌어진 날, \n"
        		+ "회담장으로 달려간 팬텀은 죽은 채 쓰러진 아리아를 보게 된다. 회담을 빌미로 군단장들이 \n"
        		+ "아리아 여제를 살해한 것이다.\n";
        char[] story_4 = story4.toCharArray();
        try {
            for (int i = 0; i < story_4.length; i++) {
                System.out.print(story_4[i]);
                Thread.sleep(15);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        indent();
        String story5 = "아리아의 죽음에 깊은 충격을 받은 팬텀은 그녀의 죽음을 막을 수 없었다는 \n"
        		+ "신수에게서 마지막 '전해줄 것'을 받은 뒤 드래곤 마스터 프리드에게로 가게된다. \n"
        		+ "괴도로 유명한 팬텀이 도와준다는 소리에 처음에는 무슨목적이냐며 의구심을 가지지만, \n"
        		+ "프리드가 아리아 황제와 팬텀의 모습을 그린 카드를 보곤 \"빼앗으려갔다가, \n"
        		+ "빼앗긴것인가\" 라고 팬텀의 심정을 이해하고 그의 전향을 인정하며 동료로 인정해주고, \n"
        		+ "즉각 영웅 대열에 합류하게 된다. 환영한다는 프리드의 말에 팬텀은 \n"
        		+ "\"영웅이 되는 괴도라... 나쁘지 않잖아?\"라고 중얼거린다.\n";
        char[] story_5 = story5.toCharArray();
        try {
            for (int i = 0; i < story_5.length; i++) {
                System.out.print(story_5[i]);
                Thread.sleep(15);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        indent();
        String stortend = "팬텀을 시작하시려면 Enter를 눌러주세요!";
        char[] story_end = stortend.toCharArray();
        try {
            for (int i = 0; i < story_end.length; i++) {
                System.out.print(story_end[i]);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	}
}
