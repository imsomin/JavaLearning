//�޼ҵ��� �ߺ�����(Method Overloading)

//�޼ҵ� �����ε��� ����
/*
-�������̵��� �򰥸� ����!
-�ڹ��� �� Ŭ���� ���� �̹� ����Ϸ��� �̸��� 
���� �̸��� ���� �޼ҵ尡 �ִ���
�޼ҵ� ��ȣ �ӿ� ���� �μ�(����, �Ű�����, �Ķ����)�� ������ �ٸ��ų�, 
�ڷ���(Data Type)�� �ٸ� ���
�޼ҵ��� �̸��� ������ �̸����� �ο��Ͽ� �޼ҵ带 ������ �� �ֵ��� 
���������� ����ϰ� �Ǵµ�
�̸� �޼ҵ� �����ε��̶�� �Ѵ�.
-������ ���� ���� ���� �ٸ� ���� �����ε� �� �� �����̴�.
*/

package Medium;

public class day16 {
	
	public static void main(String[] args)
	{
		OverloadingMethods om = new OverloadingMethods();
		
		om.print(); 

		System.out.println(om.print(8)); 
		
		om.print("Hello");
		
		System.out.println(om.print(4,5));

	}

}

class OverloadingMethods{
	
	public void print() {
		System.out.println("�����ε�1");  //--�����ε�1
	}
	
	String print(Integer a) {
		System.out.println("�����ε�2");  //--�����ε�2
		return a.toString();           //--8
	}
	
	void print(String a) {
		System.out.println("�����ε�3");  //--�����ε�3
		System.out.println(a);         //--Hello
	}
	
	String print(Integer a, Integer b) {
		System.out.println("�����ε�4");       //--�����ε�4
		return a.toString() + b.toString(); //--45
	}
		
	
}
