class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0;
        int r = 0;
        int maxL = 0;
        int maxFreq = 0;
        // HashMap<Character, Integer> map = new HashMap<>();
        int[] arr = new int[26];

        while(r < s.length())
        {
        //    map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0) + 1);
        //    maxFreq = Math.max(maxFreq, map.get(s.charAt(r)));
            arr[s.charAt(r) - 'A']++;
            maxFreq = Math.max(maxFreq, arr[s.charAt(r) - 'A']);

           while ((r - l + 1) - maxFreq > k)
           {
                // map.put(s.charAt(l), map.getOrDefault(s.charAt(l), 0) - 1);
                arr[s.charAt(l) - 'A']--;
                // if(map.get(s.charAt(l)) == 0)
                // {
                    // map.remove(s.charAt(l));
                // }
                l++;
           }
           maxL = Math.max(maxL, r-l+1);
            r++;
        }
        return maxL;
    }
}