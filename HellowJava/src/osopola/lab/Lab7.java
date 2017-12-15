package osopola.lab;

import java.io.IOException;
import java.util.Scanner;

public class Lab7 {

	public static void main(String[] args) throws IOException {
		// # 22. 다음조건을 이용해서 현재의 연도를 입력하면 윤년여부를 출력하는 프로그램을 작성하시오.
		// 현재연도가 4로 나눠 떨어지지만, 100으로는 나눠 떨어지지 않음.
		// 현재 연도가 400으로 나눠 떨어짐.
		// gregorian calender 사용시.

		// GregorianCalendar gc = new GregorianCalendar();
		// System.out.println(gc.isLeapYear(2000));
		// int year = 2000;
		//
		// if (gc.isLeapYear(year))
		// System.out.printf("%d년은 윤년 입니다.", year);
		// else
		// System.out.printf("%d년은 윤년이 아닙니다.", year);
		// // 조건을 사용하여
		// // 계산식. 현재연도가 4로 나눠 떨어지지만 100으로는 나눠 떨어지지않음.
		// // 400으로 나누어 떨어짐
		//
		// String fmt1 = "%d년은 윤년 입니다.\n";
		// String fmt2 = "%d년은 윤년이 아닙니다.\n";
		//
		// Scanner sc = new Scanner(System.in);
		// System.out.println("연도를 입력하세요 : ");
		// int year2 = sc.nextInt();
		// if ((year2 % 400 == 0) || ((year2 % 4 == 0) && (year2 % 100 != 0)))
		// // 나누었을때 소수점자리 여부?.
		// System.out.printf(fmt1, year2);
		// else
		// System.out.printf(fmt2, year2);
		// 23 복권문제. 특정범위난수생성
		// 정수 난수값 %((마지막값-시작값)+1)+시작값

		Scanner sc = new Scanner(System.in);
		System.out.print("복권 숫자 세자리를 입력하세요(000) : ");
		// 복권 숫자를 입력받음
		String userLnum = sc.nextLine();

		// 입력받은 숫자를 각각 저장.(입력)
		char noUs1 = userLnum.charAt(0);
		char noUs2 = userLnum.charAt(1);
		char noUs3 = userLnum.charAt(2);

		// 난수생성
		int randm = (int) (Math.random() * 10000);
		int lotto = randm % ((999 - 100) + 1);
		// 입력받은 숫자를 각각 저장. (난수)
		char noCom1 = ("" + lotto).charAt(0);
		char noCom2 = ("" + lotto).charAt(1);
		char noCom3 = ("" + lotto).charAt(2);
		String nous = "" + userLnum;

		int match = 0;

		// if (noUs1 == noCom1 || noUs1 == noCom2 || noUs1 == noCom3)
		// ++match;
		// if (noUs2 == noCom1 || noUs2 == noCom2 || noUs2 == noCom3)
		// ++match;
		// if (noUs2 == noCom1 || noUs2 == noCom2 || noUs2 == noCom3)
		// ++match;
		String lotto4 = "" + lotto;
		int size = lotto4.length();

		for (int i = 1; i < size; ++i)
			for (int j = 0; j < size; ++j)
				if (nous.charAt(i) == lotto4.charAt(j))
					++match;

		// 당첨여부 확인

		// output
		switch (match) {
		case 3:
			System.out.printf("당신은 상금 10만 에 당첨되었습니다.");
			break;
		case 2:
			System.out.printf("당신은 상금 1만 에 당첨되었습니다.");
			break;
		case 1:
			System.out.printf("당신은 상금 1천 에 당첨되었습니다.");
			break;
		default:
			System.out.print("꽝");
			break;
		// userLnum=randm

		}
	}
	// 24. 스캐너사용 구구단 작성

