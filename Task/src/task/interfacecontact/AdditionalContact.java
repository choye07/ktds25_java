package task.interfacecontact;


/**
 * 추가 연락처 클래스
 */
public class AdditionalContact extends Contact{

	/**
	 * 생년월일
	 */
	private String birth;
	/**
	 * 회사 이름
	 */
	private String companyName;
	/**
	 * 회사 직급
	 */
	private String position;
	/**
	 * 주소
	 */
	private String address;
	
	
	/**
	 * AdditionalContact 생성자
	 * @param sequence 순번
	 * @param name 이름
	 * @param phone 전화번호
	 * @param image 이미지
	 * @param birth 생년월일
	 * @param companyName 회사명
	 * @param position 직급
	 * @param address
	 */
	public AdditionalContact(int sequence, String name, String phone,String image, String birth, String companyName,String position, String address) {
		super(sequence, name, phone,image);
		this.birth= birth;
		this.companyName = companyName;
		this.position = position;
		this.address = address;
	}
		
	/**
	 * 배열에 있는 객체 반환하기 위한 메소드 
	 */
	   @Override
	    public String toString() {
//		   super.toString();
	        return   super.toString() +"birth: " + this.birth + ", companyName: " + this.companyName + ", position: " + this.position +",address: "+ this.address;
	    }
}
