package p255;

public class LocallnnerEx {//�ٱ�Ŭ��
	int i = 10;
	
	void outermethod() {
		class Inner{//���� �۷���
			int x=20;//�޼��� ��������
			int i=30;//�޼��� ��������
			void innerMethod() {
				 System.out.println(x);
				 System.out.println(i);//���� Ŭ������ i����
				 System.out.println(this.i);//���� Ŭ������ i����
				 System.out.println(LocallnnerEx.this.i);//�ٱ� Ŭ������ i����
			}
		}
		Inner inn = new Inner();
		inn.innerMethod();
	}
	public static void main(String[] args) {
		LocallnnerEx lic = new LocallnnerEx();
		lic.outermethod();
	}

}
