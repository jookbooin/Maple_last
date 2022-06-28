package Boss;

import Character.Luminus;
import Thread.SkillEffectThread;

public abstract class Boss {
	
	protected int hp;
	protected int strength;
	protected int defence ;
	
	Boss(int hp, int strength , int armor){
		this.hp =hp;
		this.strength = strength;
		this.defence = defence;
	}
	
	public void attack_1() {
		Thread b1 = new Thread(new SkillEffectThread("boss_a"));
		b1.start();
		 try {
			 b1.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	}
	
	public void attack_2() {
		Thread b2 = new Thread(new SkillEffectThread("boss_b"));
		b2.start();
		 try {
			 b2.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	}
	
	
	public abstract void attack(Luminus lu);

	public abstract String getName();
	
	public abstract int getHp() ;
	
	public abstract  void setHp(int hp); 
	
	
	public abstract  int getStrength() ;
	
	public abstract  void setStrength(int strength);
	
	public abstract  int getDefence(); 
	
	public abstract void setDefence(int defence); 


	public abstract int MAX_Hp();



}
	








