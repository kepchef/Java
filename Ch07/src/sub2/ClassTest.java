package sub2;
/*
 * ��¥:2020/11/09
 * �̸�:����ǥ
 * ����:�ڹ� Ŭ���� �ǽ��ϱ� ���� p140
 */


public class ClassTest {
	public static void main(String[] args) {
		
		
		//�������� ��ü(Instance)���� �� �ʱ�ȭ
		Account kb = new Account("��������", "121- 11-1234", "������", 100000);
		
		//�������� ��ü Ȱ���ϱ�
		kb.deposit(15000);
		
		//ĸ��ȭ �������� ����ڵ� ����
		//kb.monet++;
		
		kb.wihdraw(5000);
		kb.show();
		
		//�츮���� ��ü(Instance)����
		Account wr = new Account("�츮����","121-12-1234","������",5000);
		
		//�츮���� ��ü Ȱ���ϱ�
		wr.deposit(10000);
		//ĸ��ȭ �������� ����ڵ� ����
		//wr.monet++;
		wr.wihdraw(7000);
		wr.show();
		
	}
}
	
