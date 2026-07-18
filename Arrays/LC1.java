class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        hmap.put(nums[0],0);
        for(int i=1;i<nums.length;i++){

            int t=target-nums[i];
            if(hmap.containsKey(t)){
                return (new int[]{hmap.get(t),i});
            }else{
                hmap.put(nums[i],i);
            }
        }
        return (new int[]{0,0});
    }
}