package osopola.lab;

import java.util.Scanner;

public class Lab04 {
	public static void main(String[] args) {
		// 프린트 16~20
		// # 16
		int n = 1;
		int k = 2;
		int r = n;
		// #a
		if (k < n)
			System.out.println(r = k);

		// #b
		if (n < k) { // true, 1<2
			System.out.println(r = k);
		} else
			System.out.println(r = k + n);

		// #c
		if (r < k) {
			System.out.println(n = r);
		} else
			System.out.println(k = n);
		// #c
		if (r < n + k) {
			System.out.println(r = 2 * n);
		} else
			System.out.println(k = 2 * r);

		// #17
		// int x = "";

		// if(x && y==true){
		// x=1;
		// y=1
		// };

		// if(1<= x <=10); //x>=1 && x >10
		// System.out.println(x);

		System.out.println("18번 문제");

		// #18
		int number = 30;

		if (number % 2 == 0) {
			System.out.println(number + "는 짝수.");
			System.out.println(number + "는 홀수.");
		}
		if (number % 2 == 0) {
			System.out.println(number + "는 짝수.");
		} else
			System.out.println(number + "는 홀수.");

		// # 19
		System.out.println("-19번문제-");

		int x = 2;
		int y = 2;
		int z;

		if (x > 2) {
			if (y > 2) {
				z = x + y;
				System.out.println("z is " + z);
			}
		} else
			System.out.println("x is " + x);

		// # 20
		int a = 3;
		a = a++; // a++ = ++a 단독으로 쓰일때는 동일, 크게 의미 없음
		if (a == 3)
			System.out.println("three");
		else
			System.out.println("four");

		// #21
		// 미혼인경우 / 연봉 300미만 10, 연동 3000이상25
		// 결혼여부 isMarried
		int isMarried;
		int salary;
		int tax;

		Scanner scr = new Scanner(System.in);

		System.out.println("결혼여부를 입력하세요 미혼 (0), 기혼 (1)");
		isMarried = scr.nextInt();
		System.out.println("연봉을 입력 하세요");
		salary = scr.nextInt();

		// if (isMarried = 0 );
		// if(salary<3000)
		// tax= (int)(salary * 0.1);
		// else (salary>=3000)
		// tax=(int)(salary*0.25);
		// System.out.println(tax);}else
		// if(isMarried=1)if(salary<6000)tax=(int)(salary*0.1);if(salary>=6000)tax=(int)(salary*0.1);
		//
		// System.out.println(isMarried);System.out.println(salary);System.out.println(tax);

	}

}
