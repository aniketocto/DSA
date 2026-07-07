class Solution {
    public long sumAndMultiply(int n) {
        long x = 0;
        long place = 1;
        long sum = 0;

        while(n > 0)
        {
            int digit = n % 10;
            if(digit != 0)
            {
                x = digit * place + x;
                sum += digit;
                place = 10 * place;
            }

            n = n / 10;
        }
        return sum * x;
    }
}