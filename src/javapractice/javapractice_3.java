package javapractice;

import java.util.Scanner;

public class javapractice_3 {
// 구구단 나열해보기
	public static void main(String[] args) {

		// for문으로 해보기
		for (int i = 1; i < 10; i++) {
			System.out.printf("%5d단\n", i);
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d\n", i, j, (i * j));
			}
		}

		System.out.println("---------------------------");

		// while문으로 해보기
		int m = 1;
		int n = 2;
		while (n <= 9) {
			System.out.println(n + "단");
			while (m <= 9) {
				System.out.println(n + " * " + m + " = " + (n * m));
				m++;
			}
			n++;
			m = 1;
		}

		System.out.println("---------------------------");
		// 번외로 do while을 이용하여 2~9중 입력한 숫자의 단수만 나오게 하기
		Scanner Number = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int number = Number.nextInt();

		int a = 1;

		do {
			System.out.printf("%d * %d = %d\n", number, a, (number * a));
			a++;
		} while (a <= 9);
	}

}
