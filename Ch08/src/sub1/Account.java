package sub1;
/*
 * ��¥:2020/11/09
 * �̸�:����ǥ
 * ����:
 */


public class Account {
	
	//���¼Ӽ�:�������(Field)�� ������ ĸ��ȭ��(privete���� + ������ ����) �����ؾ� �Ѵ�.
	//protected �������� �ڽ� Ŭ�������� ������ �� �̰� �㰡�Ѵ�.
	protected String bank;
	protected String id;
	protected String name;
	protected int money;
	
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
