
class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n = nums1.length;
        int[] a = new int[n];
        long k = (long) k1 + k2;
        int max = 0;
        long sum = 0;

        for (int i = 0; i < n; i++) {
            a[i] = Math.abs(nums1[i] - nums2[i]);
            max = Math.max(max, a[i]);
            sum += a[i];
        }

        if (sum <= k) return 0;

        int low = 0, high = max;

        while (low < high) {
            int mid = low + (high - low) / 2;
            long need = 0;

            for (int x : a) {
                if (x > mid) {
                    need += x - mid;
                }
            }

            if (need <= k) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        long ans = 0;
        long used = 0;

        for (int x : a) {
            int reduced = Math.min(x, low);
            used += x - reduced;
            ans += (long) reduced * reduced;
        }

        long remaining = k - used;

        for (int i = 0; i < n && remaining > 0; i++) {
            if (a[i] >= low && low > 0) {
                ans -= (long) low * low;
                ans += (long) (low - 1) * (low - 1);
                remaining--;
            }
        }

        return ans;
    }
}
