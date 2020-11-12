package p176;

public class InitEx2 {
	//static변수
	static int sVar;
	
	//static메서드
	static void sMethod() {
		
	}
	//인스턴스 변수
	int var;
	//인스턴스 메서드
	void method() {
		
	}
	//static 초기화블럭
	static {
		sVar = 0;//static변수
		sMethod();//static메서드
		
		//에러(인스턴스 변수, 메서드 사용 불가)
		var = 0;//인스턴스 변수
		method();//인스턴스 메서드
	}
	
	//static 메서드
	static void sMethod2() {
		
		//에러( static메서드에서 this 키워드 사용불가)
		this.sVar = 0;//static변수
		this.sMethod();//static메서드
	}
	
}
