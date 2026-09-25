class Solution {
    public int reverse(int x) {
        int rev = 0;
        int temp = Math.abs(x);
        while(temp>0){
            if(rev>(Integer.MAX_VALUE-temp%10)/10) return 0;
            rev = rev*10 + temp%10;
            temp = temp/10;
        }

        return (x>=0)? rev : -rev;
    }
}