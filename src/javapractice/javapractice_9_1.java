package javapractice;

import java.util.Arrays;
import java.util.Scanner;

public class javapractice_9_1 {
// 합계 산출 메서드 - 5개의 임의의 정수 값들을 배열로 받아들여, 그 합계를 구하는 함수를 만들기
	public static void main(String[] args) {

		int[] A_grade = new int[5];
		int[] B_grade = new int[5];
		int A_sum = 0;
		int B_sum = 0;

		Scanner Grade = new Scanner(System.in);

		System.out.println("A학생의 과목별 성적을 입력하세요. : ");

		for (int i = 0; i < A_grade.length; i++) {

			A_grade[i] = Grade.nextInt();
			A_sum = A_sum + A_grade[i];

		}
		System.out.println("A학생의 성적 = " + Arrays.toString(A_grade));
		System.out.println("Sum<A> = " + A_sum);

		System.out.println("B학생의 과목별 성적을 입력하세요. : ");

		for (int i = 0; i < A_grade.length; i++) {

			B_grade[i] = Grade.nextInt();
			B_sum = B_sum + B_grade[i];

		}
		System.out.println("B학생의 성적 = " + Arrays.toString(B_grade));
		System.out.println("Sum<B> = " + B_sum);
	}

}
