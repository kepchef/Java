package Test6;

class Rent {
	public void payment() {
		System.out.println("�Ӵ�Ḧ �޽��ϴ�.");
	}
}

class Landload extends Rent {

	public void getMoney() {
		System.out.println("�ǹ��� �Դϴ�.");
		payment();
	}
}

