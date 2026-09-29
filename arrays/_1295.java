public class _1295 {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(evenDigit(nums[i])) count++;
        }
        return count;
    }
    public boolean evenDigit(int num){
        int count = 0;
        while(num!=0){
            num = num/10;
            count++;
        }
        return count%2==0 ? true:false;
    }
}
