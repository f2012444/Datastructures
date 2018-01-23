package Book.Sorted;

public class Interval implements Comparable<Interval> {

    int start;
    int end;
    Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Interval other) {
        if(this.start < other.start) {
            return -1;
        } else if(this.start == other.start) {
            if(this.end < other.end) {
                return -1;
            } else if(this.end == other.end) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 1;
        }
    }
}
