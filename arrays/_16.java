import java.util.Arrays;

public class _16{
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int min_diff = Integer.MAX_VALUE;
        int resSum = 0;
        for(int i=0;i<nums.length-2;i++){
            int left = i+1,
                right = nums.length-1;
            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];
                int diff = Math.abs(sum-target);
                if(min_diff>diff){
                    min_diff = diff;
                    resSum = sum;
                }
                if(sum==target){
                    left++;
                    right--;
                }else if(sum<target){
                    left++;
                }else{
                    right--;
                }
            }    
        }
        return resSum;
    }
}