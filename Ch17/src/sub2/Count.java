package sub2;

public class Count {

	private int num;

	public int getNum() {
		return num;
	}

	// ����ȭ�� �������� ����Ʈ�� ������ ���´�.
	public synchronized void setNum() {
		num++;
	}
}
