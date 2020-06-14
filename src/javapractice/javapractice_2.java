package javapractice;

public class javapractice_2 {
// 합계 구하기 - 1부터 100까지 합산
	public static void main(String[] args) {

		// for문으로 해보기
		int count = 0;
		for (int i = 1; i < 101; i++) {
			count = count + i;
		}
		System.out.println("합계 : " + count);
		System.out.printf("합계 : %d\n", count);

		// while문으로 해보기
		int i = 1;
		int sum = 0;
		while (i < 101) {
			sum = sum + i;
			i++;
		}
		System.out.println("합계 : " + sum);
	}

}
