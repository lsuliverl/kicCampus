package collection;

// 주소록 데이터를 표현하기 위한 java beans
public class Member {

	private String name;
	private String phoneNO;
	public Member(String name, String phoneNO) {
		super();
		this.name = name;
		this.phoneNO = phoneNO;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNO() {
		return phoneNO;
	}
	public void setPhoneNO(String phoneNO) {
		this.phoneNO = phoneNO;
	}
	@Override
	public String toString() {
		return "Memeber [name=" + name + ", phoneNO=" + phoneNO + "]";
	}
	
	
}
