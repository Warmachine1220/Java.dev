class Solution1 {
	public static int[] twoSum(int[] nums, int target) {

		for (int i = 0; i < nums.length; i++) {
			int[] blue = new int[2];
			for (int j = 0; j < nums.length; j++) {
				if (i == j) {
					continue;
				} else if (nums[i] + nums[j] == target) {
					blue[0] = i;
					blue[1] = j;
					return blue;
				}
			}
		}
		return null;

	}



}

