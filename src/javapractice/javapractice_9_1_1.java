package javapractice;

import java.util.Arrays;
import java.util.Scanner;

public class javapractice_9_1_1 {
	
	public static void sum()	{
		
		Scanner Score = new Scanner(System.in);
		Scanner Name = new Scanner(System.in);
		String name = "";
		
		System.out.print("성함을 입력하세요 ");
		name = Name.nextLine();
		
		int [] score = new int[5];
		int sum = 0;
		
		System.out.printf("%s학생의 성적을 입력하세요", name);
		for (int i = 0; i < score.length; i++) {
			score[i] = Score.nextInt();
			sum = sum + score[i];
		}
		
		System.out.printf("%s의 성적 : %d, %d, %d, %d, %d\n" , name, score[0], score[1], score[2], score[3], score[4]);
		System.out.printf("sum<%s> = %d\n", name, sum);
		
	}
	
	public static void main(String[] args) {
		
		sum();
		sum();		
		
	}

}
