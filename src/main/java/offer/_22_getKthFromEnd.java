package offer;

import common.classes.ListNode;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 剑指 Offer 22. 链表中倒数第k个节点
 * 输入一个链表，输出该链表中倒数第k个节点。为了符合大多数人的习惯，本题从1开始计数，即链表的尾节点是倒数第1个节点。
 *
 * 例如，一个链表有 6 个节点，从头节点开始，它们的值依次是 1、2、3、4、5、6。这个链表的倒数第 3 个节点是值为 4 的节点。
 *
 *
 *
 * 示例：
 *
 * 给定一个链表: 1->2->3->4->5, 和 k = 2.
 *
 * 返回链表 4->5.
 *
 * @author songyongshuo
 * @date 2021-03-08 15:03
 */
public class _22_getKthFromEnd {
    public static void main(String[] args) {

        Integer[] arr = {3,6,9,8,4,5,7};
        int[] ints = Arrays.stream(arr).mapToInt(Integer::intValue).toArray();

        Integer[] integers = Arrays.stream(ints).boxed().toArray(Integer[]::new);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }



//        ListNode l1 = new ListNode(1);
//        ListNode l2 = new ListNode(2);
//        ListNode l3 = new ListNode(3);
//        ListNode l4 = new ListNode(4);
//        ListNode l5 = new ListNode(5);
//        l4.next = l5;
//        l3.next = l4;
//        l2.next = l3;
//        l1.next = l2;
//
//        ListNode kthFromEnd = new _22_getKthFromEnd().getKthFromEnd(l1, 2);
//        while (kthFromEnd != null) {
//            System.out.println(kthFromEnd.val);
//            kthFromEnd = kthFromEnd.next;
//        }
    }

    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode node1 = head;
        ListNode node2 = head;

        for (int i = 0; i < k; i++) {
            node1 = node1.next;
        }

        while (node1 != null) {
            node1 = node1.next;
            node2 = node2.next;
        }

        return node2;
    }
}
