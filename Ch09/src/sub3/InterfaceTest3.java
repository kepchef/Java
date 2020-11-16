package sub3;
/*
 * 날짜/2020/11/12
 * 이름:김은표
 * 내용:인터페이스 실습하기 교재 p228
 */

public class InterfaceTest3 {
	
	public static void main(String[] args) {
		
		//인터페이스-객체간의 결함도를 완화(중간역활)
		
		Bulb bulb = new Bulb();
		Socket socket = new Cable(bulb);
		
		socket.switchOn();
		socket.switchOff();
	}
}
