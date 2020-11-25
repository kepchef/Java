package p232;

public class Complexer implements printer, Scanner, Fax {

	@Override
	public void send(String tel) {
		System.out.println(FAX_NUMBER+"����"+tel+"�� FAX����");
	}

	@Override
	public void receive(String tel) {
		System.out.println(tel+"����"+FAX_NUMBER+"�� ����");
	}

	@Override
	public void scan() {
		System.out.println("��ĵ ����");
	}

	@Override
	public void print() {
		System.out.println("��� ����");
	}
}
