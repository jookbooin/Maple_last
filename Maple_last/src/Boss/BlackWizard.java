package Boss;
import Character.Luminus;
import Thread.SkillEffectThread;


public class BlackWizard {
	
	public BlackWizard(){
		this(1000000, 10000, 500);
	}
	protected int hp;
	protected int strength;
	protected int defence ;
	
	BlackWizard(int hp, int strength , int armor){
		this.hp =hp;
		this.strength = strength;
		this.defence = defence;
	}
	public String getName() {
		return "검은마법사";
	}
	public int MAX_Hp() {
		return 1000000;
	}

	public int getHp() {
		return hp;
	}
	
	public void setHp(int hp) {
		this.hp=hp;
	}
	
	public int getStrength() {
		return strength;
	}
	
	public void setStrength(int strength) {
		this.strength=strength;
		
	}
	
	public int getDefence() {
		return defence;
	}
	
	public void setDefence(int defence) {
		this.defence = defence;
	}


	
	public void attack_1() {
		Thread b1 = new Thread(new SkillEffectThread("blackWizard_a"));
		b1.start();
		try {
			b1.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void attack_2() {
		Thread b2 = new Thread(new SkillEffectThread("blackWizard_b"));
		b2.start();
		try {
			b2.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
	
