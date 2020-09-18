package class1;

import java.util.Scanner;

public class _2577 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		Integer result = a *  b * c ;
		String compare = result.toString();
		int[] arr = new int[10];
		
		for(int i = 0; i < compare.length(); i++) {
			arr[compare.charAt(i) - '0']++;
		}
		
		for(int i : arr) {
			System.out.println(i);
		}
		
	}

}
