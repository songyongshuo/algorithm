package tencent;

import common.classes.ListNode;

/**
 * @author songyongshuo
 * @date 2021-03-08 19:01
 */
public class mergeTwoLists {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6};
        int search = search(arr, 0, arr.length - 1, 3);
        System.out.println(search);
    }

    public static int search(int[] arr, int l, int r, int k) {
        if (l > r) return -1;
        int mid = (l + r) / 2;
        if (arr[mid] > k) {
            return search(arr, l, mid, k);
        } else if (arr[mid] < k){
            return search(arr, mid + 1, r, k);
        } else {
            return mid;
        }
    }
}
