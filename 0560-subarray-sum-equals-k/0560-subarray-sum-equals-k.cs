public class Solution {
    public int SubarraySum(int[] nums, int k) {
        int sum = 0;
        int count = 0;
        Dictionary<int ,int > dict = new Dictionary<int,int>(); // this stores [sum , frequency]
        dict[0] =1; //number 0 has been seen once.
        foreach(int num in nums){
            sum +=num;
            int diff = sum - k;
            if(dict.ContainsKey(diff))
            {
                count+= dict[diff]; //HINT:how many times have I seen this sum diff before
            }
            if(dict.ContainsKey(sum))
            {
                dict[sum]++;
            }
            else
            {
                dict[sum] = 1;
            }
        }
        return count;
    }
}