package task.animal;

import java.util.Scanner;

/**
 * Animal 클래스를 마들어 보기
 */
public class Animal {
	private String name;
	
	private String type;
	
	private String animalCries;
	
	public Animal(String name, String type, String animalCries) {
		this.name = name;
		this.type = type;
		this.animalCries=animalCries;
	}
	
	public String getAnimalCries() {
		return this.animalCries;
	}
	
	public void setAnimalCries(String animalCries) {
		this.animalCries = animalCries;
	}
	
	public void Introduce() {
		System.out.println("name: "+this.name+", type: "+this.type);
	}
	
	public void Crying() {
		System.out.println(this.name+" cries: "+this.animalCries);
	}
	
	public static void main(String[]args) {
		Animal adel = new Animal("adel","dog","월월");
		Animal baba = new Animal("baba","dog","아르르르");
		Animal colin = new Animal("colin","dog","그르릉");
		
		Animal hannah = new Animal("hannah","cat","애옹");
		Animal jade = new Animal("jade","cat","냐옹");
		Animal lina = new Animal("lina","cat","이야우");
		
		Scanner in = new Scanner(System.in);
					
		System.out.println("소개 받고싶은 동물 이름을 적어주세요");
		String name = in.next();
		switch(name) {
		case "adel":
			adel.Introduce();
			adel.Crying();
			break;
		case "baba":
			baba.Introduce();
			baba.Crying();
			break;
		case "colin":
			colin.Introduce();
			colin.Crying();
			break;
		case "hannah":
			hannah.Introduce();
			hannah.Crying();
			break;
		case "jade":
			jade.Introduce();
			jade.Crying();
			break;
		case "lina":
			lina.Introduce();
			lina.Crying();
			break;
		default:
			System.out.println("일치하는 동물을 찾을 수 없습니다.");
		}
		
		in.close();

	}
}
