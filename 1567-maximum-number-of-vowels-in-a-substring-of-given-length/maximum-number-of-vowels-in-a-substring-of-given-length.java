class Solution {
    public int maxVowels(String s, int k) {
        int left = 0;
        int right = k;
        int vowelCount = 0;
        char[] arr = s.toCharArray();
        for(int i = 0; i < k; i++)
        {
            if(arr[i] == 'a' || arr[i] == 'e' ||
            arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u')
            {
                vowelCount++;
            }
        }

        int maxVowelCount = vowelCount;
        while(right < arr.length)
        {
            if(arr[left] == 'a' || arr[left] == 'e' ||
            arr[left] == 'i' || arr[left] == 'o' || arr[left] == 'u')
            {
                vowelCount--;
            }
            if(arr[right] == 'a' || arr[right] == 'e' ||
            arr[right] == 'i' || arr[right] == 'o' || arr[right] == 'u')
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