package osopola;

public class statement2 {

	public static void main(String[] args) {
		System.out.println("오늘 너무 추워요!");
		System.out.println("오늘 너무 추워요!");
		System.out.println("오늘 너무 추워요!");
		System.out.println("오늘 너무 추워요!");
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
		System.out.println("6");
		System.out.println("7");
		System.out.println("8");
		System.out.println("9");
		System.out.println("0");
		// 단순하게 복붙코드로 반복작업을 하는것은 유지보수 측면으로 볼때 좋은 방법은 아니다.
		// 반복문
		// for : 지정한 횟수만큼 어떤작업을 반복
		// for(초기식; 조건식; 증감식)
		// 조건식은 참으로 평가됨.

		for (int i = 1; i <= 5; i = i + 1) {
			System.out.println("오늘 너무 추워요!");
		}

		for (int i = 1; i <= 5; i += 1) {
			System.out.println("오늘 너무 추워요!");
		}

		for (int i = 1; i <= 5; ++i) {
			System.out.println("오늘 너무 추워요!");
		}

		for (int i = 1; i <= 5; ++i) {
			System.out.println(i);
		}
		System.out.println("1부터 100까지 숫자");

		for (int i = 1; i <= 100; ++i) {
			System.out.println(i);
		}
		System.out.println("1부터 100까지 홀수");

		for (int i = 1; i <= 100; i = i + 2) {
			System.out.println(i);
		}
		System.out.println("1부터 100까지 짝수");

		for (int i = 2; i <= 100; i = i + 2) {
			System.out.println(i);
		}

		// 구구단
		// 5x1=5
		// 5x2=10
		// 5x3=15
		// ......
		// 5x9=45
		// 한단.
		String fmt = "%d x %d = %d\n";

		for (int i = 1, j = 5; i <= 9; i = i + 1) {
			System.out.printf(fmt, j, i, j * i);
		}

		// 전체
		for (int i = 1; i <= 9; ++i) {
			for (int j = 1; j <= 9; ++j)
				System.out.printf(fmt, i, j, i * j);
		}

		// 별만들기
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 10; ++j) {
				System.out.print("*");
			}
			System.out.println("");
		}
		// 직각삼각형그리기
		// *
		// **
		// ***
		// ****
		// *****
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; ++j) {
				System.out.print("*");
			}
			System.out.println("");
		}

		// 역 직각삼각형 그리기
		// *****
		// ****
		// ***
		// **
		// *
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= (6 - i); ++j) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; --j) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
