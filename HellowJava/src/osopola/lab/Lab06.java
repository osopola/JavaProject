package osopola.lab;

public class Lab06 {
	public static void main(String[] args) {
		// 자바 정석 연습문제 3-1,3-2,3-3

		// 3-1
		int x = 2;
		int y = 5;
		char c = 'A';
		System.out.println(1 + x << 33);
		System.out.println(y >= 5 || x < 0 && x > 2);
		System.out.println(y += 10 - x++);
		System.out.println(x += 2);
		System.out.println(!('A' <= c && c <= 'Z'));
		System.out.println('C' - c);
		System.out.println('5' - '0');
		System.out.println(c + 1);
		System.out.println(++c);
		System.out.println(c++);
		System.out.println(c);
		// L
		// 3-2
		int apple = 123;
		int bucket = 10;
		int nedBucket = (apple / bucket);
		System.out.println("필요한 바구니의 수 :" + nedBucket);

		// 3-3
		int num = 10;
		System.out.println();

		// 4-1
		int x1 = 18;

		if (10 < x1 && x1 < 20)
			System.out.println("true");
		else
			System.out.println("false");

	}
}
