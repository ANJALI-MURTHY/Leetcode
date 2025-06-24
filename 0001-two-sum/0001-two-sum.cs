public class Solution {
    public int[] TwoSum(int[] nums, int target) {
        //main idea : number - complement present in dict or not.
        Dictionary<int ,int> hashMap = new Dictionary<int,int>();
        for(int i =0;i < nums.Length;i++)
        {
            int secondNumber = target - nums[i];
            if(hashMap.ContainsKey(secondNumber))
            {
                return new int[] {hashMap[secondNumber],i};
            }
            else
            {
                hashMap[nums[i]] = i;
            }
        }
return new int[] {};

        
    }
}