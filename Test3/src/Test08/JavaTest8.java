package Test08;

import Test8.Television;

/*
 * ��¥ : 0000/00/00
 * �̸� : ȫ�浿
 * ���� : ������ ��������
 */
public class JavaTest8 {
	public static void main(String[] args) {
		
		Product p1 = new Television("����", 100);
		Product p2 = new Computer("��ǻ��", 150);
		
		p1.info();
		p2.info();		 
	}
}