package p146;

public class CarMain2 {

	public static void main(String[] args) {
		//Car Ÿ���� �迭��ü ����
		Car[] car2 = new Car[3];
		//��� �ε����� new �����ڷ� ��ü ���� �� ����
		for(int i=0; i < Car.length; i++) {
			cars[i]=new Car();
			cars[i]="ȭ��Ʈ";
			cars[i]="���";
			cars[i]="����";
		}
		System.out.println("0�� �ε��� color : "+cars[0],color);
		System.out.println("1�� �ε��� color : "+cars[1],color);
		System.out.println("2�� �ε��� color : "+cars[2],color);
		
		cars[0]. color = "��";//0���ε��� ��ü�� color �ʵ忡 "��" ����
		
		System.out.println("0�� �ε��� color : "+cars[0],color);
		System.out.println("1�� �ε��� color : "+cars[1],color);
		System.out.println("2�� �ε��� color : "+cars[2],color);
	}

}
