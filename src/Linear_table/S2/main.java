package Linear_table.S2;

import Linear_table.Utils.ListNode;


public class main {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * }
     */
    static class Solution {
        public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode result = new ListNode(-1);
            ListNode tmp = result;
            int a, b = 0;
            while (l1 != null || l2 != null) {
                if (tmp.val == -1)
                    tmp.val = 0;
                else
                    tmp = tmp.next;
                if (l1 != null) {
                    a = l1.val;
                    l1 = l1.next;
                } else
                    a = 0;
                if (l2 != null) {
                    b = l2.val;
                    l2 = l2.next;
                } else
                    b = 0;
                tmp.val = tmp.val + a + b;
                if (tmp.val >= 10) {
                    tmp.val -= 10;
                    tmp.next = new ListNode(1);
                } else
                    tmp.next = new ListNode(0);

            }
            tmp.next = null;
            return result;
        }


    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(8);
        ListNode l2 = new ListNode(0);

        Solution.addTwoNumbers(l1, l2);
    }
}
