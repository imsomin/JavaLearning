//static ����(Ŭ��������)�� static �޼ҵ�(Ŭ�����޼ҵ�)

//(�������� ������ ������ �ǽ�)

//ź�������� ���� ��
//--Ŭ���� ���� �Ǵ� Ŭ���� �޼ҵ�� Ŭ������ �����Ǵ� ������ �޸𸮸� �Ҵ�޴´�.
//--������ �ν��Ͻ��� ���ؼ� �����ؾ� �Ѵ�.

// <non -  static>  
//�ν��Ͻ� ����, �ν��Ͻ� �޼ҵ� 
//��������, �����޼ҵ�

//     vs

// <static>
//Ŭ��������, Ŭ�����޼ҵ�
//��������, �����޼ҵ�

package Medium;

class Intro {
	
	// Ŭ���� ���� �Ǵ� Ŭ���� �޼ҵ��
    // Ŭ���� ������ �ε��Ǵ� ���� �޸� �Ҵ��� �̷������,
	// Ŭ���� �̸� �Ǵ� ��ü(�ν��Ͻ�)�� ���� ������ �� �ִ�.
	// ��, 'new' �����ڸ� ���� �޸𸮸� �Ҵ���� �ʾƵ�
	// ����� �����ϴٴ� ���̴�.

	public static String classVar = "Ŭ���� ���� ��";   //--static���� (Ŭ��������, class����, ��������)

	public String instanceVar = "�ν��Ͻ� ���� ��";          //--non-static���� (�ν��Ͻ�����, instance����, ��������)
	
	// �ν��Ͻ� ���� �Ǵ� �ν��Ͻ� �޼ҵ��
	// ������ Ŭ������ �޼ҵ忡���� �ٷ� �����ϴ� ���� ����������
	// Ŭ���� �޼ҵ忡���� ������ �� ����.
	
	public static void classMethod()  //--static�޼ҵ� (Ŭ�����޼ҵ�, class�޼ҵ�, �����޼ҵ�)
	{
		System.out.println(classVar); //Ŭ���� ���� ��
		//System.out.println(instanceVar); //--static ������ �ȵǾ�, �� ź�������� �����̶� ������ ���� �߻�
		                                   //-- Ŭ���� �޼ҵ忡���� ����� �Ұ���
	}
	
	public void instanceMethod()      //--non-static�޼ҵ� (�ν��Ͻ��޼ҵ�, instance�޼ҵ�, �����޼ҵ�)
	{
		System.out.println(classVar);
		System.out.println(instanceVar);
	}
	
		
}//end class Intro

public class day15_2{
	
	public static void main(String[] args) {
		
		System.out.println(Intro.classVar); 
		//-->Ŭ���� ���� ��
		
		//System.out.println(Intro.instanceVar);  //--static ������ �ȵǾ� ���� ��� �Ұ�
		
		Intro.classMethod(); 
		//-->Ŭ���� ���� ��
		
		//Intro.instanceMethod();   //--static ������ �ȵǾ� ���� ��� �Ұ�
		 
		//-----------------------------------------------------------------------
		
		//Intro Ŭ���� ��� �ν��Ͻ� ����
		Intro I1 = new Intro();
		Intro I2 = new Intro();
		
		System.out.println(I1.classVar); 
		//-->Ŭ���� ���� ��
		//(static ���� ������ �ּҰ��� ������)
		System.out.println(I1.instanceVar);
		//-->�ν��Ͻ� ���� ��
		//(static�� ���� ������ ���� �����ؼ� ������)
		
		I1.classVar = "I1�� ���Ͽ� Ŭ���� ������ �����Ͽ���";
		System.out.println(Intro.classVar); 
		//-->I1�� ���Ͽ� Ŭ���� ������ �����Ͽ���
		System.out.println(I2.classVar); 
		//-->I1�� ���Ͽ� Ŭ���� ������ �����Ͽ���
		
		I1.instanceVar = "I1�� ���Ͽ� �ν��Ͻ� ������ �����Ͽ���";
		System.out.println(I1.instanceVar); 
		//-->I1�� ���Ͽ� �ν��Ͻ� ������ �����Ͽ���
		System.out.println(I2.instanceVar); 
		//-->�ν��Ͻ� ���� ��
		//(������� ���� Ȯ��!!)
		
		I1.instanceMethod();
		/*
		I1�� ���Ͽ� Ŭ���� ������ �����Ͽ���
		I1�� ���Ͽ� �ν��Ͻ� ������ �����Ͽ���
		*/
		
		I2.instanceMethod();
		/*
		I1�� ���Ͽ� Ŭ���� ������ �����Ͽ���
		�ν��Ͻ� ���� ��
		*/
		
		//-->> Intro Ŭ������ ���Ͽ� ���� ����� �� �ִ� ���� class ������ class �޼ҵ��̴�.
		//-->> I1�� I2�� �ν��Ͻ���, ���� ������ ��ҿ� ���尪�� ��´�. �׷��Ƿ� ���ο��� ������ ��ġ�� �ʴ´�.
	}
	
	
	
	
}