class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int left = 0;
        int right = k;
        int sum = 0;
        int count = 0;
        for(int i = 0; i < k; i++)
            sum+=arr[i];
        
        int average = sum / k;
        if(average >= threshold)
            count++;
        
        while(right < arr.length)
        {
            sum = sum - arr[left] + arr[right];
            average = sum / k;
            if(average >= threshold)
                count++;
            left++;
            right++;
        }
        return count;        
    }
}