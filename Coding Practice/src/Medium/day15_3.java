// Ŭ������ �ν��Ͻ� Ȱ��

// �л����� ��������, ��������, ���������� �Է¹޾�
// ����, ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, Ŭ������ ������ Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.
// ����, �� �������� �迭�� ���������� Ȱ���� �� �ֵ��� �Ѵ�.
// Ŭ���� ����� ������ ���̵���ο� ���� ������ �� �ֵ��� �Ѵ�.

// ���α׷��� �����ϴ� Ŭ����
// 1. day15_Record Ŭ����
//    - �Ӽ��� �����ϴ� Ŭ������ ������ ��
//
// 2. day15_Sungjuk Ŭ����
//    - �ο� ���� �Է¹޾�, �Է¹��� �ο� �� ��ŭ
//      �̸�, ��������, ��������, ���������� �Է¹ް�
//      ������ ����� �����ϴ� Ŭ������ ������ ��
//      ���Ӽ� : �ο���, Record ������ �迭
//      ����� : �ο��� �Է�, �� ������ �Է�, ���� �� ��� ����, ��� ���
//
// 3. day15_3 Ŭ����
//    - main() �޼ҵ尡 �����ϴ� �ܺ� Ŭ������ ������ ��


package Medium;

public class day15_3 {
	
	public static void main(String[] args)
	{
		day15_Sungjuk sj = new day15_Sungjuk();
		sj.set();
		sj.input();
		sj.print();

	}

}

//���
/*
�ο� �� �Է�(1~100) : 3
1��° �л��� �̸� �Է� : ������
���� ���� : 90
���� ���� : 80
���� ���� : 70
2��° �л��� �̸� �Է� : ���ٻ�
���� ���� : 45
���� ���� : 34
���� ���� : 20
3��° �л��� �̸� �Է� : ������
���� ���� : 56
���� ���� : 100
���� ���� : 78

  ������  90  80  70  240   80.00    1
  ���ٻ�  45  34  20   99   33.00    3
  ������  56 100  78  234   78.00    2
*/