class Solution {
    public int[] twoSum(int[] nums, int target) {
        //use linkedhashmap
        int[] res = {0,0};
        int indice = 0;
        Map<Integer,Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            
            // Check if the complement (target - nums[i]) exists in the map
            if (map.containsKey(diff)) {
                // If it exists, return the indices of the two numbers
                res[0] = map.get(diff);
                res[1] = i;
                break;
            }
            else{
                map.put(nums[i], i);
            }
        }
        return res;
    }
        
}