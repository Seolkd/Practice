package practiceBeckJun;

import java.util.Scanner;

public class no10871 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] b = new int[n];

		for (int i = 0; i < n; i++) {
			b[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			if (b[i] < x)
				System.out.print(b[i] + " ");
		}
	}
}
