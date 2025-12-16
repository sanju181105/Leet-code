class Solution {
    public int maximum69Number (int num) {
        int temp = num;
        int a = 1;
        int b = 0;
        while (temp > 0) {
            int digit = temp % 10;
            if (digit == 6) {
                b = 3 * a;
            }
            temp /= 10;
            a *= 10;
        }
        return num + b;
    }
}
