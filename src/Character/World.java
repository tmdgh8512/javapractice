package Character;

import java.util.ArrayList;
import java.util.Scanner;

public class World {

	private String World_Name;
	private ArrayList<Character> Characters;
	
	public World(String WorldName) {
		
		this.World_Name = WorldName;
		
	}
	
	private void addCharacter() {
		
		 String arr[] = new String[10];  // �迭����
	        Scanner sc = new Scanner(System.in);
	 
	        System.out.println(" 10�� �̳��� ĳ���� �̸��� �����ּ��� ");
	 
	        for (int i = 0; i < arr.length; i++) {
	            arr[i] = sc.nextLine();
	            for (int j = 0; j < i; j++) {
	 
	                if (arr[i] == arr[j]) {  // �ߺ��˻�
	                    System.out.println("�ߺ��Ǵ� ĳ���͸��Դϴ� �ٽ��Է��ϼ���.");
	                    i--;
	                }
	            }
	        }
		
	}
	
}
