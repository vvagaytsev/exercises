package cci;

/**
 * @author Vladimir Vagaytsev
 * Date: 19/11/2018
 */
public class Exercise24 {

    public static void main(String[] args) {
        /*
        Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
        Output: 7 -> 0 -> 8
        */

        /*ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));*/
        /*ListNode l1 = new ListNode(5);
        ListNode l2 = new ListNode(5);*/
        ListNode l1 = new ListNode(9, new ListNode(9, new ListNode(9)));
        ListNode l2 = new ListNode(9, new ListNode(9, new ListNode(9)));
        ListNode listNode = addTwoNumbers(l1, l2);
        System.out.println();
        ListNode.print(listNode);
    }

    private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int overflow = 0;
        int val1, val2;
        int sum;
        ListNode res = null;
        ListNode cur = res;
        while (l1 != null || l2 != null || overflow > 0) {
            val1 = l1 != null ? l1.val : 0;
            val2 = l2 != null ? l2.val : 0;
            sum = overflow + val1 + val2;
            if (sum < 10) {
                overflow = 0;
            } else {
                overflow = 1;
                sum %= 10;
            }
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
            if (res == null) {
                res = new ListNode(sum);
                cur = res;
            } else {
                ListNode next = new ListNode(sum);
                cur.next = next;
                cur = next;
            }
            System.out.print(sum);
        }
        return res;
    }
}
