class Solution {
    public int subarraySum(int[] nums, int k) {


        int count = 0;

        int n = nums.length;

        int left =0;

      for(int right =0; right <n; right++){
       
        int sum =0;
         
          sum += nums[right];

          if(sum == k){
             
               count += right-left+1;
               
                nums[left]--;
               left++;
          }
      }

      return count;
    }
}