class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        int i = 0;
        int j = 0;

        while(i < s.length() && j < t.length())
        {
            if(sArr[i] == tArr[j])
            {
                i++;
                j++;
            }
            else
            {
                j++;
            } 
        }
        return i == sArr.length;
    }
}