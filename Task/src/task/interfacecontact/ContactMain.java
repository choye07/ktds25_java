package task.interfacecontact;


public class ContactMain {
	
	public static void main(String[]args) {
		Contact[] contacts = new Contact[8]; // 필요에 따라 동적으로 크기 변경 가능
		
		ContactApp siri = new ContactApp(8);
		
		// 배열에 연락처 추가
		contacts[0] = new Contact(3,"최예진","010-2217-9280","none");
		contacts[1] = new AdditionalContact(1,"김이랑","010-1234-5678","N","N","N","N","N");
		contacts[2] = new AdditionalContact(5,"한경아","010-1234-5678","N","N","N","N","N");
		contacts[3] = new AdditionalContact(4,"정수아","010-1234-5678","N","N","N","N","N");
		contacts[4] = new Contact(8,"송우림","010-1234-5678","N");
		contacts[5] = new Contact(6,"김지원","010-1234-5678","N");
		contacts[6] = new AdditionalContact(2,"박도영","010-1234-5678","N","N","N","N","N");
		contacts[7] = new Contact(7,"김한빈","010-1234-5678","N");
		
		siri.addNewContact(contacts);
		
		Contact find = siri.getContactAt(7);
		
		if(find !=null) {
			System.out.println(find.toString());
		}		
		System.out.println("===========================");
		siri.sort();
		
		
	}
}
