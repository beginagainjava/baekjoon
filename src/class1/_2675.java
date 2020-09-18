package class1;

import java.util.Scanner;

public class _2675 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		int[] countArr = new int[t];
		String[] strArr = new String[t];
		
		for(int i = 0; i < t; i++) {
			countArr[i] = sc.nextInt();
			strArr[i] = sc.next();
		}
		
		for(int i = 0; i < t; i++) {
			for(int j = 0; j < strArr[i].length(); j++) {
				for(int k = 0; k < countArr[i]; k++) {
					System.out.print(strArr[i].charAt(j));
				}
			}System.out.println();
		}
		

		
	}

}
