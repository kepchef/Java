package sub4;
/*
 * ��¥:2020/11/10
 * �̸�: ����ǥ
 * ����:��������(Ŭ��������), �����޼���(Ŭ�����޼���) �ǽ��ϱ�
 */
public class StaticTest {
	public static void main(String[] args) {
		
		Increment inc1 = new Increment();//1
		Increment inc2 = new Increment();//1+1=2
		/*
		  ��������(Ŭ���� ����), �����޼���(Ŭ���� �޼���)�� �̹� �����Ҵ翵��(method Area)��
		  �����Ǿ� �ֱ� ������ ��ü �������� �ٷ� ���� �� �� �ִ�.
		 */
		
		inc1.num1 = 1;		
		inc2.num2 = 2;		
		
		Increment.num2 += 3;//2+2=5
		Increment.add();//5+1=6
		
		Increment inc3 = new Increment();//6+1=7
		
		//�̱��� ��ü - ���� p185
		Calc cal = Calc.getInstance();
		
		int r1 = cal.plus(1, 2);
		int r2 = cal.minus(1, 2);
		int r3 = cal.multi(1, 2);
		int r4 = cal.div(1, 2);
		
		System.out.println("r1 : "+r1);
		System.out.println("r2 : "+r2);
		System.out.println("r3 : "+r3);
		System.out.println("r4 : "+r4);
		
	}

}
