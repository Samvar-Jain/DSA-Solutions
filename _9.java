public class _9 {
    public boolean isPalindrome(int x) {
        int revNum=0;
        int temp = x;
        if(x<0) return false;
        while(temp!=0){
            int digit = temp%10;
            revNum = revNum*10+digit;
            temp=temp/10;
        }
        return revNum == x;
    }
}
