class Solution {
    public double findMaxAverage(int[] nums, int k) {
        //to calculate the initial sum for sliding window
        int sum = 0;
        for(int i =0; i<k;i++)
        {
            sum += nums[i];
        }

        int max_sum = sum;
        int start = 0;
        int end = k;
        

        //Start with sliding window subtract the value of previous element from sum 
        //and increment the sum by adding the value of next element of the window
        while(end<nums.length)
        {
            sum -=nums[start];
            start++;

            sum += nums[end];
            end++;

            max_sum = Math.max(max_sum, sum);
        }

        return (double) max_sum/k;
    }
}