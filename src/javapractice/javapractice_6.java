package javapractice;

import java.util.Arrays;
import java.util.Scanner;

public class javapractice_6 {
// �հ�� ��� - �� �б޿� 10���� �л��� ���� ��, �� �б��� ������ ��� ���� �հ�� ����� ���Ͽ���.
	public static void main(String[] args) {

		int[] student = { 90, 75, 85, 95, 70, 75, 85, 85, 95, 72 };
		System.out.println("���� : " + Arrays.toString(student));

		int Grade_sum = student[0] + student[1] + student[2] + student[3] + student[4] + student[5] + student[6]
				+ student[7] + student[8] + student[9];
		System.out.println("�հ� : " + Grade_sum);
		double Grade_average = (double) (student[0] + student[1] + student[2] + student[3] + student[4] + student[5]
				+ student[6] + student[7] + student[8] + student[9]) / 10;
		System.out.println("��� : " + Grade_average);

		System.out.println("------------------------------------------");

		// ���� 1~10�� �л����� ������ �Է��Ͽ� �հ� �� ��� ���ϱ�
		String[] student_number = { "1�� �л�", "2�� �л�", "3�� �л�", "4�� �л�", "5�� �л�", "6�� �л�", "7�� �л�", "8�� �л�", "9�� �л�",
				"10�� �л�" };
		Scanner Student_Grade = new Scanner(System.in);
		int[] student_grade = new int[10];

		for (int i = 0; i < student_grade.length; i++) {

			System.out.printf("%s�� ������ �Է��ϼ��� : ", student_number[i]);
			student_grade[i] = Student_Grade.nextInt();

		}
		System.out.println("1~10������ ���� : " + Arrays.toString(student_grade));
		int grade_sum = 0;

		for (int i = 0; i < student_number.length; i++) {

			grade_sum = grade_sum + student_grade[i];
		}
		float grade_average = (float) (grade_sum) / (float) (student_number.length);
		System.out.println("10���� �л� ���� �հ� : " + grade_sum);
		System.out.println("10���� �л� ���� ��� : " + grade_average);
	}
}
