package Test6;

import java.util.Scanner;

public class Test6 {
	public static void main() {
		System.out.println("**********start*********");
		System.out.println("�ΰ��� ������ �Է�");
	}

	public static int input(String name) {
		System.out.println("���� " + name + "�� �Է� : ");

		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		return input;
	}

	public static void result(int val) {
		System.out.println("���� ��� : " + val);
		System.out.println("*****END*****");
	}

	public static int add(int x, int y) {
		return x + y;
	}

	public static void main(String[] args) {
		intro();
		
		int a = input("a");
		int b = input("b");

		int output = add(a, b);
		result(output);
	}

	private static void intro() {
		// TODO Auto-generated method stub
		
	}

}
