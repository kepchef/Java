package test4;

public class Student {
	public static int studenId;
	private String studentname;
	private String major;
	private int grade;
	
	public Student(String studentName, String major, int prade) {
		
		this.studenId = studenId+1;
		this.studentname = studentName;
		this.major = major;
		this.grade = grade;
	}
	
	public void studentInfo() {
		System.out.println("==========");
		System.out.println("�й� : "+studenId);
		System.out.println("�̸� : "+studentname);
		System.out.println("���� : "+major);
		System.out.println("�г� : "+grade);
	}

public static void main(String[] args)  {
	
		Student.studenId = 20201000;
		
		Student kim = new Student("������", "������", 1);
		kim.studentInfo();
		
		Student lee = new Student("�̼���", "�����а�", 1);
		lee.studentInfo();
		
		Student lim = new Student("�Ӳ���", "�濵�а�", 1);
		lim.studentInfo();
	}
}
