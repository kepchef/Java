package p241;

import p240.Animal;

public class AnimalMain {
	
	public static void main(String[] args) {
		
		Animal eagle = new Eagle();
		
		eagle.sleep();
		//eagle.eat();// 에러

		Eagle eagleObj = (Eagle)eagle;//강제 형변환
		eagleObj.eat();//eagle 클래스의 eat() 메서드
		
	}

}
