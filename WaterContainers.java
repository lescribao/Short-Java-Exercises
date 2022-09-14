class Solution {
    public int maxArea(int[] height) {
        
        //we need to find the maximum lenght + height that will in the end give the biggest result
        
        // we need to find both the biggest numbers in the array that are *also* the furthest away from each other possible
        
        int totalValue = 0;
        int left = 0;
        int right = height.length - 1;
        
        while(left < right) {
            int tempValue = (right - left) * Math.min(height[left], height[right]);
            
            if(tempValue > totalValue) {
                totalValue = tempValue;
            }
            
            if(height[left] > height[right]) {
                right--;
            }
            else {
                left++;
            }
        }
    return totalValue;
    }
}
