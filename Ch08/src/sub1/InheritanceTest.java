package sub1;
/*
 * ��¥: 2020/11/10
 * �̸�: ����ǥ
 * ����: Ŭ���� ��� �ǽ��ϱ� p196
 */

public class InheritanceTest {
	
	public static void main(String[] args) {
		
		StockAccount kb = new StockAccount("kb����", "123-11-1234", "������", 10000, "�Ｚ����", 10, 53000);
		
		kb.sell(5, 51000);
		kb.buy(10, 50100);
	}
	
}
