class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int sum=0;
        HashMap<Integer,Integer> mp= new HashMap<>();
        for(int j=0; j<n; j++){
            int com= target-nums[j];
            if(mp.containsKey(com)){
                return new int[]{mp.get(com),j};
            }
            mp.put(nums[j],j);
            
        }
        return new int[]{-1,-1};
    }
}