package Test4;
/*
 * ��¥:2020/11/04
 * �̸�:����ǥ
 * ����:�ڹ� ������ ��������
 */
public class JavaTest4 {
	public static void main(String[] args) {
		
		int x = 4;
		int y = 2;
		int z = 0;
		
		z = x + y;
		System.out.println("x + y= " +z);
				
		z = x - y;
		System.out.println("x - y= " +z);
				
		z = x * y;
		System.out.println("x * y= " +z);
				
		z = x / y;
		System.out.println("x / y= " +z);
		
		z = (x + y) * (x - y);
		System.out.println("(x + y) * ( x- y)= " +z);
				
		z = (x * y) + (x / y);
		System.out.println("(x * y) + (x / y)= " +z);
	}

}
