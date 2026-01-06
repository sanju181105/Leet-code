class Solution {
    public boolean canAliceWin(int[] nums) {
       int si=0;
       int dou=0;
       int total=0;
       for(int num:nums){
        total+=num;
        if (num <= 9) si += num;
            else dou += num;
        }
        return si>total-si||dou>total-dou;
        
    }
}