package osopola;

public class Operators {
	public static void main(String[] args) {
		// 연산자 - 각종 작업을 간단하게 표시하는 기호.
		// 산술연산자 : +, -, *, /, %
		int x = 10, y = 4;
		System.out.printf("10+4=%d\n", x + y);
		System.out.printf("10-4=%d\n", x - y);
		System.out.printf("10*4=%d\n", x * y);
		System.out.printf("10/3=%d\n", x / y);
		System.out.printf("10%%3=%d\n", (x % y));

		// 비교연산자 : >, <, ==, !=
		System.out.printf("10 > 4 = %b \n", x > y);
		System.out.printf("10 < 4 = %b  \n", x < y);
		System.out.printf("10 == 4 = %b \n", x == y);
		System.out.printf("10 != 4 = %b \n", x != y);

		String a = "hello!";
		String b = "Hello!";
		String c = "hello";
		String d = new String("hello");
		System.out.printf("a==b=%b \n", a == b);
		System.out.printf("a!=b=%b \n", a != b);
		System.out.printf("a==c=%b \n", a == c);
		System.out.printf("a!=c=%b \n", a != c);
		System.out.printf("b==c=%b \n", b == c);
		System.out.printf("b!=c=%b \n", b != c);
		System.out.printf("c==d=%b \n", c == d);
		System.out.printf("c.equals(d)=%b \n", c.equals(d));

		// 논리연산자 : &, &&, ||, !,^,~
		// 단축연산자 &&, || 가 지원
		int i = 5;
		int j = 13;

		System.out.printf("(i>4||j<10)=%b\n", i > 4 || j < 10);
		System.out.printf("(i<5||j>10)=%b\n", i < 5 || j > 10);
		// 대입 연산자: =,+=,-=,*=,/=
		int z = x + y;
		z += x; // z=z+x;
		z += y; // z=z+y;
		// 증가/감소 연산자:++,--
		++z; // z=z+1; 전치
		--z; // z=z-1; 전치
		z++; // 후치
		z--; // 후치

		i = 5;
		j = 5;
		j = ++i;
		System.out.printf("i = 5; j = 5; j = ++ i : %d\n", j);

		i = 5;
		j = 5;
		j = i++;
		System.out.printf("i = 5; j = 5; j = i++ : %d\n", j);

		// 삼항연산자-? :
		// (논리식)?(참일때 처리):(거짓일때 처리)
		double avg = 220 / 3.0;
		// char grd = (avg <= 100 && avg > 90) ? '수' : '우';

		// char grd = (avg > 70) ? '미' : '양';
		// char grd = (avg > 80) ? '우' : '미';
		// char grd = (avg > 90) ? '수' : '우';

		char grd = (avg >= 90) ? '수' : (avg >= 80) ? '우' : (avg >= 70) ? '미' : (avg >= 60) ? '양' : '가';

		System.out.println(grd);
		// 연산자 우선순위
		// 표현식의 계산순서를 결정
		// z = (x + y) * 2; // ( ) 우선계산
		int k = 1, l = 2, m = 3;
		int n = k + l + m;
		int o = (k + l) + m;
		System.out.println(n);
		System.out.println(o);

		double avg2 = 296 / 3;
		System.out.printf("296/3=%f\n", avg2);
		// 이미선언된 변수의 자료형은 형 변환 연산자( )를 통해 명시적으로 변환 가능하다.
		avg2 = (double) 296 / 3;
		System.out.printf("296/3=%f\n", avg2);
		// 정수 연산의 기본단위:int
		byte p = 10;
		byte q = 10;
		p = (byte) (p + q);
		System.out.println(p); // 20의 결과값이 도출됨. (byte)연산이 없을경우 계산이 되지않음.

		// 확대변환(자동처리)
		int s = p; // byte -> int

		// 축소변환 (명시적으로 기술
		p = (byte) s;

		s = 130;
		p = (byte) s;
		System.out.println(p); // -126 으로 나타남, 범위 값을 넘어서 다시 되돌아서 -값을 나타냄.

	}

}
