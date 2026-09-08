class Solution {
public:
    double MyPow(double x, long n){
        if(x==1) return 1; 
        if(n==0) return 1;
        if(n==1) return x;
        if(n>0){
            if(n%2==0){
                double pow = MyPow(x,n/2);
                return pow * pow;
            }else{
                double pow = MyPow(x,(n-1)/2);
                return x*pow*pow;

            }
        }else{
            if((-n)%2==0){
                double pow = 1/MyPow(x,(-n)/2);
                return pow * pow;
            }else{
                double pow = 1/MyPow(x,(-n-1)/2);
                return pow*pow/x;

            }
        }
    }
    double myPow(double x, int n) {
        return MyPow(x,(long)n);
    }
};