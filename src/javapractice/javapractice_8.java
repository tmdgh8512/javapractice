package javapractice;

import java.util.Scanner;

public class javapractice_8 {
// ��ҹ��� ��ȯ - �Է¹��� �빮�ڴ� �ҹ��ڷ�, �ҹ��ڴ� �빮�ڷ� ��ȯ�ϱ�
	public static void main(String[] args) {

		String input = "";
		String output = "";
		int tmp;

		Scanner Input = new Scanner(System.in);

		System.out.print("�빮�ڳ� �ҹ��ڸ� �Է��ϼ��� : ");
		input = Input.nextLine();

		for (int i = 0; i < input.length(); i++) {

			tmp = (int) input.charAt(i); // ���ڿ��� �ƽ�Ű�ڵ�(����)�� ����Ǳ� ������ int������ ��ȯ
			// .charAt(i) ���ڿ����� i��° �ε����� �����Ҷ� ���δ�.
			if ((65 <= tmp) && (tmp <= 90)) {

				tmp = tmp + 32;
				output = output + (char) tmp;

			} else if ((97 <= tmp) && (tmp <= 122)) {

				tmp = tmp - 32;
				output = output + (char) tmp;

			} else

				output = output + (char) tmp;

		}

		System.out.print("��ȯ�� ���ڿ� : " + output);

	}

}
