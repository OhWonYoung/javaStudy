package org.java.loop;

import java.util.Scanner;

public class While2 {

	public static void main(String[] args) {
		System.out.println("while ������");
		// ������ 2~9eks
		int i=2;//1�̸� i++�� �Ʒ���
		
		while(i<10) {
			System.out.println(i+"�� �Դϴ�.");

			int j=1;
			while(j<10) {
				System.out.println(i+" X "+j+" = "+(i*j));
				j++;
			}
			//j������ ������ i�� �����ؾ���
			i++;
		}
	
		System.out.println("==================================");
		
		//Scanner���� �Է´�(����)�� �̿��ؼ� �������� ���
		//ex)4�Է��ϸ� 4~9�� ���
		System.out.println("���۴��� �Է����ּ���");
		Scanner scn = new Scanner(System.in);
		
		int num = scn.nextInt();
		
		while(num<10) {
			System.out.println("::: "+num+"�� :::");
			int j=1;
			while(j<10) {
				System.out.println(num + " X "+ j + " = "+(num*j));
				j++;
			}
			num++;
		}
	
	}
}
