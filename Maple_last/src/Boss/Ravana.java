package Boss;

import Character.Luminus;

public class Ravana extends Boss{
	
	public Ravana(){
		super(40000, 4000, 300);
	}
	public String getName() {
		return "��ٳ�";
	}
	public int MAX_Hp() {
		return 40000;
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
		
		if(percent >3) {
		System.out.println();
		System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t["+getName()+" �⺻����]");
			attack_1();
		System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t"+getName()+" "+lu.getName()+"�� "+getStrength()+"������");
		lu.setHp(lu.getHp() - getStrength());
		
		}
	
		else {
			System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t["+getName()+"�ñر�]");
			attack_2();
			System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t"+getName()+" "+(int)(lu.MAX_Hp()*0.43)+"������");
			lu.setHp(lu.getHp()-(int)(lu.MAX_Hp()*0.43));

			
		}
	}
}
