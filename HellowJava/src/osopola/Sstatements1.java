package osopola;

public class Sstatements1 {
	public static void main(String[] args) {

		// 문장 - 무엇인가를 하라는 지시를 의미
		// 문장이 모여 프로그램을 구성
		; // 빈 문장도 일단 적법하다.
			// 블록{}은 문장을 묶은것을 이야기함.
			// 조건문 if
			// if(조건식){참일때 실행할 문장}
			// if(조건식){참일때}else{거짓일때}
			// if(조건식1){참일때}
			// else if(조건식){조건식2}{참일때}
			// else if(조건식){조건식3}{참일때}
			// else if{거짓일때}

		if (3 < 5) {
			System.out.println("3은 5보다 크다??");
		}
		int tot = 99 + 98 + 99;

		if (tot >= 269) {
			System.out.println("수");
		}
		// 어떤수가 2의 배수인지 알아 ㅁ\보자,
		int x = 13;
		if (x % 2 == 0) {
			System.out.println("2의 배수");
			System.out.println("2의 배수 아님");
		}
		x = 95;
		if (x <= 1 && x >= 900) {
			System.out.println("수");
		}

		// 로그인?
		String userId = "osopola";
		String passwd = "123456";

		if (userId.equals("osopola") && passwd.equals("123456")) {
			System.out.println("로그인성공");
		} else {
			System.out.println("로그인 실패");
		}

		// #2
		if (userId.equalsIgnoreCase("osopola")) {
			if (passwd.equals("123456")) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("비밀번호 틀림");
			}

		} else {
			System.out.println("아이디 틀림");
		}
		// 문자 입력확인
		char ch = 'q';
		if (ch == 'q' || ch == 'Q') {
			System.out.println("프로그램 종료");
		}

		// 입력된 문자가 알파벳 소문자 여부확인
		// if(ch=='a'||ch=='b'|| ... ||ch=='z')
		int ch1 = 1;

		if (!(ch1 >= 'a' && ch1 <= 'z')) {
			System.out.println("알파벳만 입력가능");
		}

		ch = '1';
		if (ch >= '0' && ch <= '9') {
			System.out.println("숫자임");
		} else {
			System.out.println("숫자가 아님");
		}

		// 다중 IF문
		double avg = (double) tot / 3;
		char grd;
		if (avg >= 90)
			grd = '수';
		else if (avg >= 80)
			grd = '우';
		else if (avg >= 70)
			grd = '미';
		else if (avg >= 60)
			grd = '양';
		else
			grd = '가';
		System.out.println(grd);

		// 애매모호한 IF문
		// 중괄호 {}를 통해 관계를 명확하게 한다/

		// switch statement int/string을 통해
		// swithc:연산식 결과값에 따라 분기
		// 연산식의 결과값 유형은 정수, 문자열, 열거형중 하나이어야함
		// withch(연산식){
		// case 값1: 실행할 코드; break;
		// case 값2: 실행할 코드; break;
		// case 값3: 실행할 코드; break;
		// default: 실행할 코드; break;
		// }

		int userLevel = 1;
		switch (userLevel) {
		case 1:
			System.out.println("관리자");
			break;
		case 2:
			System.out.println("사용자");
			break;
		case 3:
			System.out.println("매니저");
			break;
		default:
			System.out.println("비회원");
			break;
		}
		String key = "D";

		switch (key) {
		case "C":
		case "c":
			System.out.println("데이터 생성");
			break;
		case "R":
		case "r":
			System.out.println("데이터 조회");
			break;
		case "U":
		case "u":
			System.out.println("데이터 수정");
			break;
		case "D":
		case "d":
			System.out.println("데이터 삭제");
			break;

		}

		// //학점계산
		// switch((int)avg/10) {
		// case 10: case 9:
		// grd='수'
		// break;
		// case 8:
		// grd='우
		// break;
		// case 7:
		// grd='미'
		// break;
		// case 6:
		// grd='양'
		// break;
		// default:
		// grd='가'
		// break;
		// }

		// 난수생성
		double luck = Math.random();

		System.out.println((luck));
		System.out.println(luck * 10);
		System.out.println(luck * 100));
		System.out.println((int+)(luck * 1000));



	}
}
