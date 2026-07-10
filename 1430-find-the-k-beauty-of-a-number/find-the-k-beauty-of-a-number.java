class Solution {
    public int divisorSubstrings(int num, int k) {
        String s = Integer.toString(num);
        int count = 0;
        for(int i = 0; i+k <= s.length(); i++)
        {
            String newStr = s.substring(i, i+k);
            int subArr = Integer.parseInt(newStr);
            if(subArr != 0 && num % subArr == 0)
                count++;
        }
        return count;
    }
}