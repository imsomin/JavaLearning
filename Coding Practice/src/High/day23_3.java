//�ڹ��� �ֿ�(�߿�) Ŭ����

//Wrapper Ŭ����

package High;

import java.math.BigDecimal;

public class day23_3 {
	
	public static void main(String[] args)
	{

		BigDecimal a = new BigDecimal("123456789.123456789");

		// movePointLeft() : �Ҽ����� �������� �̵�
		BigDecimal b = a.movePointLeft(3);
		System.out.println("ó�� ��� : " + b);
		//-->> ó�� ��� : 123456.7891213456789

		// ������ ���� ( ��ü �Ӽ� Ȯ��, �ݿø� ���� �ʴ´�, ����)
		BigDecimal c = a.divide(b, BigDecimal.ROUND_DOWN);
		System.out.println("ó�� ��� : " + c);
		//-->> ó�� ��� : 1000.000000000
		//-- ROUND_DOWN : static, final

		//BigInteger ��ü�� ��ȯ
		System.out.println(a.toBigInteger());
		//-->>123456789
		//-- ����ȭ �Ǵ� ����

	}

}