package sub3;

public class CCC extends BBB {
	/*
	 * 부모클래스의 BBB의 Method1에 final 선언으로 Override를 할 수 없다.
	@Override //BBB method 1
	public void method1(){
		System.out.println("CCC~ method1...");
	}
	*/
	@Override //AAA method2
	public void method2(){
		System.out.println("CCC~ method2...");
	}
	
	@Override//AAA method3
	public void method3(int a){
		System.out.println("CCC~ method3...");
	}
}
