// ���簢�� Ŭ���� ���� �ǽ�

/*
���簢���� ���̿� �ѷ� ��� -> Ŭ���� ǥ��

Ŭ������ ��ü�� -> ���簢��
Ŭ������ �Ӽ�    -> ����, ����, (����, �ѷ�, ����, ����, ����, ����,..)
Ŭ������ ���    -> ���� ���, �ѷ� ���, ���μ��� �Է�, ��� ���,....

��ü�� ����      -> ������(�Ӽ�, ����) + ���(����, ����)
		               ��	                       ��
Ŭ������ ����   ->   ����             +     �޼ҵ�
*/



package Base;


import java.util.Scanner;

class Rect      // ���簢�� Ŭ���� ����
{

	//Scanner sc = new Scanner(System.in);  //-->>���������δ� �����ϳ�
	                                        //���� �ʿ�� ���� �ʴ� �κп��� �޸� ������ �ʿ� ����


	//������(�Ӽ�, ����)  
	//���� ���� ���� ���� 
	int w, h;       

	
	//���(����, ����)
	//�޼ҵ�(1)
	//���μ��� �Է� �޼ҵ�  
	void input()                     
	{
		//���� input�޼ҵ�� �Ѱ� ���� �� �ƹ��͵� ����...
		//�ֳ��ϸ� ����ڿ��� ���� ����ñ� �����̴�.
		//���� ���⿡�� �Ű������� ���� ���̴�!
		
		//input �տ��� ��ȯ�ڷ���
		//��, input ȣ��� �� �����͸� ���� ���� �������� ����
		//�����ڰ� �ƴ� �̻�, void�� ����� �Ѵ�.
		//����, int�� ���� �ȴٸ� return�� ���ش�.

		//���� ���� sc�� �������̳� ���� ������ sc�� ���θ� �� �� ����
		Scanner sc = new Scanner(System.in);   //-->>�������� ��ġ �ľ�(�ʿ��� ������ �Է�����)
		
		System.out.print("���� �Է� : ");
		//w = sc.next();                        //>>next()�� ���ڿ� ���·� �޾ƿ�
		w = sc.nextInt();                       //>>��ĳ�ʴ� �ٷ� ���� ���·� �޾ƿ� �� ����
												//>>�ڿ� Int�� �߰��� ����!(br �ʿ����)
		
		System.out.print("���� �Է� : ");
		h = sc.nextInt();
	
	}

	
	//�޼ҵ�(2)
	// �ѷ� ���()  -> (����+����)*2
	int calLength()                
	{

		int result;

		result = (w+h)*2;

		return result;

		//int(w,h)���� ������� ��Ƴ� �������� �ִ���?
		//->����
		//�׷��� result ���� ����...
		//�̷� ��� return�� �Ἥ ������� �Ѵ�.

		//�ڡڡ�calLength(int w, int h)�� �ƴ� ����!
		//���� ���� int w�� int h�� ���δ�.
		//�׷��� �Ű����� �Ѱ��� �� ����...

		//return (w+h) * 2;
		//���� ������ ������ ���� ǥ���� ����
		
	}

	
	//�޼ҵ�(3)
	// ���� ���()  -> ����*���� 
	int calArea()                  
	{
		int result;

		result = w*h;

		return result;
	}
	

	//�޼ҵ�(4)
	// ��� ���()
	void print(int a, int l)                   
	{
		// ���� : 10
		// ���� : 20
		// ���� : xxx
		// �ѷ� : xxx

		System.out.println("���� : " + w);
		System.out.println("���� : " + h);
		System.out.println("���� : " + a);
		System.out.println("�ѷ� : " + l);  
		
		return;

		//ȣ��� ���� ���� ���� ���� �����ϱ� void�� ����
		//�׳� ��¸� �� ������ ���ڿ��� ���� ���� ���� �ƴ�
	}

}


//=======================================================
//   �ϳ��� �ڹ� ����(.java)�� ���� ���� Ŭ����(class)�� ������ �� �ִ�.
//   ������, 'public class'�� �ϳ��� �� �� �ִ�.
//   ������ ������ ���� �̸���
//   �� 'public class'�� �̸����� �����ؾ� �Ѵ�.
//   �Ϲ������� �ϳ��� ���Ͽ� �ϳ��� Ŭ������ �����Ѵ�.
//   ����, ���� ���� Ŭ������ ����� ������ �������ϰ� �Ǹ�
//   ���ο� ����� Ŭ������ �� ��ŭ Ŭ���� ����(.class)�� �Ļ��ȴ�.
//=======================================================



public class day10_2 {
	
	public static void main(String[] args) 
	{
		// Rect Ŭ���� ����� �ν��Ͻ� ����
		//new Rect();          //-->>�� ���, �޸� �ۿø�
		Rect ob = new Rect();  //-->>�޸� �ۿø��� �� �Ӹ� �ƴ϶� ������� �� ����


		//�Է� �޼ҵ� ȣ��
		ob.input();    //���ο� ���� �Է¹޴� ����

		//���� ���� �޼ҵ� ȣ��                         //->>�޼ҵ��� ������ �������. 
		int area = ob.calArea();  //�������� ���� ������ area�� ��� �����

		//�ѷ� ���� �޼ҵ� ȣ��
		int length = ob.calLength();

		//��� �޼ҵ� ȣ��
		ob.print(area, length);




	}

}

//���
/*
���� �Է� : 7
���� �Է� : 9
���� : 7
���� : 9
���� : 63
�ѷ� : 32
*/