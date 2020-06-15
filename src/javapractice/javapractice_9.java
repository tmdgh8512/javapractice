package javapractice;

public class javapractice_9 {
// 시저의 암호 - "Hello world"를 시저의 암호화 기법을 사용하여 "Khoor Zroug"로 나타내기
	public static void main(String[] args) {

		int Tmp;
		String Code = "Hello world";
		String Detect = "";

		System.out.println("원문 : " + Code);

		for (int i = 0; i < Code.length(); i++) {

			Tmp = (int) Code.charAt(i);
			if ((97 <= Tmp) && (Tmp <= 122)) {

				Tmp = Tmp + 3;
				Detect = Detect + (char) Tmp;

			} else if ((65 <= Tmp) && (Tmp <= 90)) {

				Tmp = Tmp + 3;
				Detect = Detect + (char) Tmp;

			} else {

				Detect = Detect + (char) Tmp;

			}

		}

		System.out.print("암호 : " + Detect);

	}

}
