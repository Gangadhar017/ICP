class Solution {
    public void reorderList(ListNode h) {
        if (h == null) {
            System.out.println("List is empty");
            return;
        }

        ListNode m = mid(h);
        ListNode a = h;
        ListNode b = rev(m);

        while (a != null && b != null) {
            ListNode t = a.next;
            a.next = b;
            a = t;

            t = b.next;
            b.next = a;
            b = t;
        }

        if (a != null) a.next = null;
    }

    public ListNode mid(ListNode h) {
        if (h == null || h.next == null) return h;
        ListNode s = h, f = h;
        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }
        return s;
    }

    public ListNode rev(ListNode h) {
        if (h == null || h.next == null) return h;
        ListNode p = null, c = h;
        while (c != null) {
            ListNode n = c.next;
            c.next = p;
            p = c;
            c = n;
        }
        return p;
    }
}

