package tencent;

import common.classes.ListNode;

/**
 * @author songyongshuo
 * @date 2021-03-08 18:14
 */
public class sortList {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(4);
        ListNode l3 = new ListNode(3);
        l1.next = l2;
        l2.next = l3;

        ListNode l4 = new ListNode(5);
        ListNode l5 = new ListNode(6);
        ListNode l6 = new ListNode(4);
        ListNode l7 = new ListNode(4);
        l4.next = l5;
        l5.next = l6;
        l6.next = l7;

        ListNode pre = new ListNode(0);
        ListNode listNode = pre;
        int k = 0;
        while (l1 != null || l4 != null || k > 0) {
            int a = l1 == null ? 0 : l1.val;
            int b = l4 == null ? 0 : l4.val;

            int sum = a + b + k;
            k = sum / 10;

            listNode.next = new ListNode(sum % 10);

            if (l1 != null) l1 = l1.next;
            if (l4 != null) l4 = l4.next;
            listNode = listNode.next;
        }

        System.out.println(pre.next.toString());
    }
}
