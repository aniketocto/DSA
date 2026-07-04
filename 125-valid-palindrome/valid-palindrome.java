class Solution {
    public boolean isPalindrome(String s) {
        String cleanedStr = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();;
        char[] arr = cleanedStr.toCharArray();

        int i = 0;
        int j = cleanedStr.length()-1;

        while(i<j){
            if(arr[i] != arr[j]) return false;
            i++;
            j--;
        }
        return true;
    }
}