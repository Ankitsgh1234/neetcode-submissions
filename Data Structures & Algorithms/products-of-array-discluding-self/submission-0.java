class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int z = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                z++;
            }
        }
        if (z == 0) {
            int p = 1;
            for (int i = 0; i < n; i++) {
                p *= nums[i];
            }
            for (int i = 0; i < n; i++) {
               arr[i]=p/nums[i];
            }
        }
       else if (z == 1) {
            int p = 1;
            for (int i = 0; i < n; i++) {
                if(nums[i]==0){
                    continue;
                }
                p *= nums[i];
            }
            for (int i = 0; i < n; i++) {
                if(nums[i]==0){
                    arr[i]=p;
                }else
               arr[i]=0;
            }
        }
        else{
            for(int i=0;i<n;i++){
                arr[i]=0;
            }
        }
        return arr;
    }
}
