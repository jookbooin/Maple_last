package PhThread;

public class Skillend implements Runnable{
	@Override
	public void run() {
		String story4 = "��ų ���� �������Դϴ�.";
        char[] story_4 = story4.toCharArray();
        try {
            for (int i = 0; i < story_4.length; i++) {
                System.out.print(story_4[i]);
                Thread.sleep(20);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for(int ��=0; ��<20; ��++ ) {
        	System.out.print('.');
        	
        	try {
        		Thread.sleep(150);
        	} catch (InterruptedException e) {
        	}
        }
	}
}
