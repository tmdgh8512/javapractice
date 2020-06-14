package javapractice;

import java.util.Scanner;

public class javapractice_4 {
// 별표 출력 - 임의의 숫자 N을 받아들여 N라인만큼 별이 나오는 형식을 만들어라.
	public static void main(String[] args) {

		// for문으로 해보기
		System.out.print("Enter line number1 : ");

		Scanner Number = new Scanner(System.in);
		int number1 = Number.nextInt();

		for (int i = 1; i <= number1; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// while문으로 해보기
		System.out.print("Enter line number2 : ");

		int number2 = Number.nextInt();
		int a = 1;
		int b = 1;
		while (a <= number2) {
			while (b <= a) {
				System.out.print("*");
				b++;
			}
			b = 1;
			a++;
			System.out.println();
		}
	}

}
