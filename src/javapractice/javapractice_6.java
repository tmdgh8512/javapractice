package javapractice;

import java.util.Arrays;
import java.util.Scanner;

public class javapractice_6 {
// 합계와 평균 - 한 학급에 10명의 학생이 있을 때, 이 학급의 점수를 모두 더한 합계와 평균을 구하여라.
	public static void main(String[] args) {

		int[] student = { 90, 75, 85, 95, 70, 75, 85, 85, 95, 72 };
		System.out.println("점수 : " + Arrays.toString(student));

		int Grade_sum = student[0] + student[1] + student[2] + student[3] + student[4] + student[5] + student[6]
				+ student[7] + student[8] + student[9];
		System.out.println("합계 : " + Grade_sum);
		double Grade_average = (double) (student[0] + student[1] + student[2] + student[3] + student[4] + student[5]
				+ student[6] + student[7] + student[8] + student[9]) / 10;
		System.out.println("평균 : " + Grade_average);

		System.out.println("------------------------------------------");

		// 내가 1~10번 학생들의 성적을 입력하여 합계 및 평균 구하기
		String[] student_number = { "1번 학생", "2번 학생", "3번 학생", "4번 학생", "5번 학생", "6번 학생", "7번 학생", "8번 학생", "9번 학생",
				"10번 학생" };
		Scanner Student_Grade = new Scanner(System.in);
		int[] student_grade = new int[10];

		for (int i = 0; i < student_grade.length; i++) {

			System.out.printf("%s의 성적을 입력하세요 : ", student_number[i]);
			student_grade[i] = Student_Grade.nextInt();

		}
		System.out.println("1~10번까지 성적 : " + Arrays.toString(student_grade));
		int grade_sum = 0;

		for (int i = 0; i < student_number.length; i++) {

			grade_sum = grade_sum + student_grade[i];
		}
		float grade_average = (float) (grade_sum) / (float) (student_number.length);
		System.out.println("10명의 학생 성적 합계 : " + grade_sum);
		System.out.println("10명의 학생 성적 평균 : " + grade_average);
	}
}
