package task.interfacecontact;

/**
 * Contact 앱을 위한 인터페이스
 */
public interface ContactManager {
	/**
	 * 연락처 추가
	 * @param contact
	 */
	public void addNewContact(Contact[] contact);
	/**
	 * 연락처  찾기
	 * @param contactIndex
	 * @return
	 */
	public Contact getContactAt(int contactIndex);
	/**
	 * 연락처 오름차순으로 정렬
	 */
	public void sort();
	
	

}
