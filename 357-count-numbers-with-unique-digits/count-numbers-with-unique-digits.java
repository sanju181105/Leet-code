class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n==0)return 1;
        int r=10;
        int k=9;
        int c=9;
        for (int i = 2; i <= n && c > 0; i++) {
            k *= c;
            r += k;
            c--;
        }
        return r;
    }
}
    
