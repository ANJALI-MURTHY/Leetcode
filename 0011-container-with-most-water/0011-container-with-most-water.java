class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length -1;
        int max_Area = 0;

        while(left<right)
        {
            int area = Math.min(height[left],height[right]) * (right-left);
            max_Area = Math.max(max_Area, area);

            if(height[left]<height[right])
            {
                left +=1;
            }
            else 
            right--;
        }
        return max_Area;
        
    }
}