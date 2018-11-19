package cci;

/**
 * @author Vladimir Vagaytsev
 * Date: 19/11/2018
 */
public class Exercise23 {

    public static void main(String[] args) {
        /*
        Input: (2 -> 4 -> 3 -> 5 -> 7)
        Output: (2 -> 4 -> 5 -> 7)
        */

        ListNode mid = new ListNode(3, new ListNode(5, new ListNode(7)));
        ListNode l1 = new ListNode(2, new ListNode(4, mid));

        ListNode.print(l1);
        deleteMiddle(mid);
        System.out.println();
        ListNode.print(l1);
    }

    private static void deleteMiddle(ListNode mid) {
        if (mid == null || mid.next == null) {
            return;
        }
        ListNode next = mid.next;
        mid.val = next.val;
        mid.next = next.next;
    }
}
