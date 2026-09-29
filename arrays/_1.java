import java.util.HashMap;
import java.util.Map;

public class _1 {
    //BruteForce technique

    // public int[] twoSum(int[] nums, int target) {
    //   int[] res = new int[2];
    //   for(int i = 0; i < nums.length ; i++){
    //     for(int j = i+1; j < nums.length ; j++){
    //         if(target-nums[i]==nums[j]){
    //             res[0] = i;
    //             res[1] = j;
    //             return res;
    //         }
    //     }
    //   }
    //   return res;
    // }

    // --------------------------------------------------------------------------------------
    
    //Using Maps

    // public int[] twoSum(int[] nums, int target) {
    //   int[] res = new int[2];
    //   Map<Integer,Integer> map= new HashMap<>();
    //   for(int i=0; i< nums.length; i++){
    //     map.put(nums[i],i);
    //   }
    //   for(int i=0; i< nums.length; i++){
    //     int lookUpNumber = target - nums[i];
    //     if(map.containsKey(lookUpNumber)&& map.get(lookUpNumber)!=i){
    //             res[0] = i;
    //             res[1] = map.get(lookUpNumber);
    //             return res;
    //     }
    //   }
    //   return res;
    // }

    //More Optimised

    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
      for(int i = 0; i<nums.length;i++){
        int lookUpNumber = target - nums[i];
        if(map.containsKey(lookUpNumber)){
            return new int[] {i,map.get(lookUpNumber)};
        }
        map.put(nums[i],i);
      }
      return new int[] {-1,-1};
    }
}
