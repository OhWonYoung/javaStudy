package org.java.operator;

public class AscII1 {

	public static void main(String[] args) {
		
		
		System.out.println('A');
		System.out.println((int)'A');
		
		char ch='A';
		
		System.out.println("=========================");
		
		System.out.println(ch);
		System.out.println((int)ch);
		
		System.out.println("=========================");

		//�ҹ��� >> �빮��
		//int�� �Ʒ� ����� �ڵ����� int ������ ����ȯ
		System.out.println('B'-'A');
		System.out.println('a'-'A');
		System.out.println('b'-32);			//�ҹ��� -->> �빮��
		System.out.println('b');
		System.out.println((char)('b'-32));	//int-->>char
		
		System.out.println("=========================");
		//�빮�� >> �ҹ���
		System.out.println('A');
		System.out.println('A'+32);			//�빮�� -->> �ҹ���
		System.out.println((char)'A'+32);
		System.out.println((char)('A'+32));
		
		
		
		
	}
}
