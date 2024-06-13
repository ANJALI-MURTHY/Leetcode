class Solution {
    public int maxOperations(int[] nums, int k) {
        //Using hashmap to improve the time complexity to O(N) from O(NlogN)
        int counter = 0;
        Map<Integer,Integer> hashmap = new HashMap<>();

        for(int i =0;i<nums.length;i++)
        {
            int diff = k - nums[i];

            if(hashmap.containsKey(diff))
            {
                counter++;
                if(hashmap.get(diff)==1)
                {
                    hashmap.remove(diff);
                }
                else{
                    hashmap.put(diff,hashmap.get(diff)-1);
                }

            }
            else
            {
                hashmap.put(nums[i],hashmap.getOrDefault(nums[i],0)+1);
            }
        }
        return counter;
    }
}