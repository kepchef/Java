package p156;

public class ReturnEx2 {
	public static void main(String[] args) {
		
		return2 obj = new return2();
		
		obj.getTest(0);
		obj.getTest(1);
		
		System.out.println(obj.getname(0));
		System.out.println(obj.getname(1));
	}

}
class return2 {
	void getTest(int type) {
		System.out.println("getTest()�޼��� ����");
		
		if(type == 1) {
			return;
		}
		System.out.println("getTest()�޼��� ��");
	}
	String getname(int type) {
		if(type == 1) {
			return "";
		}
		return "ȫ�浿";
	}
}