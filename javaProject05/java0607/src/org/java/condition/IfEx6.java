package org.java.condition;

import java.util.Scanner;

public class IfEx6 {

	public static void main(String[] args) {
		System.out.println("if�� ����");
		
		System.out.println("����, ����, ���� ������ �Է�, ����, ���, ����(���)");
		//Scanner Ŭ���� �̿��ؼ� ����Ÿ���� ������, ���ǹ� if�̤ˤ�
		//����,����,���� (0~100����), ����(����), ���(double)
		//���(double)���̿��ؼ� ������ ����غ�����
		//95�̻��̸� A+ 90�̻�A
		//85�̻��̸� B+ 80�̻�B
		//75�̻��̸� C+ 70�̻�C
		//65�̻��̸� D+ 60�̻�D
		//60�̸��̸� F
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("���� ������ �Է����ּ���");
		int kor = scn.nextInt();
		
		System.out.println("���� ������ �Է����ּ���");
		int eng = scn.nextInt();
		
		System.out.println("���� ������ �Է����ּ���");
		int math = scn.nextInt();
		
		System.out.println("�������� : " +kor+" �������� : "+eng+ " �������� : "+math);
		
		int sum = kor+eng+math;
		System.out.println("���� " +sum+"���Դϴ�.");
		
		double avg = (double)sum/3;
		System.out.println("��� " +avg +"�� �Դϴ�.");
		
		
		if(avg>=90) {
			if(avg>=95) {
				System.out.println("����: A+");
			}else {
				System.out.println("����: A");
			}
		}else if(avg>=80) {
			if(avg>=85) {
				System.out.println("����: B+");
			}else {
				System.out.println("����: B");
			}
		}else if(avg>=70) {
			if(avg>=75) {
				System.out.println("����: C+");
			}else {
				System.out.println("����: C");
			}
		}else if(avg>=60) {
			if(avg>=65) {
				System.out.println("����: D+");
			}else {
				System.out.println("����: D");
			}
		}else {
			System.out.println("����: F");
		}
		
		scn.close();
		
		
		
		
	}
}
