package class1;

import java.util.Scanner;

public class _10951 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String str = sc.next();
		
		int result = 0;
		for(int i = 0; i < str.length(); i++) {
			result += str.charAt(i) - '0';
		}
		System.out.println(result);
		
	}

}
