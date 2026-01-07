class Solution {
    public boolean checkPerfectNumber(int n) {
        if (n <= 1) return false;
        int sum = 1;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                sum += i;
                int other = n / i;
                if (other != i) sum += other;
            }
        }
        return sum == n;
    }
}
