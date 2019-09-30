package practiceBeckJun;

import java.util.Scanner;

public class no10817 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] n = new int[3];
		for (int i = 0; i < 3; i++) {
			n[i] = sc.nextInt();
		}
		int temp = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				if(n[j]>n[j+1]) {
					temp=n[j];
					n[j]=n[j+1];
					n[j+1]=temp;}
			}
		}
		System.out.println(n[1]);
	}
}
