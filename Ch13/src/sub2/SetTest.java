package sub2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * 날짜:2020/11/18
 * 이름:김은표
 * 내용: Collection Set 실습하기 교재 p357
 */

public class SetTest {
	public static void main(String[] args) {
		
		
		//set 생성화 데이터 저장
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(3);
		set.add(2);
		set.add(7);
		set.add(5);
		
		//set 원소 갯수
		System.out.println("set 원소 갯수: "+set.size());
		
		//set 원소 출력
		Iterator<Integer> iter = set.iterator();
		
		while(iter.hasNext()) {
			System.out.println("set 원소 : "+iter.next());
			
		}
	}
}
