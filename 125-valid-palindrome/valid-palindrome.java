class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder cleanedStr = new StringBuilder();

        for(char ch : s.toCharArray())
        {
            if(Character.isLetterOrDigit(ch))
            {
                cleanedStr.append(Character.toLowerCase(ch));
            }
        }

        int i = 0;
        int j = cleanedStr.length() - 1;

        while(i < j)
        {
            if(cleanedStr.charAt(i) != cleanedStr.charAt(j))
            {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}