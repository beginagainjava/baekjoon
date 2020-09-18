package class1;

import java.util.Scanner;

public class _10809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int[] arr = new int[26];

		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
		
		for(int i = 0; i < str.length(); i++) {
			
			if(arr[i] == -1) {
				arr[str.charAt(i) - 'a'] = i;
			}
		}
		
		for(int i : arr) {
			System.out.print(i + " ");
		}
		
	}

}
