package Book.Search;

public class Kthlargest {
    public int findKthLargest(int[] arr, int k) {
        if(k > arr.length) {
            return -1;
        }
        k = arr.length - k + 1;
        return getlargest(arr, k, 0, arr.length-1);

    }
    int getlargest(int[] arr, int k, int init_start, int init_end) {
        if(init_start > init_end) {
            return -1;
        }
        if(init_start == init_end) {
            return arr[init_start];
        }
        int equal = arr[init_start];
        boolean allequal = true;
        for(int i = init_start+1;i<=init_end;i++) {
            if(equal != arr[i]) {
                allequal = false;
                break;
            }
        }
        if(allequal) {
            return arr[init_start];
        }

        int random = init_start + (int)(Math.random()*(init_end-init_start+1));
        int val = arr[random];
        int start = init_start;
        int end = init_end;
        while(start < end) {
            while(start < end && arr[start] < val) {
                start++;
            }

            if(start < end) {
                while(end >= 0 && arr[end] >= val) {
                    end--;
                }
                if(start < end) {
                    int temp = arr[end];
                    arr[end] = arr[start];
                    arr[start] = temp;
                }
            }

        }
        if(start-init_start == k-1) {
            return val;
        }

//        System.out.println("start is " + start);
//        System.out.println("end is " + end);
//        System.out.println("init_start is " + init_start);
//        System.out.println("init_end is " + init_end);
//        System.out.println("val is " + val);

        if((start-init_start) < k) {
            return getlargest(arr, k - (start-init_start), start, init_end);
        } else {
            return getlargest(arr, k, init_start, start-1);
        }
    }
}
