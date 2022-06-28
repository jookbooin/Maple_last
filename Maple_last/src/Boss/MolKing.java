package Boss;

import Character.Luminus;

public class MolKing extends Boss{
	
	public MolKing(){
		super(5000, 2000, 150);
	}
	
	public String getName() {
		return "몰킹";
	}
	public int MAX_Hp() {
		return 5000;
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

	
	public void attack(Luminus lu){
		int percent = (int )(Math.random()*8);
		
		if(percent >2) {
		System.out.println();
		System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t["+getName()+" 기본공격]");
			attack_1();
		System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t"+getName()+" "+lu.getName()+"에 "+getStrength()+"데미지");
		lu.setHp(lu.getHp() - getStrength());
		
		}
	
		else {
			System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t["+getName()+"궁극기]");
			attack_2();
			System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t"+getName()+" "+(int)(lu.MAX_Hp()*0.43)+"데미지");
			lu.setHp(lu.getHp()-(int)(lu.MAX_Hp()*0.43));

			
		}
	}
}


