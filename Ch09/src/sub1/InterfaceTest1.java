package sub1;
/*
 * ��¥/2020/11/12
 * �̸�:����ǥ
 * ����:�������̽� �ǽ��ϱ� ���� p228
 */

public class InterfaceTest1 {
	
	public static void main(String[] args) {
		
		//�������̽�-Ŭ���� ������ ǥ�� ���̵带 ����
		RemoteControl lg = new RemoteLg();
		lg.powOn();
		lg.chUp();
		lg.powOff();
		
		RemoteControl samsung = new RemoteSamsung();
		samsung.powOn();
		samsung.chDown();
		samsung.powOff();
		
	}
}
