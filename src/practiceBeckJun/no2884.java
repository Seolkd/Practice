package practiceBeckJun;

import java.util.Scanner;

	public class no2884 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int t1 = sc.nextInt();
			int t2 = sc.nextInt();
			int min = t1*60+t2;
			if(min>45) min = min - 45;
			else if (min<45) min = 24*60 + (min - 45);
			System.out.println(min/60+" "+min%60);
		}
	}
