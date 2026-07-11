class Solution {
    public int findClosestNumber(int[] nums) {
        int minDis = Integer.MAX_VALUE;
        int closest = 0;
        for(int num:nums)
        {
            int dis = Math.abs(num);
            if(dis < minDis)
            {
                minDis = dis;
                closest = num;
            }
            else if(minDis == dis && num > closest)
                closest = num;
        }
        return closest;
    }
}