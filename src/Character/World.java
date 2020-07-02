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
		
		 String arr[] = new String[10];  // 배열선언
	        Scanner sc = new Scanner(System.in);
	 
	        System.out.println(" 10자 이내의 캐릭터 이름을 정해주세요 ");
	 
	        for (int i = 0; i < arr.length; i++) {
	            arr[i] = sc.nextLine();
	            for (int j = 0; j < i; j++) {
	 
	                if (arr[i] == arr[j]) {  // 중복검사
	                    System.out.println("중복되는 캐릭터명입니다 다시입력하세요.");
	                    i--;
	                }
	            }
	        }
		
	}
	
}
