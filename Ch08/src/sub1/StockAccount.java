package sub1;

public class StockAccount extends Account {
	//Account �ڿ��� �θ�(super, parent), �տ��� �ڽ�(Child, Deriver)
	//Account �������� ��ӹ޾Ƽ� �����(bank, id, name,money)
	
	

	//�ɹ�����
	private String stock;
	private String amount;
	private String price;
	
	public StockAccount(String bank, String id, String name, int money, String stock, int amount, int price) {
		super(bank, id, name, money); // �θ�Ŭ���� ������ ȣ��
	//�ɹ��޼���
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
		System.out.println("�����: "+bank);
		System.out.println("���¹�ȣ: "+id);
		System.out.println("�Ա��� : "+name);
		System.out.println("�����ܾ� : "+money);
		System.out.println("�ֽ����� : "+stock);
		System.out.println("�ֽļ��� : "+amount);
		System.out.println("�ֽİ���: "+price);
	}
}
