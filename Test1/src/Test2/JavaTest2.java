package Test2;

import java.util.Scanner;
/*
 * ��¥:2020/11/04
 * �̸�:����ǥ
 * ����:�ڹ� �⺻ ����� ��������
 */
public class JavaTest2 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int input;
		System.out.println("input �� �Է�: ");
		
		input = sc.nextInt();
		int result = (1+2)* input;
		
		System.out.println("(1 + 2) x input = "+result);
		
		String name = "ȫ�浿";
		System.out.println("name �� �Է� : ");
		
		name = sc.next();
		String hello = ("�ȳ�!" + name + "�� �ݰ����ϴ�.");
		
		System.out.println(hello);
	}

}