package osopola.lab;

import java.util.Scanner;

public class Lab11 {
	public static void main(String[] args) {
		// # 31
		// 임의의 숫자 6자리를 입력하면 신용카드의 종류와 정보를 출력.
		Scanner sc = new Scanner(System.in);
		System.out.println("신용카드번호 6자리를 입력하시오. > ");
		String card = sc.nextLine();
		// 카드정보 판별
		String ctmsg = "카드 정보 없음";

		char cType = card.charAt(0);

		if (cType == '3' && card.charAt(1) == '5')
			ctmsg = "JCB ";
		else if (cType == '4')
			ctmsg = "VISA ";
		else if (cType == '5')
			ctmsg = "Master ";

		// 은행정보
		String bank = "은행정보 없음";
		switch (card) {
		case "356317":
			bank = "NH농협카드";
			break;
		case "356901":
			bank = "신한카드";
			break;
		case "356912":
			bank = "KB국민카드";
			break;
		case "404825":
			bank = "BC카드";
			break;
		case "438676":
			bank = "신한카드";
			break;
		case "457973":
			bank = "국민은행";
			break;
		case "515594":
			bank = "신한카드";
			break;
		case "524353":
			bank = "외환카드";
			break;
		case "540926":
			bank = "국민은행";
			break;
		}
		System.out.printf("%s %s\n", ctmsg, bank);

		// # 32 주민번호 검증하기.

		System.out.println("주민등록번호를 입력하시오 > ");
		String pn = sc.nextLine();

		// 가중치 적용 및 합산
		int sum = 0;
		int jcode = 0;
		for (int i = 0, j = 2; i <= 11; ++i, ++j) {
			if (i == 8)
				j = 2;
			jcode = (pn.charAt(i) - 48);
			sum += jcode * j;
		}

		// sum += (pn.charAt(1) - 48) * 3;
		// sum += (pn.charAt(2) - 48) * 4;
		// sum += (pn.charAt(3) - 48) * 5;
		// sum += (pn.charAt(4) - 48) * 6;
		// sum += (pn.charAt(5) - 48) * 7;
		// sum += (pn.charAt(6) - 48) * 8;
		// sum += (pn.charAt(7) - 48) * 9;
		// sum += (pn.charAt(8) - 48) * 2;
		// sum += (pn.charAt(9) - 48) * 3;
		// sum += (pn.charAt(10) - 48) * 4;
		// sum += (pn.charAt(11) - 48) * 5;

		// 나머지 계산
		// int check = sum % 11;
		// 마지막 자리수와 비교
		String msg = "올바르지 않은 주민번호 유형입니다.";

		// if (check > 9) { // 나머지가 2자리 수라면
		// if (check % 10 == (pn.charAt(12) - 48))
		// msg = "주민번호가 검증 되었습니다.";
		// } else if (11 - check == pn.charAt(12) - 48)
		// msg = "주민번호가 검증 되었습니다.";

		// *11로 나눈 나머지 구한후
		// *11에서 이것을 빼고, 맨 마지막자리 추출
		int check = (11 - (sum % 11)) % 10;
		if (check == pn.charAt(12) - 48)
			msg = "주민번호 검증성공";

		System.out.println(msg);

	}
}
