package Basic;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int b = n;
		int i = 0;
		for (i = 0; i >= 0; i++) {
			b = b / 10;
			if(b == 0) break;
		}
		int k = i + 1;
		int[] a = new int[k];
		if(Arm(a,n,k)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		} 
	}
	public static boolean Arm(int[] a, int n, int k) {
		int c = n;
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			a[i] = n % 10;
			n = n / 10;
			sum = sum + (int)Math.pow(a[i], k);
		}
		if(sum == c) return true;
		return false;
		
	}
}
