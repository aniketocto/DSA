class Solution {
    public int totalFruit(int[] fruits) {
        int l = 0;
        int r = 0;
        int maxL = 0;
        int n = fruits.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        while(r < n)
        {
            map.put(fruits[r], map.getOrDefault(fruits[r], 0) + 1);

            while(map.size() > 2)
            {
                map.put(fruits[l], map.getOrDefault(fruits[l], 0) - 1);
                if(map.get(fruits[l]) == 0)
                {
                    map.remove(fruits[l]);
                }
                l++;
            }

            maxL = Math.max(maxL, r-l+1);
            r++;
        }
        return maxL;
    }
}