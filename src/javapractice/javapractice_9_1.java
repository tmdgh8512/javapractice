package javapractice;

import java.util.Arrays;
import java.util.Scanner;

public class javapractice_9_1 {
// �հ� ���� �޼��� - 5���� ������ ���� ������ �迭�� �޾Ƶ鿩, �� �հ踦 ���ϴ� �Լ��� �����
	public static void main(String[] args) {

		int[] A_grade = new int[5];
		int[] B_grade = new int[5];
		int A_sum = 0;
		int B_sum = 0;

		Scanner Grade = new Scanner(System.in);

		System.out.println("A�л��� ���� ������ �Է��ϼ���. : ");

		for (int i = 0; i < A_grade.length; i++) {

			A_grade[i] = Grade.nextInt();
			A_sum = A_sum + A_grade[i];

		}
		System.out.println("A�л��� ���� = " + Arrays.toString(A_grade));
		System.out.println("Sum<A> = " + A_sum);

		System.out.println("B�л��� ���� ������ �Է��ϼ���. : ");

		for (int i = 0; i < A_grade.length; i++) {

			B_grade[i] = Grade.nextInt();
			B_sum = B_sum + B_grade[i];

		}
		System.out.println("B�л��� ���� = " + Arrays.toString(B_grade));
		System.out.println("Sum<B> = " + B_sum);
	}

}
