class Solution {
    public void duplicateZeros(int[] arr) {
        int zeros = 0;
        for(int val: arr)
        {
            if(val==0)
            {
                zeros++;
            }
        }
        int i = arr.length - 1;
        int j = arr.length - 1 + zeros;
        while(i >= 0)
        {
           if(j < arr.length)
           {
                arr[j]=arr[i];
           }
           j--;

           if(arr[i] == 0)
           {
            if(j < arr.length)
           {
                arr[j]=arr[i];
           }
           j--;
           }
           i--;
        }
    }
}