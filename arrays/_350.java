import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _350 {

    //frequency solution
    // public int[] intersect(int[] nums1, int[] nums2) {
    //     Map<Integer, Integer> map = new HashMap<>();
    //     for(int num:nums1){
    //         map.put(num, map.getOrDefault(num,0)+1);
    //     }
    //     int[] arr = new int[nums1.length];
    //     int k = 0;
    //     for(int num : nums2){
    //         int count = map.getOrDefault(num,0);
    //         if(count == 0){
    //             continue;
    //         }else{
    //             arr[k] = num;
    //             map.put(num, count-1);
    //             k++;
    //         }
    //     }
    //     return Arrays.copyOfRange(arr,0,k);
    // }

    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length>nums2.length){
            return intersect(nums2,nums1);
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] res = new int[nums1.length];
        int i=0, j=0, k=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                res[k] = nums1[i];
                i++;
                j++;
                k++;
            }else if(nums1[i]>nums2[j]){
                j++;
            }else{
                i++;
            }
        }
        return Arrays.copyOfRange(res, 0, k);
    }
}
