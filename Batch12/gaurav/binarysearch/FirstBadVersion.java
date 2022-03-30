/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 0;
        int end = n;

        if(n == 1 && this.isBadVersion(1) ) return 1;

        while(start < end ) {
            int mid = start + (end  - start ) / 2;

            boolean isBadVersion = this.isBadVersion(mid);

            if(isBadVersion) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }
}
