class Solution {
    public boolean isVowels(char ch)
    {
        return ch == 'a' || ch == 'e' ||
            ch == 'i' || ch == 'o' || ch == 'u';
    }
    public int maxVowels(String s, int k) {
        int left = 0;
        int right = k;
        int vowelCount = 0;
        char[] arr = s.toCharArray();
        for(int i = 0; i < k; i++)
        {
            if(isVowels(arr[i]))
            {
                vowelCount++;
            }
        }

        int maxVowelCount = vowelCount;
        while(right < arr.length)
        {
            if(isVowels(arr[left]))
            {
                vowelCount--;
            }
            if(isVowels(arr[right]))
            {
                vowelCount++;
            }
            maxVowelCount = Math.max(maxVowelCount, vowelCount);
            left++;
            right++;
        }
        return maxVowelCount;
    }
}