package trip.signin;

import java.util.Scanner;

public class SignIn {

	Scanner sc = new Scanner(System.in);
	
	private String name;
	private String id;
	private String pwd;
	private String email;
	private String tel;
	
	public SignIn() {}

	public SignIn(String name, String id, String pwd, String email, String tel) {
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


	public void signin() {
		System.out.println();
		System.out.print("   이름을 입력하세요 : ");
		setName(sc.next());
		System.out.print("   아이디를 입력하세요 : ");
		setId(sc.next());
		System.out.print("   비밀번호를 입력하세요 : ");
		setPwd(sc.next());
		System.out.print("   이메일을 입력하세요 : ");
		setEmail(sc.next());
		System.out.print("   전화번호를 입력하세요 : ");
		setTel(sc.next());
		System.out.println("   " + name + "님 회원가입을 환영합니다!");
		System.out.println();
		
	}
	
	@Override
	public String toString() {
		String signInfo = String.format("   \n   [회원 가입 정보] \n   >>> 이름 : %s | 아이디 : %s | 이메일 : %s | 전화번호 : %s \n", name, id, email, tel);
		return signInfo;
	}
	
	
}
