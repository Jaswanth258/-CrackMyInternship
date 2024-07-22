class Solution {
    public void sortColors(int[] nums) {
        int zeros = 0, ones  = 0, n = nums.length;
        for(int color : nums) {
            if(color == 0) zeros++;
            if(color == 1) ones++;
        }
        for(int i = 0; i < n; i++) {
            if(i < zeros) nums[i] = 0;
            if(zeros <= i && i < zeros + ones) nums[i] = 1;
            if(i >= zeros + ones) nums[i] = 2;
        }
    }
}
