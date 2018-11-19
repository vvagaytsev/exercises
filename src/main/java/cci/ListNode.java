package cci;

/**
 * @author Vladimir Vagaytsev
 * Date: 19/11/2018
 */
public class ListNode {

    int val;
    ListNode next;

    public static void print(ListNode l) {
        while (l != null) {
            System.out.print(l.val + " -> ");
            l = l.next;
        }
    }

    public ListNode(int x) {
        this(x, null);
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return "[" + val + ']';
    }
}
