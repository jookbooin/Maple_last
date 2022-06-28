package PhThread;

public class Storystart implements Runnable{
	@Override
	public void run() {
		String story4 = "팬텀 스토리가 시작됩니다";
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
