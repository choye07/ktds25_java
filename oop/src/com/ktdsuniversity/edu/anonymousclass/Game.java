package com.ktdsuniversity.edu.anonymousclass;

public class Game {
	public static void main(String[]args) {
		Unit ahri = new Ahri("페이커");
		
		// 클래스 구현없이 인스턴스를 만들려면 "new  추상 클래스 혹은 인터페이스(){}";
		//익명클래스
		//이 클래스 가 없으면 실행이 안됨.
		Unit other = new Unit() {

			private String characterName ="히든";
			private String playerName ="최예진";
			private int level=100;
			private int hp = 100;
			private int mana = 20000;;
			private int money = 999999;
			private int attactDamage = 5000;
			private int defence = 100000;
			private float attactSpeed = 0.1f;

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

		};
		
		ahri.move();
		other.move();
		
		ahri.basicAttact(other);
		other.skillAttact(other);
		
		ahri.speak();
		other.speak();
	}
}
