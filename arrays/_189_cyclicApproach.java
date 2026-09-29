public class _189_cyclicApproach {

    public void rotate(int[] nums, int k){
        int n = nums.length;
        int count = 0;
        int start = 0;

        while (count < n) {
            int idx = start;
            int curr = nums[idx];

            do {
                int nextIdx = (idx + k) % n;

                int next = nums[nextIdx];
                nums[nextIdx] = curr;
                curr = next;

                idx = nextIdx;
                count++;

            } while (idx != start);
            
            start++;
        }
        System.out.println(nums);
    }
}
