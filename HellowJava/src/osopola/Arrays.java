package osopola;

public class Arrays {

	public static void main(String[] args) {

		// # 배열 - 동일한 자료형 데이터들의 묶음.
		String name1, name2, name3; // 배열 적용 없을시
		// 배열선언.
		// 자료형 []변수명;
		String[] names;
		// 배열 초기화
		names = new String[3]; // 변수명 = new 자료형[크기];
		// 배열 다루기
		// 변수명[위치값];
		names[0] = "혜교";
		names[1] = "지현";
		names[2] = "수지";
		System.out.println(names[0]);
		System.out.println(names[1]);

		for (int i = 0; i < names.length; ++i) {
			System.out.println(names[i]);
		}

		int[] korScore; // 배열선언
		korScore = new int[3]; // 배열초기화
		korScore[0] = 77;
		korScore[1] = 90; // 배열 삽입.
		korScore[2] = 88;

		for (int i = 0; i < korScore.length; ++i) {
			System.out.println(korScore[i]);
		}
		// 배열은 참조형이다?
		System.out.println(names);
		System.out.println(korScore);
		// 배열요소의 값은 자동으로 초기화된다.

		String[] a = new String[1]; // 객체 null
		int[] b = new int[1]; // 0
		char[] c = new char[1]; //
		double[] d = new double[1]; // 0.0
		boolean[] e = new boolean[1]; // talse

		System.out.println(a[0]);
		System.out.println(b[0]);
		System.out.println(c[0]);
		System.out.println(d[0]);
		System.out.println(e[0]);

		// 배열의 길이 : 배열변수.length
		// names.length=10; //상수 이므로 변경불가.

		// 배열선언과 동시에 초기화하기
		int[] f = { 99, 7, 65 };
		for (int i = 0; i < f.length; ++i) {
			System.out.println(f[i]);
		}

		f = new int[] { 99, 89, 52 };
		for (int i = 0; i < f.length; ++i) {
			System.out.println(f[i]);
		}

		// 2차원 배열: [][] -행열
		int[][] lotto = new int[3][6];
		lotto[0][0] = 15;
		lotto[2][5] = 33;

		// 문제 1- 45 정수를 출력하는 난수코드 작성

		int[][] randombox = new int[3][6];
		int randoms = (int) (Math.random() * 100) + 1;
		int lot = randoms % ((45 - 1) + 1) + 1;
		System.out.println(randoms);

		for (int i = 0; i < 2; ++i) {
			for (int j = 0; j < 1; ++j) {
				randombox[i][j] = lot;
			} // for i
		} // for j

		// 2차원 배열내 저장된값 출력
		for (int j = 0; j < 3; ++j) {
			for (int i = 0; i < 6; ++i) {
				System.out.printf("%d", randombox[j][i]);
			} // for i
			System.out.println();
		} // for j

		// 향상된 for문으로 배열 다루기
		int[] abc = { 12, 34, 56, 78, 90 };
		for (int i = 1; i < abc.length; i++)
			System.out.println(abc[i]);

		// 향상된 for문
		// for(배열 요소타입 변수명 :배열)
		int[] abc1 = { 12, 13, 554, 88, 56 };
		for (int a1 : abc1) {
			System.out.println(a1);
		}

		// 2차원 배열에 대한 향상된 for문사용
		for (int[] row : lotto) {

			for (int col : row) {
				System.out.printf("%d", col);
			}
		}
	}
}