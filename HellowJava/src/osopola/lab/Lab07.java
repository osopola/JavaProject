package osopola.lab;

import java.util.Scanner;

public class Lab07 {
	public static void main(String[] args) {

		// 사용자로부터 1-100사이 숫자를 입력.
		Scanner scn = new Scanner(System.in);
		int num2 = (int) (Math.random() * 100 + 1);
		while (true) {
			System.out.println("임의의 숫자를 입력하세요:");
			int num1 = scn.nextInt();
			if (num1 > num2) {
				System.out.println("추측한 숫자가 큽니다.");
			}
			if (num1 < num2) {
				System.out.println("추측한 숫자가 작습니다.");
			}
			if (num1 == num2) {
				System.out.println("빙고 숫자를 마췄습니다.");
				System.exit(0);
			}
		}

	}
}
