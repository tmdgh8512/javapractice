package javapractice;

import java.util.Scanner;

public class javapractice_7 {
// 국영수 합계와 평균 - 한 학급에 5명의 학생이 있고, 각 학생당 국영수 세 과목 점수가 배열에 저장되어 있다.
	public static void main(String[] args) {

		String[] student_number = { "1번학생", "2번학생", "3번학생", "4번학생", "5번학생" };
		Scanner Student_Grade = new Scanner(System.in);
		int[][] student_grade = new int[5][3];
		int[] sum = new int[5];
		double[] average = new double[5];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.printf("%s의 국.영.수 성적을 입력하세요 : ", student_number[i]);
				student_grade[i][j] = Student_Grade.nextInt();
				sum[i] = sum[i] + student_grade[i][j];
			}
		}
		for (int i = 0; i < 5; i++) {
			average[i] = (double) sum[i] / (double) 3;
			System.out.printf("%s :  성적 합계 = %d, 평균 = %f \n", student_number[i], sum[i], average[i]);

		}

	}

}
