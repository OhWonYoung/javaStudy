package org.java.condition;

import java.util.Scanner;

public class Switch4 {

	public static void main(String[] args) {
		
		System.out.println("������ �Է�(0~100)");
		
		Scanner scn = new Scanner(System.in);
		
		int num = scn.nextInt();//�����Է�(����)
		
		char grade = ' ';
		
		switch(num/10) {// �Է�����/10 ���� 100�̳� 9�̸�
		case 10:	//100
		case 9: 	//99~90
			grade = 'A';
			break;
		case 8: 	//89~80
			grade = 'B';
			break;
		case 7:		//79~70
			grade = 'C';
			break;
		case 6:		//69~60
			grade = 'D';
			break;	
		default:
			grade = 'F';
		}
		
		System.out.println("����: "+ grade);
		
		
		scn.close();
	}
}
