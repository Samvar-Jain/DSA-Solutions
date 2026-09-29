public class _283 {
    // public void moveZeroes(int[] nums) {
    //     int i = 0, j = 0;
    //     while(i<nums.length){
    //         if(nums[i] == 0){
    //             i++;
    //         }else{
    //             nums[j] = nums[i];
    //             j++;
    //             i++;
    //         }
    //     }
    //     while(j<nums.length){
    //         nums[j] = 0;
    //         j++;
    //     }
    // }

    public void moveZeroes(int[] nums) {
        int i = 0, j = 0;
        while(i<nums.length){
            if(nums[i] == 0){
                i++;
            }else{
                nums[j] = nums[i];
                nums[i] = 0;
                j++;
                i++;
            }
        }
    }
}
