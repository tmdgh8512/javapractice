package javapractice;

import java.util.Scanner;

public class javapractice_5 {
// ���� ��� - ������ 90�̻� A, 80�̻� B, 70�̻� C 60�̻� D 60�̸� �����	
	public static void main(String[] args) {

		Scanner Grade = new Scanner(System.in);

		System.out.print("���� �Է� : ");
		int grade = Grade.nextInt();
		if (grade >= 90) {
			System.out.println("���� : A");
		} else if (grade >= 80) {
			System.out.println("���� : B");
		} else if (grade >= 70) {
			System.out.println("���� : C");
		} else if (grade >= 60) {
			System.out.println("���� : D");
		} else if (grade < 60) {
			System.out.println("���� : F�̹Ƿ� ����� �ϼž��մϴ�.");
		}
	}

}
