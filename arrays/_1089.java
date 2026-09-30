public class _1089 {
    public void duplicateZeros(int[] arr) {
        int count = 0;
        int lastIdx = arr.length-1;
        for(int i=0;i<=lastIdx-count;i++){
            if(arr[i]==0){
                if(i==lastIdx-count){
                    arr[lastIdx] = 0;
                    lastIdx--;
                    break;
                }
                count++;
            }
        }
        int newLastIdx = lastIdx-count;
        for(int i=newLastIdx;i>=0;i--){
            if(arr[i]==0){
                arr[i+count] = 0;
                --count;
                arr[i+count] = 0;
            }else{
                arr[i+count] = arr[i];
            }
        }
    }
}
