
package task.basiccontact;

import task.basiccontact.exceptions.ContactAppException;
import task.basiccontact.exceptions.ContactNotFoundException;
import task.basiccontact.exceptions.ContactOutBoundsException;
import task.basiccontact.exceptions.NullContactException;

public class ContactMain {
	public static void main(String[]args) {
		
		ContactApp siri = new ContactApp(8);		
		
		Contact[] contacts = new Contact[8]; // 필요에 따라 동적으로 크기 변경 가능
		
		
		contacts[0] = new Contact(1,"최예진","010-2217-9280","none");
		contacts[1] = new AdditionalContact(3,"김이랑","010-1234-5678","N","N","N","N","N");
		contacts[2] = new AdditionalContact(5,"한경아","010-1234-5678","N","N","N","N","N");
		contacts[3] = new AdditionalContact(4,"정수아","010-1234-5678","N","N","N","N","N");
		contacts[4] = new Contact(8,"송우림","010-1234-5678","N");
		contacts[5] = new Contact(6,"변백현","010-1234-5678","N");
		contacts[6] = new AdditionalContact(2,"박도영","010-1234-5678","N","N","N","N","N");
		contacts[7] = new Contact(7,"김한빈","010-1234-5678","N");
		
		if(contacts.length <7) {
			System.out.println("123");
		}
		
		
		siri.addNewContact(contacts);
		
		
		
		siri.remove(2);
		
		//멀티 캐치. 
		// 한줄로 줄이는 방법 두 가지가 있다.
		try {			
			Contact find = siri.getContactAt(2);
			System.out.println(find.toString());
			// cath(RuntimeException re) => 절대 쓰면 안됨 -> 모든 exception을 다 잡기 때문에 안된다.	
			// 던지는 예외가 명확하면 잡는 것도 명확하게 해줘야한다.
		}
//		파이프 캐치 : if문에서 || 조건 처럼 3가지 중 하나를 throw로 해준다.
		//catch한 Exception 예외를 RuntimeException으로 변환해서 던지기.
		// 위 코드를 호출하는 코드에서는 try~catch 불필요.
		catch(ContactNotFoundException | ContactOutBoundsException | NullContactException exception) {
//			System.out.println("실패 사유: " + exception.getMessage());
			throw new ContactAppException(exception.getMessage(),exception);


		}
//		catch(ContactOutBoundsException cobe) {
////			System.out.println("실패 사유: " + cobe.getMessage());
//		}
//		catch(NullContactException nce) {
//			System.out.println("실패 사유: " + nce.getMessage());
//		}

		
	
//		
//		siri.sort();
//		//멀티 캐치. 
//				// 한줄로 줄이는 방법 두 가지가 있다.
//				try {			
//					Contact find = siri.getContactAt(2);
//					System.out.println(find.toString());
//					// cath(RuntimeException re) => 절대 쓰면 안됨 -> 모든 exception을 다 잡기 때문에 안된다.	
//					// 던지는 예외가 명확하면 잡는 것도 명확하게 해줘야한다.
//				}
//				//if문에서 || 조건 처럼 3가지 중 하나를 throw로 해준다.
////				catch(ContactNotFoundException | ContactOutBoundsException | NullContactException exception) {
////					System.out.println("실패 사유: " + exception.getMessage());
////				}
//				catch(ContactOutBoundsException cobe) {
//					System.out.println("실패 사유: " + cobe.getMessage());
//				}
//				catch(NullContactException nce) {
//					System.out.println("실패 사유: " + nce.getMessage());
//				}
		
	}
}
