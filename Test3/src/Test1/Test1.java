package Test1;

import java.util.jar.Attributes.Name;

public class Test1 {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		Test1 obj = new Test1();
		obj.setName("ȫ�浿");
				
		System.out.println(obj.getName());
	}
}
