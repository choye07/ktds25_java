package task.animal;

import java.util.Scanner;

public class Cat {

	private String name;

	private String type;

	private String size;

	public Cat(String name, String type, String size) {
		this.name = name;
		this.type = type;
		this.size = size;
	}

	public void introduce() {
		System.out.println("name: " + this.name + ", type: " + this.type + ", size: " + this.size);
	}

//	public void Crying() {
//		System.out.println(this.name+" cries: "+this.size);
//	}

	public static void main(String[] args) {
		Cat doreen = new Cat("hannah", "MainCoon", "large");
		Cat emma = new Cat("jade", "Munchkin", "small");
		Cat kate = new Cat("lina", "BritishShorthair", "medium");

		Scanner in = new Scanner(System.in);

		System.out.println("소개 받고싶은 동물 이름을 적어주세요");
		String name = in.next();
		switch (name) {
		case "doreen":
			doreen.introduce();
//			doreen.Crying();
			break;
		case "emma":
			emma.introduce();
//			jade.Crying();
			break;
		case "kate":
			kate.introduce();
//			lina.Crying();
			break;
		default:
			System.out.println("일치하는 동물을 찾을 수 없습니다.");
		}

		in.close();

	}

}
