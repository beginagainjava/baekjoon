package class1;

import java.util.Scanner;

public class _2475 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		int result = 0;
		
		for(int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
			arr[i] = (int) Math.pow(arr[i], 2);
			result += arr[i];
		}
		
		System.out.println(result%10);

		
		
		
	}

}
