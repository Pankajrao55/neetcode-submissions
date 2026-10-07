class Solution {
    public int majorityElement(int[] nums) {

        int n = nums.length;

        HashMap<Integer,Integer> mp = new HashMap<>();

        for(int x : nums){
            int count = mp.getOrDefault(x , 0)+1;
            mp.put(x,count);


            if(count > n/2){
                return x;
            }
        }

        return -1;
        
    }
}