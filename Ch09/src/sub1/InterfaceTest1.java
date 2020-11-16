package sub1;
/*
 * 날짜/2020/11/12
 * 이름:김은표
 * 내용:인터페이스 실습하기 교재 p228
 */

public class InterfaceTest1 {
	
	public static void main(String[] args) {
		
		//인터페이스-클래스 설계의 표준 가이드를 제공
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
