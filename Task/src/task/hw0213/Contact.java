package task.hw0213;

public class Contact {

	private int number;
	private String name;
	private String phoneNumber;
	private String profile;
	
	public Contact(int number, String name, String phoneNumber, String profile) {
		this.number = number;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.profile = profile;
	}
	
	public Contact(String[] conArray) {
		this.number = Integer.parseInt(conArray[0]);
		this.name = conArray[1];
		this.phoneNumber = conArray[2];
		this.profile = conArray[3];
	}

	public int getNumber() {
		return this.number;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("No. " + this.number + "\n");
		sb.append("Name. " + this.name + "\n");
		sb.append("PhoneNumber. " + this.phoneNumber + "\n");
		sb.append("Profile. " + this.profile + "\n");
		return sb.toString();
	}

	public String toFileFormat() {
        return this.number + "," + this.name + "," + this.phoneNumber + "," + (this.profile != null ? profile : "N");
    }
	
}
