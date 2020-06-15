package javapractice;

import java.util.Scanner;

public class javapractice_8 {
// 대소문자 변환 - 입력받은 대문자는 소문자로, 소문자는 대문자로 변환하기
	public static void main(String[] args) {

		String input = "";
		String output = "";
		int tmp;

		Scanner Input = new Scanner(System.in);

		System.out.print("대문자나 소문자를 입력하세요 : ");
		input = Input.nextLine();

		for (int i = 0; i < input.length(); i++) {

			tmp = (int) input.charAt(i); // 문자열은 아스키코드(숫자)로 저장되기 때문에 int형으로 변환
			// .charAt(i) 문자열에서 i번째 인덱스를 추출할때 쓰인다.
			if ((65 <= tmp) && (tmp <= 90)) {

				tmp = tmp + 32;
				output = output + (char) tmp;

			} else if ((97 <= tmp) && (tmp <= 122)) {

				tmp = tmp - 32;
				output = output + (char) tmp;

			} else

				output = output + (char) tmp;

		}

		System.out.print("변환된 문자열 : " + output);

	}

}
