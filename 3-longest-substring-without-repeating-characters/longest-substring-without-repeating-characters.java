class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int r = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int maxLength = 0;

        while(r < s.length())
        {
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0) + 1);

            while(map.get(s.charAt(r)) > 1)
            {
                map.put(s.charAt(l), map.getOrDefault(s.charAt(l), 0) - 1);

                if(map.get(s.charAt(l)) == 0)
                {
                    map.remove(s.charAt(l));
                }

                l++;
            }
            maxLength = Math.max(maxLength, r - l + 1);
            r++;
        }
        return maxLength;
    }
}