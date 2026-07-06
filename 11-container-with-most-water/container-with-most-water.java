class Solution {
    public int maxArea(int[] height) {
        int maxArear = 0;
        int i = 0;
        int j = height.length - 1;

        while(i < j)
        {
            int minHeight = Math.min(height[i], height[j]);
            int width = j - i;
            int area = width * minHeight;
            maxArear = Math.max(maxArear, area);

            if(height[i] > height[j])
            {
                j--;
            }
            else
            {
                i++;
            }
            
        }
        return maxArear;
    }
}