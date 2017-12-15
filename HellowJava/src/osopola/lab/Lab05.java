package osopola.lab;

import java.util.Scanner;

public class Lab05 {
	public static void main(String[] args) {
		// 자바정석4-6,4-7,4-8
		// 4-6
		System.out.println("현재 월을 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println("현재의 계절은 봄입니다.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("현재의 계절은 여름입니다.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("현재의 계절은 가을입니다.");
			break;
		default:
			// case 12: case 1: case 2:
			System.out.println("현재의 계절은 겨울입니다.");
			break;

		}

		// 끝

		// 4-7

		System.out.println("<가위(1), 바위(2), 보(3) 중 하나를 입력하세요.>");
		int user = sc.nextInt();
		int com = (int) (Math.random() * 3) + 1; // 1,2,3중 하나가 com에 저장됨
		System.out.println("당신은" + user + "입니다.");
		System.out.println("컴퓨터는" + com + "입니다.");
		switch (user - com) {
		case 2:
		case -1:
			System.out.println("당신이 졌습니다.");
			break;

		case 1:
		case -2:
			System.out.println("당신이 이겼습니다.");
			break;

		case 0:
			System.out.println("비겼습니다.");
			break;
		}

		// 4-8

		System.out.println("= 당신의 주민번호를 입력하세요.(000000-0000000) =");
		String reNo = sc.nextLine();
		char gender = reNo.charAt(7); // 입력받은 번호의 8번째 문자를 gender에 저장
		switch (gender) {
		case '1':
		case '3':
			System.out.println("당신은 남자입니다.");
			break;
		case '2':
		case '4':
			System.out.println("당신은 여자입니다.");
			break;
		default:
			System.out.println("유효하지 않은 주민등록번호입니다.");
			break;
		}

	}
}
