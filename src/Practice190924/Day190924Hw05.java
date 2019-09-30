package Practice190924;

import java.util.Random;

public class Day190924Hw05 {
	public static void main(String[] args) {
		int[] nums = new int[45];

		for (int i = 0; i < 45; i++) {
			nums[i] = i + 1;
		}
		int s;
		int d;
		
		Random r = new Random();
		s = r.nextInt(45);
		d = r.nextInt(45);
		System.out.println(nums[s]+" "+nums[d]);
		int temp=nums[s];
		nums[s]=nums[d];
		nums[d]=temp;
		System.out.println(nums[s]+" "+nums[d]);
	}
}
