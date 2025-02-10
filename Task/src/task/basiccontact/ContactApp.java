package task.basiccontact;


public class ContactApp  {
	/**
	 * contact 배열에 들어간 연락처의 개수
	 */
	private int size;
	/**
	 * 연락처를 저장할 배열
	 */
	private Contact[] contacts;

	/**
	 * ContactApp의 생성자
	 * 
	 * @param contactMaxCount - contacts 배열에 들어갈 수 있는 최대 연락처 개수
	 */
	public ContactApp(int contactMaxCount) {
		this.contacts = new Contact[contactMaxCount];
	}

	/**
	 * 연락처를 추가하는 메소드
	 * 
	 * @param contact
	 */
	public void addNewContact(Contact[] contact) {
		int length = this.contacts.length;
		for (int i = 0; i < length; i++) {

			if (this.contacts[i] != null && this.contacts[i].getSequence() == contact[i].getSequence()) {
				System.out.println("같은 순번이 있습니다. 다른 순번으로 매겨주세요.");
			}
		}
		this.contacts = contact;
		this.size += 1;
		System.out.println("연락처가 추가되었습니다.");
	}

	/**
	 * 연락처를 반환하는 메소드
	 * 
	 * @param contactIndex 전달 받은 index에 해당하는 연락처가 초회 되어야한다.
	 * @return
	 */
	public Contact getContactAt(int contactIndex) {
	    for (int i = 0; i < this.contacts.length; i++) {
	        // 연락처가 null이 아니고, 순번이 일치하는 경우
	        if (this.contacts[i] != null && this.contacts[i].getSequence() == contactIndex) {
	            System.out.println("찾으시는 연락처는 : ");
	            return this.contacts[i];  // 일치하는 연락처를 반환
	        }
	    }
	    
	    // 모든 연락처를 확인했는데도 일치하는 연락처가 없으면
	    System.out.println("일치하는 연락처가 없습니다.");
	    return null;  // 일치하는 연락처가 없으면 null 반환
	}

	/**
	 * 클래스에 연락처를 순번대로 오름차순 정렬하는 메소드
	 */
	public void sort() {
	    int length = this.contacts.length;  // 연락처 배열의 길이를 저장

	    // 버블 정렬 (Bubble Sort)
	    for (int i = 0; i < length - 1; i++) { // 외부 루프: 배열의 끝까지 반복
	        boolean swapped = false; // 스왑이 발생했는지 체크하는 변수
	        for (int j = 0; j < length - 1 - i; j++) { // 내부 루프: 인접한 두 원소를 비교
	            // contacts[j]와 contacts[j + 1]이 null이 아닌지 확인
	            if (this.contacts[j] != null && this.contacts[j + 1] != null) {
	                // sequence 값이 더 큰 경우 두 원소를 교환
	                if (this.contacts[j].getSequence() > this.contacts[j + 1].getSequence()) {
	                    // 스왑을 위한 임시 변수
	                    Contact temp = this.contacts[j];
	                    this.contacts[j] = this.contacts[j + 1];
	                    this.contacts[j + 1] = temp;
	                    swapped = true; // 스왑이 일어났음을 표시
	                }
	            }
	        }
	        // 만약 한 번의 루프에서도 스왑이 일어나지 않았다면, 이미 배열이 정렬된 상태이므로 반복을 중단
	        if (!swapped) {
	            break;
	        }
	    }

	    // 정렬된 배열을 출력 위에서 하면 정렬 하다가 출력 되기 떄문에.
	    for (int i = 0; i < length; i++) {
	        if (this.contacts[i] != null) {
	            System.out.println(this.contacts[i]);
	        }
	    }
	}



}
