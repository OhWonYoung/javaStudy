package org.java.test;

import java.util.Scanner;

public class test_0609 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		System.out.println("���� ������ �Է����ּ���.");
		double ko = scn.nextInt();

		System.out.println("���� ������ �Է����ּ���.");
		double en = scn.nextInt();

		System.out.println("���� ������ �Է����ּ���.");
		double ma = scn.nextInt();

		int to = (int) (ko + en + ma);
		System.out.println("���� ������ " + to + "�� �Դϴ�.");

		double aver = (ko + en + ma) / 3;
		System.out.println("��� ������ " + aver + "�� �Դϴ�.");

	}
}
