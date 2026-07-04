class Solution {
    public boolean isPalindrome(String s) {
        String cleanedStr = "";
        
        for(char ch: s.toCharArray())
        {
            if(Character.isLetterOrDigit(ch))
            {
                cleanedStr += Character.toLowerCase(ch);
            }
        }

        int i = 0;
        char[] arr = cleanedStr.toCharArray();
        int j = cleanedStr.length()-1;

        while(i<j){
            if(arr[i] != arr[j]) return false;
            i++;
            j--;
        }
        return true;
    }
}