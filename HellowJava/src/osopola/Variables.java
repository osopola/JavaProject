package osopola;

public class Variables {
	public static void main(String[] args) {
		// 변수 : 자료형 변수이름;
		int a;
		// 정수형 변수
		double b; // 실수형 변수
		char c; // 문자변수(1자)
		String d;// 문자열 변수
		// 상수 : final 자료형 변수이름;
		// 변경불가 자료를 저장할 목적으로 사용
		// 변수이름은 대문자로 작성!.
		final int E;
		final double F;
		final char G;
		final String H;

		/*
		 * [전통적 주석] 자바기본 자료형 int: 정수(byte, short, long) double: 실수 char : 문자 String :
		 * 문자열
		 */
		// 기본주석

		/*
		 * 자바 예약어를 변수이름으로 사용불가 ex) int if; double import;
		 */

		// 회원정보(아이디, 비밀번호, 이름, 나이) -> 선언

		String UserID;
		String PassWord;
		String Name;
		int age;
		// 리터럴 : 컴파일러가 이해할수있는 형식으로 작성된 데이터나 값

		long 주민번호 = 9003291111111L;
		// 변수에 값 초기화 : 변수에 값을 대입
		// 변수명 = 값;

		UserID = "osopla";
		PassWord = "osooo";
		Name = "suji";
		age = 23;
		b = 123.456;

		float pi = 3.145678F;

		c = '수'; // 2byte 문자
		// G = 'u'; // 2byte이상 문자 두글자.

		// 변수 vs 상수
		c = '우';
		// G = 'u'; //상수이므로 변경불가

		int i = 123;
		double j = 987.123;
		boolean k = true; // 논리형 변수
		// k= false;

	}
}
