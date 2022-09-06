// continue 실습
// (뒷부분은 무시하고 + ) 계속해랴

package Base;

public class day09_1 {
	
	public static void main(String[] args)
	{

		int n=0, s=0;

		while (n<50)
		{
			n++;

			//확인
			//System.out.println("n: " + n);

			if (n%2==0)  //n이 짝수라면,
				continue;  //--뒷부분 무시하고 계속해라!
			
			s += n;  //뒷부분
			System.out.println(n + " : " + s);  //뒷부분


		
		}



	}

}

//결과
/*
1 : 1
3 : 4
5 : 9
7 : 16
9 : 25
11 : 36
13 : 49
15 : 64
17 : 81
19 : 100
21 : 121
23 : 144
25 : 169
27 : 196
29 : 225
31 : 256
33 : 289
35 : 324
37 : 361
39 : 400
41 : 441
43 : 484
45 : 529
47 : 576
49 : 625
*/
