public class _125 {
    public boolean isCharAlphanumeric(char c){
        return c>='a'&&c<='z'||c>='A'&&c<='Z'||c>='0'&&c<='9';
    }
    public boolean isPalindrome(String s) {
        int i = 0, j=s.length()-1;
        while(i<j){
            char c1 = s.charAt(i);
            char c2 = s.charAt(j);
            if(!isCharAlphanumeric(c1)){
                i++;
                continue;
            }
            if(!isCharAlphanumeric(c2)){
                j--;
                continue;
            }
            if(Character.toLowerCase(c1) != Character.toLowerCase(c2)){
                return false;
            }

            i++;
            j--;
        }
        return true;
    }
}
