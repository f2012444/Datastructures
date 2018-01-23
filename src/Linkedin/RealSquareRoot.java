package Linkedin;

public class RealSquareRoot {
    double getSquareRoot(double val) {
        int sqrt = getSqrt((int)val, 0, (int)val);
        double realsqrt = getRealsqrt((double) val, (double)(sqrt), (double)(sqrt+1),12, 0);
        return realsqrt;

    }
    double getRealsqrt(double key, double start, double end, int iter, int cur) {
        if(cur > iter) {
            return start;
        }
        double mid = start+(end-start)/2;
        double sqr = mid*mid;
        if(sqr == key) {
            return mid;
        } else if(sqr > key) {
            return getRealsqrt(key, start, mid, iter, cur+1);
        } else {
            return getRealsqrt(key, mid, end, iter, cur+1);
        }
    }

    int getSqrt(int key, int start, int end) {
        if(start > end) {
            return start - 1;
        }
        int mid = start + (end-start)/2;
        int square = mid*mid;
        if(square == key) {
            return mid;
        } else if(square < key) {
            return getSqrt(key, mid+1, end);
        } else {
            return getSqrt(key, start, mid-1);
        }
    }
}
