package p219;

public class Animal {
	
	String type;
	protected String name;
	
	public Animal(String type, String name){
		this.type = type;
		this.name = name;
	}
	 public void sleep() {
		 System.out.println(this.name +"��(��) ���� �ܴ�.");
	 }

}
