package sub2;
/*
 * ��¥:2020/11/09
 * �̸�:����ǥ
 * ����:
 */


public class Account {
	
	//���¼Ӽ�:�������(Field)�� ������ ĸ��ȭ��(privete���� + ������ ����) �����ؾ� �Ѵ�.
	private String bank;
	private	String id;
	private String name;
	private int money;
	
	//������(Constructor): Ŭ������ ��������� �ʱ�ȭ	
	public Account(String bank, String id, String name, int money) {
		this.bank = bank;
		this.id = id;
		this.name = name;
		this.money = money;
	} 
	
	//���±��:����޼���
	public void deposit(int _money) {
		money += _money;
	}
	public void wihdraw(int _money) {
		money -= _money;
	}
	public void show() {
		System.out.println("=======");
		System.out.println("����� : "+bank);
		System.out.println("���¹�ȣ : "+id);
		System.out.println("�Ա��� : "+name);
		System.out.println("�����ܾ� : "+money);
	}
}
