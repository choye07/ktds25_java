package task.hw0213;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void run() {
		ContactAppInterface app1 = new ContactApp("C:\\Users\\WIN\\Desktop\\FileIOExam","contact.txt");
		List<String> data = new ArrayList<>();
		data.add(new Contact(0,"도경수","010-0000-0001","20250214").toFileFormat());
		data.add(new Contact(1,"김한빈","010-0000-0002","N").toFileFormat());
		app1.writeData("C:\\Users\\WIN\\Desktop\\FileIOExam","newcontact.txt", data);
		
		List<String> data2 = new ArrayList<>();
		ContactAppInterface app2 = new OtherContactApp("C:\\Users\\WIN\\Desktop\\FileIOExam\\OtherContact","othercontact.txt");
		data2.add(new ExtendContact(3,"정수아","010-0000-0001","20250214","N","N","N","N").toFileFormat());
		data2.add(new ExtendContact(4,"박도영","010-0000-0002","N","N","N","N","N").toFileFormat());
		app2.writeData("C:\\Users\\WIN\\Desktop\\FileIOExam\\OtherContact","newothercontact.txt", data2);
	}

	public static void main(String[] args) {
		run();
	}

}
