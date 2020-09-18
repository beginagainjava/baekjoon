package class1;

import java.util.Scanner;

public class _2562 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[9];
		
		for(int i = 0; i <arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int max = 0;
		int index = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				index = i+1;
				max = arr[i];
			}
		}
		
		System.out.println(max);
		System.out.println(index);
		
		
	}
}
