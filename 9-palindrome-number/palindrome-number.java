class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)return false;
        int n=0,rev=0;
        n=x;
        while(x!=0){
            int digit=x%10;
            rev=rev*10+digit;
            x=x/10;
        }
        if(n==rev){
            return true;
        }
        else{
            return false;
        }
    }
}