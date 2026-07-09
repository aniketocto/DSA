class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left = 0;
        int right = k;
        double sum = 0;
        for(int i = 0; i < k; i++)
        {
            sum += nums[i]; 
        }
        double average = sum/k;
        double maxAvg = average;

        while(right < nums.length)
        {
            sum = sum + nums[right] - nums[left];
            average = sum/k;
            maxAvg = Math.max(average, maxAvg); 
            right++;
            left++;
        }
        return maxAvg;
    }
}