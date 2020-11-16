package sub2;
/*
 * 날짜/2020/11/12
 * 이름:김은표
 * 내용:인터페이스 실습하기 교재 p228
 */

public class InterfaceTest2 {
	
	public static void main(String[] args) {
		
		//인터페이스-다중상속 효과를 구현하는 역활
		SmartTv stv = new SmartTv();
		stv.powerOn();
		stv.bootting();
		stv.internet();
		stv.poweroff();
	}

}
