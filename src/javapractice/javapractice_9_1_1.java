package javapractice;

import java.util.Arrays;
import java.util.Scanner;

public class javapractice_9_1_1 {
	
	public static void sum()	{
		
		Scanner Score = new Scanner(System.in);
		Scanner Name = new Scanner(System.in);
		String name = "";
		
		System.out.print("������ �Է��ϼ��� ");
		name = Name.nextLine();
		
		int [] score = new int[5];
		int sum = 0;
		
		System.out.printf("%s�л��� ������ �Է��ϼ���", name);
		for (int i = 0; i < score.length; i++) {
			score[i] = Score.nextInt();
			sum = sum + score[i];
		}
		
		System.out.printf("%s�� ���� : %d, %d, %d, %d, %d\n" , name, score[0], score[1], score[2], score[3], score[4]);
		System.out.printf("sum<%s> = %d\n", name, sum);
		
	}
	
	public static void main(String[] args) {
		
		sum();
		sum();		
		
	}

}
