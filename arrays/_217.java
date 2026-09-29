import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _217 {
    //Using Sorting function
    // public boolean containsDuplicate(int[] nums) {
    //     Arrays.sort(nums);
    //     for(int i=0;i<nums.length;i++){
    //         if(nums[i]==nums[i+1]){
    //             return true;
    //         }
    //     }
    //     return false;
    // }


    //Using Set
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num:nums){
            if(set.contains(num)) return true;
            set.add(num);
        }
        return false;
    }
}
