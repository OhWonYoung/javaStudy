package org.java.loop;

import java.util.Scanner;

public class For2 {

	public static void main(String[] args) {
		System.out.println("for��");
		// ������
		// �� 2 3456789
		// �� 123456789

		// 2~9�� ���
		for (int i = 2; i < 10; i++) {
			System.out.println(i + "�� �Դϴ�.");

			for (int j = 1; j < 10; j++) {
				System.out.println(i + " X " + j + " = " + (i * j));
			}
		}

		// 9�ܺ��� 2�ܱ��� ���
		System.out.println("==========================================");

		for (int i = 9; i > 1; i--) {
			System.out.println(i + "�� �Դϴ�.");
			for (int j = 9; j > 0; j--) {
				System.out.println(i + " X " + j + " = " + (i * j));
			}
		}
		System.out.println("==========================================");

		// Scanner Ŭ���� �̿��ؼ� ���� ���� �Է¹޾Ƽ� �������� �Է´�~9�ܱ��� ���
		System.out.println("�������� �Է����ּ���");
		Scanner scn = new Scanner(System.in);

		System.out.println("���� ���� �Է����ּ���");
		int startNum = scn.nextInt();
		System.out.println("�� ���� �Է����ּ���");
		int endNum = scn.nextInt();

		System.out.println(startNum + " " + endNum);
		if (startNum > endNum) {//�̷��� else�� for ���� �־���Ѵ�.
			System.out.println("���۴��� ���ܺ��� �۰ų� ���ƾ��մϴ�");
		} else {
			for (int i = startNum; i < endNum + 1; i++) {
				System.out.println(i + "�� �Դϴ�.");
				for (int j = 1; j < 10; j++) {
					System.out.println(i + " X " + j + " = " + (i * j));
				}
			}

		}

		scn.close();

	}
}
