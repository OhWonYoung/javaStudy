package org.java.test;

import java.util.Scanner;

public class test_0609_sol {

	public static void main(String[] args) {
		System.out.println("���� , ����, ���� ������ �Է��ϰ� ����, ����� ���Ͻÿ�.");

		Scanner scn = new Scanner(System.in);

		System.out.println("���� ����: ");
		int kor = scn.nextInt();

		System.out.println("���� ����: ");
		int math = scn.nextInt();

		System.out.println("���� ����: ");
		int eng = scn.nextInt();

		int sum = kor + math + eng;
		double avg = (double) sum / 3;

		System.out.println("���� : " + sum + "��");
		System.out.println("��� : " + avg + "��");

		scn.close();
	}
}