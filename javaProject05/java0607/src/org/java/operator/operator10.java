package org.java.operator;

public class operator10 {

	public static void main(String[] args) {
		System.out.println("���� ������");
		// ���迡 �߳��� �ر��� ����. ��ȣ�� �ڿ� ������(i++,i--) ��ó��
		// �տ� ������(++i,--i) ��ó��
		int i = 10;

		// ��ó�� ������
		System.out.println(i++); // i=10
		System.out.println(i);// i=11

		// ������ ��ó��
		System.out.println(++i); // i=12
		System.out.println(i); // i=12

		// ��ó�� �İ���
		System.out.println(i--); // i=12
		System.out.println(i); // i=11

		// ������ ��ó��
		System.out.println(--i); // i=10
		System.out.println(i); // i=10

		// for�������� ���� �����ڰ� ��ó��, ��ó�� ������� ����� �Ȱ���.(���� �߿���.)

		for (int i1 = 0; i1 < 10; i1++) {
			System.out.print(i1 + " ");
		}

		System.out.println(" ");

		for (int i1 = 0; i1 < 10; ++i1) {
			System.out.print(i1 + " ");
		}

	}
}
