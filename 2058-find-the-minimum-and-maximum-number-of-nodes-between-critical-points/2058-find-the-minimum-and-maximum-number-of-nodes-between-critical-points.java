class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {

        int[] ans = {-1, -1};

        if (head == null || head.next == null || head.next.next == null)
            return ans;

        ListNode temp = head;

        ListNode a = temp;
        ListNode b = temp.next;
        ListNode c = b.next;

        int idx = 1;
        int firIdx = -1;
        int lstIdx = -1;
        int minDis = Integer.MAX_VALUE;

        while (c != null) {

            if ((a.val < b.val && c.val < b.val) ||
                (a.val > b.val && c.val > b.val)) {

                if (firIdx == -1) {
                    firIdx = idx;
                }

                if (lstIdx != -1) {
                    int dis = idx - lstIdx;
                    minDis = Math.min(minDis, dis);
                }

                lstIdx = idx;
            }

            a = a.next;
            b = b.next;
            c = c.next;
            idx++;
        }

        if (firIdx != lstIdx && firIdx != -1) {
            ans[0] = minDis;
            ans[1] = lstIdx - firIdx;
        }

        return ans;
    }
}