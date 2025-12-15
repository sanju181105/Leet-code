class Solution {
    public int addDigits(int num) {
        if(num<10)return num;
        int v=0;
        while(num>9){
            int n=num/10;
            int m=num%10;
            v=n+m;
            num=v;
        }
        return v;
    }
}