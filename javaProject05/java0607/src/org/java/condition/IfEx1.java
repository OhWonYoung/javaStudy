package org.java.condition;

import java.util.Scanner;

public class IfEx1 {

	public static void main(String[] args) {
		
		System.out.println("if��");
		
		//������ true�϶��� ����
		
		System.out.println("������ �ϳ��϶�");
		int num=10;
		if(num>=10) {
			System.out.println("10���� ũ�ų� �����ϴ�.");
		}
		if(num>=10) System.out.println("10���� ũ�ų� �����ϴ�");//���ٺ��� ���ٷ� �ۼ�
		if(num>=10) 
			System.out.println("10���� ũ�ų� �����ϴ�");
		
		//���δ� ��� ���������� 2���̻��̸� {}�� ����ؾ��Ѵ�.
		
		//Scanner �̿��ؼ� ������ �Է¹޾Ƽ� 100���� ũ�� �ֿܼ� "100���� ũ��"
		//if �� �ϳ��� �̿��ؼ� ���α׷��غ�����.		
		
		Scanner scn = new Scanner(System.in);
		int key = scn.nextInt();
		if(key>100) {
			System.out.println("100���� ũ��.");
		}
		
		//Scanner ���̵� �Է��ؼ� ���̰��� "root"�� "��ſ� ���εǼ���" ǥ��
		//if �� �ϳ��� �̿��ؼ� ���α׷��� �غ�����.
		
		System.out.println("���̵� �Է�");
		String userId = scn.next();
		if(userId.equals("root"))
			System.out.println("��ſ� ���εǼ���.");
		
		
		
		
	}
}
