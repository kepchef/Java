package sub1;

public class StockAccount extends Account {
	//Account 뒤에는 부모(super, parent), 앞에는 자식(Child, Deriver)
	//Account 폴버에서 상속받아서 사용함(bank, id, name,money)
	
	

	//맴버변수
	private String stock;
	private String amount;
	private String price;
	
	public StockAccount(String bank, String id, String name, int money, String stock, int amount, int price) {
		super(bank, id, name, money); // 부모클래스 생성자 호출
	//맴버메서드
	public void sell(int amount, int price) {
		this.amount += amount;
		int total = amount * price;
		money += total;
		
	}
	
	public void buy(int amount, int price) {
		this.amount += amount;
		int total = amount * price;
		money -= total;
	}
	
	public void show() {
		
		System.out.println("==============");
		System.out.println("은행명: "+bank);
		System.out.println("계좌번호: "+id);
		System.out.println("입금주 : "+name);
		System.out.println("현제잔액 : "+money);
		System.out.println("주식종목 : "+stock);
		System.out.println("주식수량 : "+amount);
		System.out.println("주식가격: "+price);
	}
}
