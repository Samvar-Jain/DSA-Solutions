import java.util.HashMap;

class _136{
    public int singleNumber(int[] nums) {
        //Freq map approach
        // Map<Integer, Integer> map = new HashMap<>();
        // for(int num: nums){
        //     if(!map.containsKey(num)){
        //         map.put(num,0);
        //     }
        //     map.put(num, map.get(num)+1);
        // }

        // for(int num:nums){
        //     if(map.get(num)==1){
        //         return num;
        //     }
        // }
        // return -1;

        //XOR method
        int res = 0;
        for(int num:nums){
            res = res^num;
        }
        return res;
    }
}