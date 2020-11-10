package sub1;
/*
 * 날짜:2020/11/09
 * 이름:김은표
 * 내용:
 */


public class Account {
	
	//계좌속성:멤버변수(Field)는 무조건 캡슐화를(privete선언 + 생성자 정의) 적용해야 한다.
	//protected 선언으로 자식 클래스에서 참조할 수 이게 허가한다.
	protected String bank;
	protected String id;
	protected String name;
	protected int money;
	
	//생성자(Constructor): 클래스의 멤버변수를 초기화	
	public Account(String bank, String id, String name, int money) {
		this.bank = bank;
		this.id = id;
		this.name = name;
		this.money = money;
	} 
	
	//계좌기능:멤버메서드
	public void deposit(int _money) {
		money += _money;
	}
	public void wihdraw(int _money) {
		money -= _money;
	}
	public void show() {
		System.out.println("=======");
		System.out.println("은행명 : "+bank);
		System.out.println("계좌번호 : "+id);
		System.out.println("입금주 : "+name);
		System.out.println("현제잔액 : "+money);
	}
}
