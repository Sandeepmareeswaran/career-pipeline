class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hmap.put(nums[i],hmap.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer>mp:hmap.entrySet()){
            if(mp.getValue()==1){
                return mp.getKey();
            }
        }
        return -1;
        
    }
}