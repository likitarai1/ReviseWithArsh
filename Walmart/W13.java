public String kthLargestNumber(String[] nums, int k) {
	   Arrays.sort(nums, (left, right) -> {
		  if (left.length() != right.length())
			  return left.length() - right.length();
		  return left.compareTo(right);
	  });
		return nums[nums.length - k];
	}