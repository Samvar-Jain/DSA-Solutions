public class _27 {
    // public int removeElement(int[] nums, int val) {
    //     int i = 0;
    //     int j = nums.length - 1;

    //     while (i <= j) {
    //         if (nums[i] == val) {
    //             nums[i] = nums[j];
    //             j--;
    //         } else {
    //             i++;
    //         }
    //     }

    //     return j + 1;
    // }

    //another solution
    public int removeElement(int[] nums, int val) {
        int i=0,
            j=0;
        for(;j<nums.length-1;){
            if(nums[j]!=val){
                nums[i] = nums[j];
                i++;
                j++;
            }
            if(nums[i] == val){
                j++;
            }
        }
        return i+1;
    }
}
