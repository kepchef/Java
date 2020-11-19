package sub2;

public class Count {

	private int num;

	public int getNum() {
		return num;
	}

	// 동시화블럭 선언으로 스레트간 경합을 막는다.
	public synchronized void setNum() {
		num++;
	}
}
