package javapractice;

import java.util.Scanner;

public class javapractice_3 {
// ������ �����غ���
	public static void main(String[] args) {

		// for������ �غ���
		for (int i = 1; i < 10; i++) {
			System.out.printf("%5d��\n", i);
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d\n", i, j, (i * j));
			}
		}

		System.out.println("---------------------------");

		// while������ �غ���
		int m = 1;
		int n = 2;
		while (n <= 9) {
			System.out.println(n + "��");
			while (m <= 9) {
				System.out.println(n + " * " + m + " = " + (n * m));
				m++;
			}
			n++;
			m = 1;
		}

		System.out.println("---------------------------");
		// ���ܷ� do while�� �̿��Ͽ� 2~9�� �Է��� ������ �ܼ��� ������ �ϱ�
		Scanner Number = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int number = Number.nextInt();

		int a = 1;

		do {
			System.out.printf("%d * %d = %d\n", number, a, (number * a));
			a++;
		} while (a <= 9);
	}

}