	// String fmt = "%d x %d = %d\n";
	// System.out.printf("단수입력 : ");
	// int j = sc.nextInt(); // j 수치입 입력
	// for (int i = 1; i <= 9; i = i + 1) {
	// System.out.printf(fmt, j, i, j * i);
	// sc.close();
	//
	// 25 문자 숫자변환
	// System.out.println("알파벳을 대문자로 바꿔드립니다!.");
	// System.out.println("소문자 알파벳 하나 입력하세요.");
	// int ch = System.in.read();
	//
	// System.out.println(ch);
	// if (97 <= ch && ch <= 129) {
	// char ca = Character.toUpperCase((char) ch);
	// System.out.println(ca);
	//
	// } else
	// System.out.println("잘못입력하셨습니다.");
	// 다른풀이
	// 32를 빼서 char형식으로 변환 출력
	// // 26
	// 사용자로부터 1-100사이 숫자를 입력.
	// Scanner scn = new Scanner(System.in);
	// while (true) {
	// System.out.println("임의의 숫자를 입력하세요:");
	// int num1 = scn.nextInt();
	// int num2 = (int) (Math.random() * 100 + 1); // 100+1 최대값과 시작값을 이야기함
	// if (num1 > num2) {
	// System.out.println("추측한 숫자가 큽니다.");
	// }
	// if (num1 < num2) {
	// System.out.println("추측한 숫자가 작습니다.");
	// }
	// if (num1 == num2) {
	// System.out.println("빙고 숫자를 마췄습니다.");
	// System.exit(0);
	}}

	// 27
	int sum = 0;
	int number = 0;

	while(number<20)
	{
		number++;
		sum += number;

		if (sum >= 100)
			break;
	}
	String fmt = "num:%d, sum :%d\n";System.out.printf(fmt,number,sum);

	// // 28
	// int sum3 = 0;
	// int number2 = 0;
	//
	// while (number2 < 20) {
	// number2++;
	// if (number2 == 10 || number2 == 11)
	// continue;
	// sum3 += number2;
	//
	// }
	// // 구구단 차트
	// // print only 사용
	// String fmt = "\t Multiplication Table\n";
	// fmt += " 1 2 3 4 5 6 7 8 9\n";
	// fmt += "--------------------------------------\n";
	// fmt += "1 | 1 2 3 4 5 6 7 8 9\n";
	// fmt += "2 | 2 4 6 8 10 12 14 16 18\n";
	// fmt += "3 | 3 6 9 12 15 18 21 24 27\n";
	// fmt += "4 | 4 8 12 16 20 24 28 32 36\n";
	// fmt += "5 | 5 10 15 20 25 30 35 40 45\n";
	// fmt += "6 | 6 1 1 1 1 1 1 1 1\n";
	// fmt += "7 | 7 1 1 1 1 1 1 1 1\n";
	// fmt += "8 | 8 1 1 1 1 1 1 1 1\n";
	// fmt += "9 | 9 1 1 1 1 1 1 1 1\n\n";
	// System.out.println(fmt);
	// fmt = "\t Multiplication Table\n";
	// fmt += " 1 2 3 4 5 6 7 8 9\n";
	// fmt += "--------------------------------------\n";
	// // for 1개 사용
	// System.out.println(fmt);
	// for (int i = 1; i <= 9; ++i) {
	// fmt = "%d | %3d %2d %2d %2d %2d %2d %2d %2d %2d\n";
	// System.out.printf(fmt, i, i * 1, 2 * i, 3 * i, 4 * i, 5 * i, 6 * i, 7 * i, 8
	// * i, 9 * i);
	// }
	// // for 2개 사용
	// fmt = "\t Multiplication Table\n";
	// fmt += " 1 2 3 4 5 6 7 8 9\n";
	// fmt += "--------------------------------------\n";
	// System.out.print(fmt);
	// for (int i = 1; i <= 9; ++i) {
	// System.out.printf("%d | %3d", i, i);
	// for (int j = 2; j <= 9; ++j) {
	// System.out.printf(" %2d", i * j);
	// }
	// System.out.println();

}}
