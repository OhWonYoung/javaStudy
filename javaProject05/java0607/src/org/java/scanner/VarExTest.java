package org.java.scanner;

import java.util.Scanner;

public class VarExTest {

	public static void main(String[] args) {
		
		/*
		 ������ (����)�� �Է��ؼ� ���� ���̸� ���ϼ���.
		 ����� �ֿܼ� ���
		 ������ PI = 3.14(final ���)
		 ������ radius
		 ���� ���� = ������* ������*PI
		 Scanner, nextInt(); �̿�
		 */
		
		
		
		final double PI = 3.14;//final ����� �빮�ڷθ� �ۼ��ϴ°� ������
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("���� ���̸� ���Ͻÿ�.");
		
		System.out.println("�������� �Է����ּ���.(������)");
		int radius = scn.nextInt();
		
//		double circleNum = radius*radius*PI;
		int circleNum = (int)(radius*radius*PI);//�ڿ� ������ ���� �����־�� �ȴ�.
		
		System.out.println(radius+"*"+radius+"*"+PI+"="+(radius*radius*PI));
		System.out.println("���� ����: "+circleNum);
		
//		System.out.println("�Է��� ������: " + radius);
		
//		System.out.println("���� ���̴� "+radius*radius*PI+ " �Դϴ�.");
		
		
		
	}
}
