package sub3;
/*
 * ��¥/2020/11/12
 * �̸�:����ǥ
 * ����:�������̽� �ǽ��ϱ� ���� p228
 */

public class InterfaceTest3 {
	
	public static void main(String[] args) {
		
		//�������̽�-��ü���� ���Ե��� ��ȭ(�߰���Ȱ)
		
		Bulb bulb = new Bulb();
		Socket socket = new Cable(bulb);
		
		socket.switchOn();
		socket.switchOff();
	}
}
