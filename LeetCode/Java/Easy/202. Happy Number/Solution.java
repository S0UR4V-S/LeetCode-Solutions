class Solution {
    public boolean isHappy(int n) {
            
        while (n*n > 10) {
            int sq = 0;

            while (n> 0) {
                sq += (n % 10) * (n % 10);
                n /= 10;
            }
            n = sq;
            sq = 0;
        }

        if (n == 1)
            return true;

        return false;
    }
}