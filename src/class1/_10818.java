package class1;

import java.util.Arrays;
import java.util.Scanner;

public class _10818 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];

		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(arr[0] + " " + arr[arr.length-1]);
		
		
//		int min = 1000001;
//		int max = -1000001;
//		for(int i = 0; i < arr.length; i++) {
//			min = Math.min(min, arr[i]);
//			max = Math.max(max, arr[i]);
//		}
//		
//		System.out.println(min + " " + max);
	}

}
