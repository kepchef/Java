package p171;

public class Student {
	// 필드
	String name;// 학생명
	int grade; // 학년
	String department;// 학과
	private String n;

	// 1번 생성자
	Student() {

	}

	// 2번 생성자
	Student(String n) {
		name = n;
	}

	// 3번 생성자
	Student(String m, int g) {
		name = n;
		grade = g;
	}

	// 4번생성자
	Student(String n, int g, String d) {
		name = n;
		grade = g;
		department = d;
	}

}