package org.java.varable;

public class VarEx2 {
	public static void main(String[] args) {

		System.out.println("����, ������ Ÿ��");
		System.out.println("primitive type");

		// ===�ڹ��� �⺻����===
		// ������ ������
		byte b = 10; // ������ ������ 1byte�� ���� �� �� �ִ� ���� b�� ���� �ϰ� 10���� �ʱ�ȭ �ߴ�. b�� �����ִ� ���ڰ� -128 ����
						// +127���� �����ִ�.
		short s = 10; // ������ ������ 2byte�� ���� �� �� �ִ� ���� b�� ���� �ϰ� 10���� �ʱ�ȭ �ߴ�.
		int i = 10; // ������ ������ 4byte�� ���� �� �� �ִ� ���� b�� ���� �ϰ� 10���� �ʱ�ȭ �ߴ�.
		long l = 10L; // ������ ������ 8byte�� ���� �� �� �ִ� ���� b�� ���� �ϰ� 10���� �ʱ�ȭ �ߴ�.
		// �Ǽ��� ������
		float f = 1.1F; // �Ǽ��� ������ 4byte�� ���� �� �� �ִ� f�� �����ϰ� 1.1�� �ʱ�ȭ�ߴ�.
		double d = 1.1; // �Ǽ��� ������ 8byte�� ���� �� �� �ִ� d�� �����ϰ� 1.1�� �ʱ�ȭ�ߴ�.
		// ������ ������
		char ch = 'a'; // ������ ������ 2byte�� ���� �� �� �ִ� ch�� �����ϰ� 'a'�� �ʱ�ȭ�ߴ�.

		boolean bool = false; // boolean�� 1byte�� ���� �� �� �ִ� ���� bool�� �����ϰ� false�� �ʱ�ȭ�ߴ�.

		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(ch);
		System.out.println(bool);
	}

}
