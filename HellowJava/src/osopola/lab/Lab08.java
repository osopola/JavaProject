package osopola.lab;

import java.util.Scanner;

public class Lab08 {

	public static void main(String[] args) {
		// 교재 소스 4-26,4-27
		// 연습문제 4-4,4-8,4-13,4-14,4-15

		// 4-4
		int score = 0;
		char grade = ' ';
		System.out.print("점수를 입력하시오 : ");
		Scanner sc = new Scanner(System.in);
		score = sc.nextInt();
		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else
			grade = 'D';
		{
			System.out.println("당신의 학점은" + grade + "입니다.");

		}

		// // 4-26
		// int sum = 0;
		// int i = 0;
		// // i를 1씩 증가시켜서 sum에 계속더해나간다.
		// while ((sum += ++i) <= 100) {
		// System.out.printf("%d - %d\n", i, sum);
		// } // 종료.
		//
		// int num;
		// int sums = 0;
		// boolean flag = true;
		// System.out.println("합계를 구할 숫자를 입력하시오.(끝내려면 0을 입력)");
		// while (flag) {
		// System.out.print(">>");
		// Scanner sc = new Scanner(System.in);
		// String tmp = sc.nextLine();
		// num = Integer.parseInt(tmp);
		//
		// if (num != 0) {
		// sums += num;
		// } else {
		// flag = false;
		// }
		// System.out.println("합계 : " + sums);
		// }

	}
}
