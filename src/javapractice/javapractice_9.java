package javapractice;

public class javapractice_9 {
// ������ ��ȣ - "Hello world"�� ������ ��ȣȭ ����� ����Ͽ� "Khoor Zroug"�� ��Ÿ����
	public static void main(String[] args) {

		int Tmp;
		String Code = "Hello world";
		String Detect = "";

		System.out.println("���� : " + Code);

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

		System.out.print("��ȣ : " + Detect);

	}

}
