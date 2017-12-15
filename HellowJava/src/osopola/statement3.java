package osopola;

import java.util.Scanner;

public class statement3 {
	public static void main(String[] args) {

		// 반복문.- while
		int i = 1;
		while (i <= 5) {
			System.out.println("오늘 너무 추워요!");
			++i;
		}
		// // 무한루프
		// while (true) {
		// System.out.println("추워");
		// i = 1000;
		// }

		// 구구단
		String fmt = "%2d x %2d =%2d \n";
		int dan = 5;
		i = 1;
		while (i <= 9) {
			System.out.printf(fmt, 5, i, 5 * i);
			++i;
		}
		// 한번도 실행안된다고?
		i = 9;
		while (i > 10) {
			System.out.println("while : 이글이 보이나요?");

		}
		// 하지만 이건 다른
		i = 9;
		do {
			System.out.println("do-while : 이글이 보이나요?");
		} while (i > 10);

		// *****
		// *****
		// *****
		// *****
		// *****
		i = 1;
		int j = 1;

		while (i <= 5) {
			while (j <= 5) {
				System.out.print("*");
				++j;
			}
			++i;
			j = 1;
			System.out.print("\n");
		}
		// *
		// **
		// ***
		// ****
		// *****
		i = 1;
		int j1 = 1;

		while (i <= 5) {
			while (j1 <= i) {
				System.out.print("*");
				++j1;
			}
			++i;
			j1 = 1;
			System.out.print("\n");
		}

		// *****
		// ****
		// ***
		// **
		// *

		i = 1;
		int q = 5;

		while (i <= 5) {
			while (q >= i) {
				System.out.print("*");
				--q;
			}
			++i;
			q = 5;
			System.out.print("\n");
		}

		//
		// if (job.equals("q")) berak;
		//
		// System.out.println("시스템을종료합니다");

		// 반복의 중단 : break;

		i = 1;
		int sum = 0;
		fmt = "i : %d, sum : %d \n";

		while (true) {
			if (sum > 100)
				break;
			System.out.printf(fmt, i, sum);

			sum += i;
			++i;
		}

		// 반복의 재시작 -continue
		i = 1;
		while (i <= 100) {
			if (i % 2 != 0)
				continue; // 2의 배수만 출력
			System.out.println(i);
		}

		// while문의 조금 다른 용도
		{
			Scanner sc = new Scanner(System.in);

			while (true) {
				System.out.println("작업할 코드를 입력하세요");
				System.out.println("c)reate : 회원 등록");
				System.out.println("r)ead : 회원 조회");
				System.out.println("u)pdate : 회원 수정");
				System.out.println("d)elete : 회원 삭제");
				System.out.println("e)xit : 프로그램 종료");
				System.out.print(">");
				String job = sc.nextLine();
				// q가 입력되면 while문에서 나감.
				switch (job) {
				case "c":
					System.out.println("회원 등록 메뉴를 선택");
					break;
				case "r":
					System.out.println("회원 조회 메뉴를 선택");
					break;
				case "u":
					System.out.println("회원 수정 메뉴를 선택");
					break;
				case "d":
					System.out.println("회원 삭제 메뉴를 선택");
					break;
				case "e":
					// System.exit(0);
					break;
				}
			}
		}
	}
}
