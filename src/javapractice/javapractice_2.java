package javapractice;

public class javapractice_2 {
// �հ� ���ϱ� - 1���� 100���� �ջ�
	public static void main(String[] args) {

		// for������ �غ���
		int count = 0;
		for (int i = 1; i < 101; i++) {
			count = count + i;
		}
		System.out.println("�հ� : " + count);
		System.out.printf("�հ� : %d\n", count);

		// while������ �غ���
		int i = 1;
		int sum = 0;
		while (i < 101) {
			sum = sum + i;
			i++;
		}
		System.out.println("�հ� : " + sum);
	}

}
