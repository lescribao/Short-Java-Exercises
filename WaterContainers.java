class Solution {
    public int maxArea(int[] height) {
        
        //we need to find the maximum lenght + height that will in the end give the biggest result
        
        // we need to find both the biggest numbers in the array that are *also* the furthest away from each other possible
        
        int totalValue = 0;
        
        for(int i = 0; i < height.length; i++){
        for(int j = i + 1; j < height.length; j++){
            
            totalValue = Math.max(totalValue, Math.min(height[i], height[j]) * (j - i));
        }
        }
        return totalValue;
    }
}
