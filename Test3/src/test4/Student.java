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
		System.out.println("학번 : "+studenId);
		System.out.println("이름 : "+studentname);
		System.out.println("전공 : "+major);
		System.out.println("학년 : "+grade);
	}

public static void main(String[] args)  {
	
		Student.studenId = 20201000;
		
		Student kim = new Student("김유신", "국문과", 1);
		kim.studentInfo();
		
		Student lee = new Student("이순신", "경제학과", 1);
		lee.studentInfo();
		
		Student lim = new Student("임꺽정", "경영학과", 1);
		lim.studentInfo();
	}
}
