package osopola.lab;

import java.util.Scanner;

public class Lab01 {
	public static void main(String[] args) {// 1번, 2번 작성
		// HARRY 출력.
		System.out.println("*    *   **   ****   ****   *   *");
		System.out.println("*    *  *  *  *   *  *   *  *   *");
		System.out.println("*    * *    * *    * *    * *   *");
		System.out.println("****** ****** *   *  *   *   * * ");
		System.out.println("*    * *    * ****   ****     *  ");
		System.out.println("*    * *    * *   *  *   *    *  ");
		System.out.println("*    * *    * *    * *    *   *  ");

		System.out.println("  ////// ");
		System.out.println(" |     | ");
		System.out.println("(| o o |) ");
		System.out.println(" |  ^  | ");
		System.out.println(" | [_] | ");
		System.out.println(" |_____| ");

		System.out.println("             +---+ ");
		System.out.println("             |   | ");
		System.out.println("         +---+---+ ");
		System.out.println("         |   |   | ");
		System.out.println("     +---+---+---+ ");
		System.out.println("     |   |   |   | ");
		System.out.println(" +---+---+---+---+ ");
		System.out.println(" |   |   |   |   | ");
		System.out.println(" +---+---+---+---+ ");

		System.out.println("  /\\_/\\    ------");
		System.out.println(" ( ' ' )  / Hello \\");
		System.out.println(" (  -  ) <  Junior |");
		System.out.println("  | | |   \\ coder!/");
		System.out.println(" (__|__)    _____");

		System.out.println("1" + "2");
		System.out.println(true + "");
		System.out.println('a' + 'b');
		System.out.println('1' + 2);
		System.out.println('j' + "ava");

		char ch = 'A';
		System.out.println(ch);
		System.out.println((int) ch);

		ch = 'a';
		System.out.println(ch);
		System.out.println((int) ch);

		ch = '가';
		System.out.println(ch);
		System.out.println((int) ch);

		String chars = "abc";
		System.out.println(chars.charAt(0));
		System.out.println((int) chars.charAt(0));

		// 특수문자표현 - escape sequence
		System.out.println("가         나");
		System.out.println("가\t나"); // 탭문자 '\t'
		System.out.println("가\n나"); // 줄바꿈문자 '\n'
		System.out.println("가\"나"); // 큰따옴표 문자 '\"'
		System.out.println("가\'나"); // 작은 따옴표 문자 '\t'

		// 변수 지정방법
		String userId = "kKK1";
		String passwd = "qkKK11";
		String name = "홍길동";
		int age = 29;

		// 변수 출력방법
		System.out.println(userId);
		System.out.println(passwd);
		System.out.println(name);

		System.out.println("아이디:" + userId + "비밀번호:" + passwd + "이름:" + name);
		System.out.printf("아이디:%s , 비밀번호:%s, 이름:%s ,나이:%n ", userId, passwd, name, age);

		String fmt = "아이디: %s,비밀번호:%s \n";
		System.out.printf(fmt, userId, passwd);

		System.out.println("");

		// 키보드로 데이터 입력받기
		Scanner sc = new Scanner(System.in); // 스캐너를 sc로 지정.
		System.out.print("아이디를입력하세요");
		userId = sc.nextLine();
		System.out.print("비밀번호를입력하세요");
		passwd = sc.nextLine();
		System.out.print("이름을입력하세요");
		name = sc.nextLine();
		System.out.print("나이를입력하세요");
		age = Integer.parseInt(sc.nextLine());
		System.out.printf(fmt, userId, passwd);
		System.out.println();
		suerid = sc.nextLine();
	}
}