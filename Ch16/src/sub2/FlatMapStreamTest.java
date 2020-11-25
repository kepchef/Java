package sub2;

import java.util.Arrays;
import java.util.List;

/*
 * ��¥:2020.11.23
 * �̸�:����ǥ
 * ����:FlatMap() ��Ʈ�� �ǽ��ϱ� ��ä p436
 */

public class FlatMapStreamTest {
	
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("������,������","�庸��,������","�̼���,���߱�");
		
		System.out.println("------------------");
		names.stream().forEach(name->System.out.println(name));
		
		System.out.println("------------------");
		names.stream().flatMap((name)->Arrays.stream(name.split(","))).forEach(name->System.out.println(name));
		}
}
