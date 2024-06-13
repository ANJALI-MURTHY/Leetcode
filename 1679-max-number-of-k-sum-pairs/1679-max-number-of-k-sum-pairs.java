class Solution {
    public int maxOperations(int[] nums, int k) {
        int i = 0;
        int j = nums.length -1;
        int counter = 0;
        Arrays.sort(nums);
        while(i<j)
        {
            if(nums[i]+nums[j]<k)
            {
                i++;
            }
            else if(nums[i]+nums[j]>k)
            {
                j--;
            }
            else
            {
                counter++;
                j--;
                i++;
            }

        }
        return counter;
        
    }
}