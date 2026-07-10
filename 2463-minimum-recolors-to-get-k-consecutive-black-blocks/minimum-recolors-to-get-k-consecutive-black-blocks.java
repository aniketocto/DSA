class Solution {
    public int minimumRecolors(String blocks, int k) {
        int left = 0;
        int right = k;
        int whiteCount = 0;

        for(int i = 0; i < k; i++)
        {
            if(blocks.charAt(i) == 'W')
                whiteCount++;
        }

        int minWhiteCount = whiteCount;

        while(right < blocks.length())
        {
            if(blocks.charAt(right) == 'W')
                whiteCount++;
            if(blocks.charAt(left) == 'W')
                whiteCount--;
            minWhiteCount = Math.min(minWhiteCount, whiteCount);
            left++;
            right++;
        }
        return minWhiteCount;
    }
}