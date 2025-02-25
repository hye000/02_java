package trip.model.vo;

public class CustomerInfo{

	private String name;
	private String id;
	private String pwd;
	private String email;
	private String tel;
	
	public CustomerInfo() {}

	public CustomerInfo(String name, String id, String pwd, String email, String tel) {
		super();
		this.name = name;
		this.id = id;
		this.pwd = pwd;
		this.email = email;
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		String signInfo = String.format("  [회원가입 정보]   이름 : %s | 아이디 : %s | 이메일 : %s | 전화번호 : %s ", name,
				id, email, tel);
		return signInfo;
	}
	
}
