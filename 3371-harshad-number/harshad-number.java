class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum = 0;
        int y = x;
        while(x>0){
            sum = sum + x%10;
            x = x/10;
        }
        return (y%sum==0)? 
        sum:-1;
    }
}