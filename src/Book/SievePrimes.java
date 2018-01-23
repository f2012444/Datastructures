package Book;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;


public class SievePrimes {
        public List<Integer> getPrimes(int n) {
            List<Integer> arr = new ArrayList<Integer>();
            if(n<2) {
                return arr;
            }

            arr.add(2);
            if(n == 2) {

                return arr;
            }

            List<Boolean> isPrime = new ArrayList<Boolean>(Collections.nCopies(n+1, true));
            for(int i = 3;i<=n;i+=2) {
                if(isPrime.get(i) && primeTest(i)) {
                    arr.add(i);
                    for(int j = 2*i;j<=n;j+=i) {
                        isPrime.set(j, false);
                    }
                }
            }
            return arr;

        }
        boolean primeTest(int n) {
            int val = (int) Math.sqrt(n);
            for(int i = 3;i<=val;i++) {
                if(n%i == 0) {
                    return false;
                }
            }
            return true;
        }


}
