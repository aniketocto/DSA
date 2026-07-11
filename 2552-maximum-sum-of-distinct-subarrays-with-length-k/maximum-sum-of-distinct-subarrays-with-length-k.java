class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int left = 0;
        int right = k;
        long maxSum = 0;
        long sum = 0;
        HashMap <Integer, Integer> map = new HashMap<>(); 
        for(int i = 0; i < k; i++)
        {
            sum += nums[i];
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        if(map.size() == k)
        {
            maxSum = sum;
        }

        while(right < nums.length)
        {
            sum = sum - nums[left] + nums[right];
            map.put(nums[left], map.getOrDefault(nums[left], 0) - 1);
            if(map.get(nums[left]) == 0)
            {
                map.remove(nums[left]);
            }
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
            if(map.size() == k)
            {
                maxSum = Math.max(maxSum, sum);
            }

            left++;
            right++;
        }
        return maxSum;
    }
}