public class Solution {
    public int FindMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int counter = 0;
           foreach (int num in nums) 
           {
            if (num == 1) {
                counter++;
                max = Math.Max(max,counter);  //use Math.Max function
            } else {
                counter = 0;
            }
           }
        return max;
    }
}
