class Solution {
    public void moveZeroes(int[] nums) {
        int in=0;
        for(int num:nums){
            if(num!=0){
                nums[in]=num;
                in++;
            }
        }
        while(in<nums.length){
            nums[in]=0;
            in++;
        }
    }
}