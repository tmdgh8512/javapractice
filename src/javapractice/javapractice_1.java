package javapractice;

import java.util.Scanner;

public class javapractice_1 {
// ¿Âµµº¯È­ - ¼·¾¾ ¿Âµµ¸¦ È­¾¾ ¿Âµµ·Î º¯È¯
	public static void main(String[] args) {

		System.out.print("¼·¾¾¿Âµµ¸¦ ÀÔ·ÂÇÏ¼¼¿ä ");
		Scanner C_Temperature = new Scanner(System.in);
		double c_temperature = C_Temperature.nextDouble();

		double f_temperature = (double)9/(double)5 * c_temperature + 32;
		System.out.println("¼·¾¾¿Âµµ¸¦ È­¾¾¿Âµµ·Î º¯È¯ÇÏ¸é " + f_temperature);
		System.out.printf("%.2f(¼·¾¾¿Âµµ)¸¦ È­¾¾¿Âµµ·Î º¯È¯ÇÏ¸é %.2f\n", c_temperature, f_temperature);
	}

}
