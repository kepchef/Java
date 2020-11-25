package sub2;

import java.util.Arrays;
import java.util.List;

/*
 * 날짜:2020.11.23
 * 이름:김은표
 * 내용:FlatMap() 스트링 실습하기 교채 p436
 */

public class FlatMapStreamTest {
	
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("김유신,김춘추","장보고,강감찬","이순신,안중근");
		
		System.out.println("------------------");
		names.stream().forEach(name->System.out.println(name));
		
		System.out.println("------------------");
		names.stream().flatMap((name)->Arrays.stream(name.split(","))).forEach(name->System.out.println(name));
		}
}
