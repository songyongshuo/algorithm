package tencent;

import common.classes.ListNode;

import java.util.HashSet;

/**
 * 输入: 1->2->3->4->5->NULL, k = 2
 * 输出: 4->5->1->2->3->NULL
 * 解释:
 * 向右旋转 1 步: 5->1->2->3->4->NULL
 * 向右旋转 2 步: 4->5->1->2->3->NULL
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/tencent/x5pmxc/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 *
 * @author songyongshuo
 * @date 2021-03-08 19:35
 */
public class rotateRight {
    public static void main(String[] args) {
        int[] arr = {7,6,5,8,9,3,2,1};
        quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        HashSet<Object> set = new HashSet<>();
    }

    public static void quickSort(int[] arr, int l, int r) {
        if (l > r) {
            return;
        }

        int base = getBase(arr, l, r);
        quickSort(arr, l, base - 1);
        quickSort(arr, base + 1, r);
    }

    public static int getBase(int[] arr, int l, int r) {
        int base = arr[r];
        while (l < r) {
            while (l < r && arr[l] < base) {
                l++;
            }

            if (l < r) {
                int tmp = arr[r];
                arr[r] = arr[l];
                arr[l] = tmp;
            }

            while (l < r && arr[r] > base) {
                r--;
            }

            if (l < r) {
                int tmp = arr[r];
                arr[r] = arr[l];
                arr[l] = tmp;
            }
        }

        return r;
    }
}
