class Solution {
    public boolean isHappy(int n) {
            int temp1=n;
            int temp=0;
        while (n*n > 10 && temp!=temp1) {
            int sq = 0;

            while (n> 0) {
                sq += (n % 10) * (n % 10);
                n /= 10;
            }
            n = sq;
            sq = 0;
            temp=n;
        }

        if (n == 1)
            return true;

        return false;
    }
}