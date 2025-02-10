package com.ktdsuniversity.edu.anonymousclass;

// ctrl+1 ->  메소드 추가
//ctrl+d -> 라인 지우기 
public class Ahri implements Unit {

	private String characterName;
	private String playerName;
	private int level;
	private int hp;
	private int mana;
	private int money;
	private int attactDamage;
	private int defence;
	private float attactSpeed;

	public Ahri(String playerName) {
		this.characterName = "아리";
		this.level = 1;
		this.hp = 100;
		this.mana = 100;
		this.playerName = playerName;
//		this.money=0;
		this.attactDamage = 20;
		this.defence = 10;
		this.attactSpeed = 1.5f;
	}

	@Override
	public void move() {
		System.out.println(this.characterName + "(" + this.playerName + ")" + "이동 중");
	}

	@Override
	public void basicAttact(Unit otherCharater) {
		int otherCharacterHp = otherCharater.getHp();

		// 상대 캐릭터에게 가할 공격 포인트
		int attactDamage = this.attactDamage - otherCharater.getDefence();
		if (attactDamage < 0) {
			attactDamage = 0;
		}

		otherCharacterHp -= attactDamage;
		otherCharater.setHp(otherCharacterHp);
	}

	@Override
	public void skillAttact(Unit otherCharater) {
		if (this.mana < 10) {
			return;
		}
		this.mana -= 10;
		int otherCharacterHp = otherCharater.getHp();

		// 상대 캐릭터에게 가할 공격 포인트
		int attactDamage = (this.attactDamage + this.level) - otherCharater.getDefence();
		if (attactDamage < 0) {
			attactDamage = 0;
		}

		otherCharacterHp -= attactDamage;
		otherCharater.setHp(otherCharacterHp);
	}

	@Override
	public void recall() {
		System.out.println(this.characterName + "(" + this.playerName + ") 가 귀환했습니다.");
	}

	@Override
	public void buyItem() {
		this.money -= 100;
		System.out.println(this.money);
	}

	@Override
	public void sellItem() {
		this.money += 80;
		System.out.println(this.money);
	}

	@Override
	public void speak() {
		String[] script = new String[] { 
				"얍!", "이동~", "공격~"
			// 	  0,	 1, 	 2
		};

		int scriptIndex = (int) (Math.random() * script.length);
		System.out.println(script[scriptIndex]);
	}

	@Override
	public void emotion() {
		String[] script = new String[] { 
				"웃기", "울기"
				// 0, 	1
		};

		int scriptIndex = (int) (Math.random() * script.length);
		System.out.println(script[scriptIndex]);
	}

	@Override
	public void die() {
		System.out.println(this.characterName+"("+this.playerName+")가 죽었습니다.");
	}

	@Override
	public void takeMinions() {
		this.money+=3;
		System.out.println(this.money);
	}

	@Override
	public int getHp() {
		return this.hp;
	}

	@Override
	public void setHp(int hp) {
		this.hp = hp;
	}

	@Override
	public int getDefence() {
		return this.defence;
	}

}
