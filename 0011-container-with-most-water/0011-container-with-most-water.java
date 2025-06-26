class Solution {
    public int maxArea(int[] height) {
        int area = 0;
        int left = 0;
        int right = height.length - 1;
        while(left < right){
            int currentarea = Math.min(height[left], height[right])*(right - left);
            area = Math.max(area, currentarea);
            if(height[left] < height[right]){
                left++;
            }
            else {
                right--;
            }
        }
        return area;
    }
}