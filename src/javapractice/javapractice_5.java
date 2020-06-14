package javapractice;

import java.util.Scanner;

public class javapractice_5 {
// 학점 계산 - 점수가 90이상 A, 80이상 B, 70이상 C 60이상 D 60미만 재수강	
	public static void main(String[] args) {

		Scanner Grade = new Scanner(System.in);

		System.out.print("점수 입력 : ");
		int grade = Grade.nextInt();
		if (grade >= 90) {
			System.out.println("학점 : A");
		} else if (grade >= 80) {
			System.out.println("학점 : B");
		} else if (grade >= 70) {
			System.out.println("학점 : C");
		} else if (grade >= 60) {
			System.out.println("학점 : D");
		} else if (grade < 60) {
			System.out.println("학점 : F이므로 재수강 하셔야합니다.");
		}
	}

}
