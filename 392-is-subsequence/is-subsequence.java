class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        char[] res =  new char[sArr.length];
        int i = 0;
        int j = 0;

        while(i < s.length() && j < t.length())
        {
            if(sArr[i] == tArr[j])
            {
                res[i] = sArr[i];
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