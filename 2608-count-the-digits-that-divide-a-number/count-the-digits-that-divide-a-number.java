class Solution {
    public int countDigits(int num) {
        int n=num,step=0;
        if(n<10){
            step++;
            return step;
        }
        while(num!=0){
            int temp=num%10;
            if(n%temp==0){
                step++;
            }num/=10;
        }
        return step;
    }
}