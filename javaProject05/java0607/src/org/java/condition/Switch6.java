package org.java.condition;

import java.util.Scanner;

public class Switch6 {

	public static void main(String[] args) {
		
		System.out.println("switch ��");
		
		Scanner scn = new Scanner(System.in);
											//C R U D
		System.out.println("�������� �Է����ּ��� (insert, update, select, delete)");
		String input = scn.next();//String = "���ڿ�" char = '����'(����ǥ�� �����ؼ� ����ؾ��Ѵ�.)
		
		switch(input) {
		case "insert":
			System.out.println(input+" - ȸ������ �������� �̵��մϴ�.");
			break;
		case "update":
			System.out.println(input+" - ȸ������ �������� �̵��մϴ�.");
			break;
		case "select":
			System.out.println(input+" - ȸ����ȸ �������� �̵��մϴ�.");
			break;
		case "delete":
			System.out.println(input+" - ȸ��Ż�� �������� �̵��մϴ�.");
			break;
		default:
			System.out.println(input+" - ������ �Է¿��� �Դϴ�.");
		}

		//charAt()--���ڿ����� Ư�����ڸ� �̾Ƴ�
		System.out.println("java2022".charAt(0));//���ڿ�0(j)
		System.out.println("java2022".charAt(1));//���ڿ�1(a)
		System.out.println("java2022".charAt(2));//���ڿ�2(v)
		System.out.println("java2022".charAt(3));//���ڿ�3(a)
		System.out.println("java2022".charAt(4));//���ڿ�4(2)
		System.out.println("java2022".charAt(5));//���ڿ�5(0)
		System.out.println("java2022".charAt(6));//���ڿ�6(2)
		System.out.println("java2022".charAt(7));//���ڿ�7(2)
		
		
		
		
		
		scn.close();
	}
}
