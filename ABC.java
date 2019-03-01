package Basic;

import java.util.Scanner;


public class ABC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		Find(a,n);
	}
	public static void Find(int[] a, int n) {
		int count = 1;
		int max = 0;
		int h = 0;
		int m = 0;
		for (int i = 0; i < n - 1; i++) {
			m = a[0];
				if(a[i + 1] == m) {
				count ++;
				h = i + 1;
				if(count > max) {
					max = count;
				}
			} m = a[h + 1];
			
		}
		System.out.println(max + "," +  h);
	}
}
