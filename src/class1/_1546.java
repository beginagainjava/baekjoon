package class1;

import java.util.Arrays;
import java.util.Scanner;

public class _1546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] arr = new double[n];
		double result = 0;

		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] / arr[arr.length-1] * 100;
			result += arr[i];
		}
		
		double avg = result / n;
		System.out.println(avg);

		
	}

}
