package javapractice;

import java.util.Scanner;

public class javapractice_1 {
// �µ���ȭ - ���� �µ��� ȭ�� �µ��� ��ȯ
	public static void main(String[] args) {

		System.out.print("�����µ��� �Է��ϼ��� ");
		Scanner C_Temperature = new Scanner(System.in);
		double c_temperature = C_Temperature.nextDouble();

		double f_temperature = (double)9/(double)5 * c_temperature + 32;
		System.out.println("�����µ��� ȭ���µ��� ��ȯ�ϸ� " + f_temperature);
		System.out.printf("%.2f(�����µ�)�� ȭ���µ��� ��ȯ�ϸ� %.2f\n", c_temperature, f_temperature);
	}

}
