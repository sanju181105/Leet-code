class Solution {
    public int bitwiseComplement(int n) {
     if(n==0) return 1;
     int binary=0;
     int temp=n;
     while(temp!=0){
        binary=(binary<<1)|1;
        temp>>=1;
     }
     return binary^n;
    }
}
     