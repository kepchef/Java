package sub2;

/*
 * 날짜:2020/11/16
 * 이름:김은표
 * 내용:다양한 예외종류 실습하기 교재 p265
 */
public class VarietyOfExceptionTest {
	public static void main(String[] args) {

		// 배열의 인텍스번호 참조 에러
		int arr[] = new int[3];

		for (int i = 0; i <= 3; i++) {
			try {
				arr[i] = i + 1;
			} catch (ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
			}
		}
		for (int num : arr) {
			System.out.println("arr 값: " + num);
		}

		// NullPoint 에러
		try {
		Tiger tiger = null;
		
		tiger.move();
		tiger.hunt();
		
		}catch (NullPointerException e) {
		e.printStackTrace(); 
		}
		}
		

}
