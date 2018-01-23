package Linkedin;

public class Power {
    public double myPow(double x, int n) {
        if(n == 0) {
            return x;
        }
        long y = n;
        double val = getVal(x, Math.abs(y));
        if( n < 0) {
            return 1.0/val;
        } else {
            return val;
        }




    }

    double getVal(double x, long n) {
        if(n == 0) {
            return 1;
        }
        if(n == 1) {
            return x;
        }
        double val = getVal(x, n/2);
        if(n%2 == 1) {
            return val*val*x;
        } else {
            return val*val;
        }
    }
}
