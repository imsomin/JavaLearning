package Base;

public class day10_1 {
	
	//Ŭ���� ����

		//���� ���� ����
		int a;             
		//-->> Ŭ���� ���� �ƴ�
		//-->> �ڵ����� 0���� �ʱ�ȭ ����
		
		//Ŭ���� ������ �����ϴ� ��������(Ŭ���� ������ ���� ��밡���� ����)
		//Ŭ���� �������� �ν��Ͻ�����(instance variable)�� Ŭ��������(class variable)�� �����ϰ�,
		//�޼��� �������� ��������(location variale)�� �����Ѵ�.
		
		//���⼭ �ν��Ͻ������� Ŭ���������� ū �������� static�� �پ� �ֳ� �� �پ� �ֳ��� �����̴�.
		//�پ������� Ŭ��������, �پ����� ������ �ν��Ͻ������̴�.
		//Ŭ���� ���� -> ��ü������ ���� �ʰ� ��밡��(static�� �ٿ����Ƿ�)
		//�ν��Ͻ� ���� -> ��ü������ �ؾ� ��밡��

		boolean b;

		char c;

		double d;
		
		int alpha = 7;  //�ν��Ͻ� ����
		static double beta;  //Ŭ��������

		public static void main(String[] args) 
		{
			//�޼ҵ� ����
			System.out.println("����� ��������");
			int lv;
			
			//System.out.println("a : " + a);
			//������ ���� �߻� 
			// error: non-static variable a cannot be referenced from a static context

			//day10_1 Ŭ������ ������� ��ü(object) ����
			//--�ν��Ͻ� ������ �ν��Ͻ��� ������ �� ��������µ�
			//  �� �ν��Ͻ� ������ ���� �����ϰų� �ҷ� ������
			//  ���� �������� ��ü�� �����ؾ� �Ѵ�. �ڡڡ�
			day10_1 ob = new day10_1();
			//ob��� ���� ������ ���Ͽ� 
			//�ν��Ͻ� ����(������ a,b,c,d,alpha�� �ش�)�� ���� �����ϰų� �������� ��������� ����� �ִ�.

			System.out.println("ob.a : " + ob.a);
			//==>> ob.a : 0
			//-->> �ڵ����� 0���� �ʱ�ȭ ����
			
			System.out.println("ob.b : " + ob.b);
			//==>> ob.b : false

			System.out.println("ob.c : " + ob.c);
			//==>> ob.c : 

			System.out.println("ob.d : " + ob.d);
			//==>> ob.a : 0.0
			
			System.out.println("ob.alpha : " + ob.alpha);
			//==>> ob.alpha : 7
			//���� �о� ���ų� ���� �����ϱ� ���� �ν��Ͻ� ������ ����Ϸ��� ������ ��ü�� ������ �Ѵ�!!!
		}

		/*
		�ٸ� �޼ҵ�1()
		{
		}
		*/

		/*
		�ٸ� �޼ҵ�2()
		{
		}
		*/

}


//���
/*
����� ��������
ob.a : 0
ob.b : false
ob.c : 
ob.d : 0.0
ob.alpha : 7
*/



