package javapractice;

import java.util.Scanner;

public class javapractice_4 {
// ��ǥ ��� - ������ ���� N�� �޾Ƶ鿩 N���θ�ŭ ���� ������ ������ ������.
	public static void main(String[] args) {

		// for������ �غ���
		System.out.print("Enter line number1 : ");

		Scanner Number = new Scanner(System.in);
		int number1 = Number.nextInt();

		for (int i = 1; i <= number1; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// while������ �غ���
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
