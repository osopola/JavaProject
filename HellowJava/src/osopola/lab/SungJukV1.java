package osopola.lab;

import java.util.Scanner;

public class SungJukV1 {
	public static void main(String[] args) {
		/*
		 * 성적처리프로그램 v1 간단한 성적처리를 수행하는 프로그램
		 * 
		 * 입력: 이름, 국어, 영어 수학 처리: 총점, 평균, 학점 출력: 이름, 국어, 영어, 수학, 총점, 평균, 학점
		 * 
		 */
		// 변수설정
		String userName;
		int engScore;
		int korScore;
		int mthScore;
		int sm;
		int avrg;
		char grd;

		Scanner sc = new Scanner(System.in); // 스캐너를 sc로 지정.
		System.out.println("<성적처리프로그램 v1.>"); // output
		// 사용자 정보 입력
		System.out.print("이름을 입력하세요 : ");
		userName = sc.nextLine();
		// 성적 입력
		System.out.print("영어점수를 입력하세요 : ");
		engScore = sc.nextInt();
		System.out.print("국어점수를 입력하세요 : ");
		korScore = sc.nextInt();
		System.out.print("수학점수를 입력하세요 : ");
		mthScore = sc.nextInt();
		sc.close();

		// cal
		sm = engScore + korScore + mthScore;
		avrg = sm / 3;
		grd = (avrg >= 90) ? 'A' : (avrg >= 80) ? 'B' : (avrg >= 70) ? 'C' : (avrg >= 60) ? 'D' : 'F';

		System.out.println("<<성적처리결과>>");
		System.out.println("# 이름 ");
		System.out.println(userName);
		System.out.println("# 성적 ");
		System.out.println("1. 영어성적 : " + engScore);
		System.out.println("2. 국어성적 : " + korScore);
		System.out.println("3. 수학성적 : " + mthScore);
		System.out.println("# 합계 ");
		System.out.println(sm);
		System.out.println("# 평균");
		System.out.println(avrg);
		System.out.println("# 학점");
		System.out.println(grd);

	}
}
