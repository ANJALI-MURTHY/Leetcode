public class Solution {
    public int RemoveDuplicates(int[] nums) {
        //here the hint is "Sorted Array"
        //this can be solved using hashmap but it's space complexity is O[n]
        //however by solving this in 2P , space complexity becomes 0[1]
        if(nums == null ||nums.Length == 0)
            return 0;
        
        int unique = 1;
        for(int i = 1;i<nums.Length;i++)
        {
            if(nums[i]!= nums[i-1])
            {
                nums[unique]=nums[i];  //tricky line.
                unique ++;
            }
            
        }
        return unique;
    }
}