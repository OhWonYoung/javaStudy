package org.java.loop;

public class For1 {

	public static void main(String[] args) {
		System.out.println("for��");
		
		for(int i=0; i<10; i++) {
//			System.out.println(i);
//			System.out.print(i+" ");
				System.out.print((i+1)+" , ");
			//1~10���� �ֿܼ� ���
//			int i2=i+1;
//			System.out.println(i2);
		}
		System.out.println("===============================");
		
		//������ , ���� �ʱ�
		for(int i2=0;i2<10;i2++) {
//			if(i2==9) { // �߰��߰� �����ϰ�������� ������
//				System.out.print(i2+1);
//			}else {
//				System.out.print((i2+1)+" , ");
//			}
			
			if(i2==9) {// ���������� �����ϰ� ������ ���� ��
				System.out.print(i2+1);
				break;//���� ��ɹ��� ������ϰ� �ݺ����� ����
			}
			System.out.print((i2+1)+" , ");
		}//break��
		
		System.out.println("======================================================");
		
		for(int i=0;i<10;i++) {
			
//			String url="";
			System.out.println("url(img/bg"+i+".jpg) no-repeat 50%/cover");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
