// 클래스와 인스턴스 활용

// day15_3.java 와 연결

package Medium;

public class day15_Record {
	
	// 학생 1명을 표현할 수 있는 속성들로 구성!
	//String[] name;
	//int[] kor;
	
	String name;				//-- 이름
	int[] score = new int[3];	// int kor, eng, mat;	//-- 각 과목의 점수
	int tot;					//-- 총점
	double avg;					//-- 평균
	int rank;					//-- 석차(등수)

}
