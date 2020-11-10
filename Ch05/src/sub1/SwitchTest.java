package sub1;

import java.util.Scanner;

/*
 * 날짜:2020/11/03
 * 이름:김은표
 * 내용:조건문 Switch 실습하기 교재p86
 */
public class SwitchTest {
	public static void main(String[] args) {
		
		int num = 7;
		int result = num %2;
		
		switch(result) {
		
		case 0:
			System.out.println("num은 짝수입니다.");
			break;
		
		case 1:
			System.out.println("num은 홀수입니다.");
			break;
		}
		//d연습
		Scanner sc =new Scanner(System.in);
		System.out.println("점수 입력 : ");
		
		int score = sc.nextInt();
		System.out.println("입력 점수 :" +score);
		
		int rs = score / 10;
		
		switch(rs) {
		case 10:
		case 9:
			System.out.println("A입니다.");
		    break;
		case 8:
			System.out.println("B입니다.");
		    break;
		case 7:
			System.out.println("C입니다.");
		    break;
		case 6:
			System.out.println("D입니다.");
		    break;
		default:
			System.out.println("F입니다.");
		    break;
		}
	}
}
				
				
