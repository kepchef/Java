package p57;
/*
 * ��¥:2020/11/03
 * �̸�:����ǥ
 * ����:��������
 */
public class OpEx3 {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 10;
		
		++a;
		b++;
		
		System.out.println(a);
		System.out.println(b);
	}
	{
		int a = 10;
		int b = ++a;
		
		System.out.println("�������� ���: "+b);
		
		int x = 10;
		int y = x++;
		System.out.println("���������� : " +y);
		System.out.println("x : " +x);

	}

}
