package sub2;
/*
 * ��¥:2020/11/03
 * �̸�:����ǥ
 * ����:�ݺ��� for �ǽ��ϱ� ���� p90
 */

public class ForTest {
	public static void main(String[] args) {
		
		//for ����
		for(int i=1; i<=3 ;i++) {//�ʱ��; ���ǽ�; ������
			
			System.out.println("Hello java!");
		}
		
		//1���� 10���� ��
		int sum = 0;
		
		for(int k=1; k<=10; k++) {
			sum += k;
		}
		System.out.println("1���� 10���� �� : "+sum);		
		
		//1���� 10���� ¦����
		int eSum =0;
		
		for(int k=1; k<=10; k++) {
			if(k % 2 == 0) {
				eSum += k;
			}
		}
		System.out.println("1���� 10���� ¦���� : " +eSum);
		
		
		//for ��ø(���� for)
		for(int a=1; a<=3; a++) {//3�� �ݺ�
			
			System.out.println("a: "+a);
			
			for(int b=1; b<=5; b++) {//5�� �ݺ�
			
				System.out.println("b: "+b);
			}
		}
		
		//������ ���
		for(int x=2; x<=9; x++) {
			
			System.out.println(x + "��");
			
			for(int y=1; y<=9; y++) {
				
				int z= x *y;
				//System.out.println(x + "x" + y + "=" + z );
				System.out.printf("%d x %d = %d \n", x, y, z);//java�������ε� ����
			}
		}
		
		//���ﰢ��1 ���
		for(int start=1; start <=10; start++) {
			
			for(int end=1; end <= start; end++) {//1+2+3+~~+10 ����������
				
				System.out.print("��");
			}
			System.out.print("\n");
		}
		//�ǽ�
		for(int start=10; start >=1; start--) {
			
			for(int end=1; end <= start; end++) {
				
				System.out.print("��");
			}
			System.out.print("\n");
		}
		
		//���ﰢ��2 ���
		for(int a=1; a<=5; a++) {
			
			for(int b=1; b<=5-a; b++) {
				System.out.println("��");
			}
				
			for(int c=1; c<=a; c++) {
				System.out.println("��");
			}
			System.out.println("\n");
		}
	}
}
