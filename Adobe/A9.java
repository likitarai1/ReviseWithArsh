class Solution {
        public String nextPalindrome(String num) {
            int n = num.length();
            int mid = (n / 2) - 1;

            String midString = nextGreaterElement(num.substring(0, mid + 1).toCharArray());

            if (midString.length() == 0) return midString;

            StringBuilder temp = new StringBuilder(midString).reverse();
            if (n % 2 == 1) midString = midString + num.charAt(mid + 1);
            return midString + temp.toString();
        }

        public String nextGreaterElement(char[] num) {
            int[] numsArray = new int[num.length];
            for (int i = 0; i < num.length; i++) {
                numsArray[i] = num[i] - '0';
            }
            int i = numsArray.length - 2;
            while (i >= 0 && numsArray[i + 1] <= numsArray[i]) {
                i--;
            }
            if (i == -1) return "";
            if (i >= 0) {
                int j = numsArray.length - 1;
                while (j >= 0 && numsArray[j] <= numsArray[i]) {
                    j--;
                }
                swap(numsArray, i, j);
            }
            reverse(numsArray, i + 1);
            StringBuilder temp = new StringBuilder();
            for (int digit : numsArray) {
                temp.append((char) (digit + '0'));
            }
            return temp.toString();
        }

        private void reverse(int[] nums, int index) {
            int start = index, end = nums.length - 1;
            while (start < end) {
                swap(nums, start, end);
                start++;
                end--;
            }
        }

        private void swap(int[] nums, int i, int j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }

//TC=O(N)
//SC=O(1)