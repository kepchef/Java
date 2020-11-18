package sub1;

import java.util.ArrayList;
import java.util.List;

/*��¥:2020.11.18
 * �̸�:����ǥ
 * ����:Collection List �ǽ��ϱ� ���� p348
 */

public class ListTest {
	public static void main(String[] args) {

		// ����Ʈ ����
		List<Integer> list1 = new ArrayList<>();

		// List ������ ����
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.remove(2);
		list1.add(1, 3);

		// List ���
		for (int i = 0; i < list1.size(); i++) {
			System.out.println("List 1�� ������ : " + list1.get(i));

			// ���ڿ� List ������ ������ ����
			List<String> list2 = new ArrayList<>();
			list2.add("������");
			list2.add("������");
			list2.add("�庸��");
			list2.add("������");
			list2.add("�̼���");

			for (String person : list2) {
				System.out.println("person : " + person);
			}

			// ��� LIst ������ ������ ����
			List<Apple> list3 = new ArrayList<>();
			Apple a1 = new Apple("�ѱ�", 3000);
			Apple a2 = new Apple("�Ϻ�", 2500);
			Apple a3 = new Apple("�߱�", 2000);

			//�ѱ� ��� ���
			Apple koApple = list3.get(0);
			koApple.show();
			
			//�Ϻ� ��� ���
			list3.get(1).show();
			
			//�߱� ��� ���
			list3.get(2).show();
		}
	}
}
