package org.java.condition;

import java.util.Scanner;

public class Switch5 {

	public static void main(String[] args) {

		System.out.println("switch��");

		Scanner scn = new Scanner(System.in);

		System.out.println("ù��° �����Է�");
		int num1 = scn.nextInt();// �����Է�

		System.out.println("�ι�° ���� �Է�");
		int num2 = scn.nextInt();// �����Է�

		System.out.println("�����ȣ �Է�");
		char op = scn.next().charAt(0);// char (�ѱ���) ���ڿ����� 0��°
		// == String op =scn.next();

		int result = 0; // �ʱ�ȭ �ʿ�
		// ���࿡ op�� (+ - * / % ) �ϳ���
		switch (op) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		case '%':
			result = num1 % num2;
			break;
		}// break�� ��ġ

		System.out.println("������ ��� : " + num1 + " " + op + " " + num2 + " = " + result);

		scn.close();
	}
}
