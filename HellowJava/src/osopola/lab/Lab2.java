package osopola.lab;

public class Lab2 {
	public static void main(String[] args) {
		// // #3~15
		// // #3
		//
		// System.out.println("#3");
		// int x2 = 10;
		// int y2 = 20;
		// int z = 30;
		// int result = 0;
		//
		// result = 3 * x2; // 3x
		// result = 3 * x2 + y2; // 3x+y
		// result = (x2 + y2) / 7;
		// result = (3 * x2 + y2) / (z + 2);
		//
		// System.out.printf("3*x=%d \n", 3 * x2);
		// System.out.println("3x+y");
		//
		// System.out.println("x+y");
		//
		// // #4 정수끼리의 연산은 정수.
		// System.out.println("#4");
		// double number = ((1 / 3)) * 3;// 결과가 0으로 나옴
		//
		// double number2 = ((double) 1 / 3) * 3;// 결과가 0으로 나옴
		//
		// System.out.println(number);
		// System.out.println(number2);
		// // #5
		// System.out.println("#5");
		// int quotient, remainder;
		// quotient = 7 / 3;
		// remainder = 7 % 3;
		// System.out.println(quotient);
		// System.out.println(remainder);
		//
		// System.out.println("#6");
		// int result = 11; result /= 2;
		// int result =11;
		// result /=2 // r=r/2;
		//
		//
		// // #7
		// System.out.println("#7");
		//
		// double x = 2.5;
		// double y = -1.5;
		// int m = 18;
		// int n = 4;
		//
		//
		//
		// double a = x2 + n * y - (x + n) * y;
		// int b = m / n + m % n;
		// double = 5 * x - (double) n / 5;
		// int d = 1 - (1 - (1 - (1 - 1 - n)));
		//
		// System.out.println(a);
		// System.out.println(b);
		// System.out.println(c);
		// System.out.println(d);
		//
		// 8

		System.out.println("#8");

		int a1 = (int) (3 + 4.5 * 2 + 27 / 8);
		boolean b1 = (true || false && 3 < 4 || !(5 == 7));

		System.out.printf("b. true || false && 3<4 || !(5==7)= %S%n", b1);
		System.out.printf("b. true | false & 3<4 | !(5==7)= %S%n", b1);
		boolean c1 = (true || (3 < 5 && 6 >= 2));
		System.out.printf("c. true || (3<5 &&6>=2) = %S%n", c1);

		// #9 - 문자열로 처리
		System.out.println("#9");

		System.out.println("may 13, 1988 fell on day number");
		System.out.println(
				(13 + (13 * 3 - 1) / 5 + 1988 % 100 + 1988 % 100 / 4 + 1988 / 400 - 2 * (1988 / 100)) % 7 + 7 % 7);
		// 특정일의 요일을 알아내는 수식.
		int year = 2007;
		int month = 7;
		int day = 11;
		System.out.println(year + (year / 4) - (year / 100) + (year / 400) + (13 * month + 8) / 5 + day % 7);
		//
		System.out.print("check out this line ");
		System.out.println("//hellow there" + '9' + 7);

		System.out.print('H' + 'I' + "is" + 1 + "more example");
		System.out.println('H' + 6.5 + 'i' + "is" + 1 + "more example");
		// 작은따옴표 ASCII, 큰따옴표 문자인식

		// System.out.print("print both of us");
		System.out.println("reverse" + 'I' + 'T');

		System.out.println("No! here is" + 1 + "more example");

		// System.out.println("here is " + 10 * 10));

		System.out.println("not x is" + true);

		// System.out.print( ); 괄호안비어있으면안됨
		// System.out.println; 괄호없어도안됨.
		// System.out.println("how about this ont"++'?'+'huh?'); ++때문에

		System.out.println(true && false && true || true);

		// #11 사칙연산.
		System.out.println(27 / 13 + 4);
		System.out.println(27 / 13 + 4.0);
		System.out.println(27 / 13.0 + 4);
		System.out.println('a' / 'b');
		System.out.println((double) 'a' / 'b');

		// # 12 - 형변환 (축소형 변환)

		int o = (int) 3.9;
		System.out.println(o);

		System.out.println("o==" + o);
		// # 13 증가/감소 연산자
		int n = 3;
		n++;
		System.out.println("n==" + n);

		// #14 -문자열 연결
		System.out.println("2+2=" + (2 + 2));
		System.out.println("2+2=" + 2 + 2);
		// #15
		char a, b;
		a = 'b';
		System.out.println(a); // 문자
		System.out.println((int) a); // 숫자
		b = 'c';
		System.out.println(b); // 문자
		System.out.println((int) b); // 숫자

		a = b;
		System.out.println(a); // 문자
		System.out.println((int) a); // 숫자

	}
}
