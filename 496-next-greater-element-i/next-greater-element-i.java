class Solution {
    public int[] nextGreaterElement(int[] a, int[] b) {      
        int n = a.length;
        int m = b.length;
        int[] ans = new int[n];       
        for (int i = 0; i < n; i++) {         
            int x = a[i];
            int res = -1;
            int j;          
            // find position of x in b
            for (j = 0; j < m; j++) {
                if (b[j] == x) {
                    break;
                }
            }         
            // find next greater element
            for (int k = j + 1; k < m; k++) {
                if (b[k] > x) {
                    res = b[k];
                    break;
                }
            }     
            ans[i] = res;
        }       
        return ans;
    }
}
