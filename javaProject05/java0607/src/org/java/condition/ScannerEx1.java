package org.java.condition;

import java.util.Scanner;

public class ScannerEx1 {

	public static void main(String[] args) {
		System.out.println("�������� �Է��ؼ� (insert,update,select,delete)");
		Scanner scn = new Scanner(System.in);

		System.out.println("��ɾ �Է����ּ���");
		String str = scn.nextLine();

		if (str.equals("insert")) {
			System.out.println(str + " - ȸ�� ������������ �̵��մϴ�");
		} else if (str.equals("update")) {
			System.out.println(str + " - ȸ�� ������������ �̵��մϴ�");
		} else if (str.equals("select")) {
			System.out.println(str + " - ȸ�� ��ȸ�������� �̵��մϴ�");
		} else if (str.equals("delete")) {
			System.out.println(str + " - ȸ�� Ż���������� �̵��մϴ�");
		} else {
			System.out.println(str + " - �߸��� �Է��Դϴ�.");
		}

		scn.close();

	}
}
