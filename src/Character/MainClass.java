package Character;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // ������� �Է��� ���� Scanner ��ü ����
		  String CharacterName = sc.nextLine(); // ����ڰ� �Է��� ���ڿ�(�� ����)�� CharacterName�� ����
		  String result = ""; // �ߺ��� ���� ���� ���ڿ��� ������ ���ڿ� ����
		  
		  for(int i = 0; i < CharacterName.length(); i++) { // i�� 0���� ����ڰ� �Է��� ���ڿ��� ���̸�ŭ �ݺ����� ������.
		   if(!result.contains(String.valueOf(CharacterName.charAt(i)))) { // ����ڰ� �Է¹��� ���ڿ��� i��° ���ڸ� String���� �ٲٰ� result�� �� ���ڰ� ���ԵǾ� ���� �ʴٸ�
		    result += String.valueOf(CharacterName.charAt(i));  // result�� ��� �߰�, �� �ߺ����� ������ �߰�
		   }
		  }
		  System.out.println(result);
		 }
}
