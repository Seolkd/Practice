package practiceBeckJun;

import java.util.Scanner;

public class no10952 {
	public static void main(String[] args) {
		sum(1,1);
		sum(2,3);
		sum(3,4);
		sum(9,8);
		
	}
			public static void sum(int a, int b) {
				Scanner sc = new Scanner(System.in);
				int a = sc.nextInt();
				int b = sc.nextInt();
				while(a!=0 && b!=0) {
					System.out.println(a+b);
					a = sc.nextInt();
					b = sc.nextInt();
		
		}
	}
}
