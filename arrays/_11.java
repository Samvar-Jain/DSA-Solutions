public class _11 {
    public int maxArea(int[] height) {
        int low = 0,
            high = height.length-1,
            maxArea = 0;
        while(low<high){
            int length = Math.min(height[low],height[high]);
            int width = high-low;
            int currArea = Math.abs(length*width);
            maxArea = Math.max(maxArea, currArea);
            if(height[low]<height[high]){
                low++;
            }else{
                high--;
            }
        }
        return maxArea;
    }
}
