package p173;

public class Car2 {
	
	//�ʵ�
	String color;
	String company;
	String type;
	
	Car2(){
		this("white", "���", "����");
	}
	Car2(String color, String company, String type){
		this.color = color;
		this.company = company;
		this.type = type;
	}
	
	Car2(String com, String t){
		this("white", com, t);
	}
	Car2(String t){
		this("white", "rldk", t);
	}
	
	public String toStirng(){
		return color + "-" + company + "-" + type;
	}
}