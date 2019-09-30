package Practice190924;

import java.util.Random;

public class Day190924Hw08 {
	public static void main(String[] args) {
		int[] nums = new int[45];

		for (int i = 0; i < 45; i++) {
			nums[i] = i + 1;
		}
		int s;
		int d;
		Random r = new Random();

		for (int i = 0; i < 100; i++) {
			s = r.nextInt(45);
			d = r.nextInt(45);
			int temp = nums[s];
			nums[s] = nums[d];
			nums[d] = temp;
		}
		int[] lotto = new int[6];

		for (int i = 0; i < 6; i++) {
			lotto[i] = nums[i];
			System.out.printf("[%d] ", lotto[i]);
		}
	}
}
