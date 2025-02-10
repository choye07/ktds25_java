package task.basiccontact;


/**
 * 휴대폰 연락처 앱에서 다루는 기본 연락처 정보
 */
public class Contact {
	/**
	 * 연락처 순번
	 */
	private int sequence;
	/**
	 * 이름
	 */
	private String name;
	/*
	 * 전환번호
	 */
	private String phone;
	/*
	 * 지정 이미지
	 */
	private String image;
	
	/**
	 * Contact 생성자
	 * @param sequence 순번
	 * @param name 이름
	 * @param phone 전화번호
	 * @param image 이미지
	 */
	public Contact(int sequence, String name, String phone, String image) {
		this.sequence = sequence;
		this.name = name;
		this.phone = phone;
		this.image = image;
	}
	
	/**
	 * 시퀀스 getter
	 * @return
	 */
	public int getSequence() {
		return this.sequence;
	}
	
	/**
	 * 배열에 들어온 객체 출력해주기 위한 메소드
	 */
    @Override
    public String toString() {
        return "sequence: " + sequence + ", Name: " + name + ", Phone: " + phone+",image "+image;
    }

}
