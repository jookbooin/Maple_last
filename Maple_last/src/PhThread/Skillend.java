package PhThread;

public class Skillend implements Runnable{
	@Override
	public void run() {
		String story4 = "스킬 셋이 종료중입니다.";
        char[] story_4 = story4.toCharArray();
        try {
            for (int i = 0; i < story_4.length; i++) {
                System.out.print(story_4[i]);
                Thread.sleep(20);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for(int ㅓ=0; ㅓ<20; ㅓ++ ) {
        	System.out.print('.');
        	
        	try {
        		Thread.sleep(150);
        	} catch (InterruptedException e) {
        	}
        }
	}
}
