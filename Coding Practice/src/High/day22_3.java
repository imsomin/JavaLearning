//�ڹ��� �ֿ�(�߿�) Ŭ����

//Object Ŭ����


package High;

class NewCar
{
	private int velocity;    //�ڵ����� �ӵ�
	private int wheelNum;    //�ڵ����� ���� ����
	private String carName;  //�ڵ����� �̸�

	NewCar(int speed, String name, int wheel)
	{
		velocity = speed;
		carName = name;
		wheelNum = wheel;
	}
}



public class day22_3 {


	public static void main(String[] args)
	{

		NewCar nCar1 = new NewCar(80, "�ƹݶ�", 4);
		NewCar nCar2 = new NewCar(150, "�׷���", 4);

		//equals()
		System.out.println("1-1 : " + nCar1.equals(nCar2));
		System.out.println("1-2 : " + (nCar1 == nCar2));
		//������
		/*
		1-1 : false
		1-2 : false
		*/

		//��ü ���� --> ���� �ǹ��� ����(������) -> �ּҰ� ����
		NewCar nCar3 = nCar1;
		
		System.out.println("2-1 : " + nCar1.equals(nCar3));
		System.out.println("2-2 : " + (nCar1 == nCar3));
		//������
		/*
		2-1 : true
		2-2 : true
		*/


		//toString()
		System.out.println("3-1 : " + nCar1.toString());
		System.out.println("3-2 : " + nCar2.toString());
		System.out.println("3-3 : " + nCar3.toString());
		//������
		/*
		3-1 : High.NewCar@7852e922
		3-2 : High.NewCar@4e25154f
		3-3 : High.NewCar@7852e922
		*/

		//hashcode()
		System.out.println("4-1 : " + nCar1.hashCode());
		System.out.println("4-2 : " + nCar2.hashCode());
		System.out.println("4-3 : " + nCar3.hashCode());
		//������
		/*
		4-1 : 2018699554
		4-2 : 1311053135
		4-3 : 2018699554
		*/
		//������� 16���� ���·� �ٲٰ� �Ǹ�
		//'toString()' �޼ҵ尡 ��ȯ�� ����� Ȯ�� ����.

		//getClass()  //������ Car �޼ҵ��� �⺻���� �����̳ĸ� �˷��ִ� �޼ҵ�
		System.out.println("5-1 : " + nCar1.getClass());
		System.out.println("5-2 : " + nCar2.getClass());
		System.out.println("5-3 : " + nCar3.getClass());
		//������
		/*
		5-1 : class High.NewCar
		5-2 : class High.NewCar
		5-3 : class High.NewCar
		*/
		//--> ������ ��ü�� ���� 
		//    �ش� ��ü�� ��� ���赵�� Ȯ���� �� �ִ� ����� ���� �޼ҵ�

		//clone()     -->> ��ü ����

		//finalize()  -->> ��ü ����ȭ

		//��Ÿ ������ �޼ҵ�� thread ó���� ������ �ִ�.


	}
	
	
	
}
