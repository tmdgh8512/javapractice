package javapractice;

import java.util.Scanner;

public class javapractice_7 {
// ������ �հ�� ��� - �� �б޿� 5���� �л��� �ְ�, �� �л��� ������ �� ���� ������ �迭�� ����Ǿ� �ִ�.
	public static void main(String[] args) {

		String[] student_number = { "1���л�", "2���л�", "3���л�", "4���л�", "5���л�" };
		Scanner Student_Grade = new Scanner(System.in);
		int[][] student_grade = new int[5][3];
		int[] sum = new int[5];
		double[] average = new double[5];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.printf("%s�� ��.��.�� ������ �Է��ϼ��� : ", student_number[i]);
				student_grade[i][j] = Student_Grade.nextInt();
				sum[i] = sum[i] + student_grade[i][j];
			}
		}
		for (int i = 0; i < 5; i++) {
			average[i] = (double) sum[i] / (double) 3;
			System.out.printf("%s :  ���� �հ� = %d, ��� = %f \n", student_number[i], sum[i], average[i]);

		}

	}

}
