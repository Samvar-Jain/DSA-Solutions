import java.util.Arrays;

public class _977 {

    //Brute Force, T - O(N.logN), S - O(N)
    // public int[] sortedSquares(int[] nums) {
    //     for(int i=0; i<nums.length;i++){
    //         nums[i] = nums[i]*nums[i];
    //     }
    //     Arrays.sort(nums);
    //     return nums;
    // }

    public int[] sortedSquares(int[] nums) {
        int l=0, r=nums.length-1;
        int[] res = new int[nums.length];
        for(int i=nums.length-1;i>=0;i--){
            int sqr1 = nums[l]*nums[l];
            int sqr2 = nums[r]*nums[r];
            if(sqr1>sqr2){
                res[i] = sqr1;
                l++;
            }else{
                res[i] = sqr2;
                r--;
            }
        }
        return res;
    }
}
