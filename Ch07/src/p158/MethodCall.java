package p158;

public class MethodCall {
	public static void main(String[] args) {
		//流立角青
		Method.printName();
		
		//按眉甫 积己秦辑 角青
		Method m = new Method();
		m.printEmail();
	}
}
class Method{
	static void printName() {
		System.out.println("printName()角青";
	}
	void printEmail() {
		System.out.println("printEmail()角青");
		
		printId(){
			System.out.println("printId()角青");
		}
	}
}
