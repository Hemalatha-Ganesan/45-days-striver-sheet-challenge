class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int sum = 0,max = nums[0];
        for(int num:nums)
        {
            sum += num;
            if(sum > max){
                max = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return max;
    }
}
