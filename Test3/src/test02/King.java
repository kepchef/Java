package test02;
/*
 * ��¥ : 0000/00/00
 * �̸� : ȫ�浿
 * ���� : Ŭ���� ������ ��������
 */
class King {
	private String name;
	private int year;
	
	public King(int year) {
		this("����");
		this.year = year;		
	}
	
	public King(String name) {		
		this.name = name;
	}
	
	public King(String name, int year) {
		this.name = name;
		this.year = year;
	}
	
	public void show() {
		System.out.println("name : "+name);
		System.out.println("year : "+year);
	}
}
