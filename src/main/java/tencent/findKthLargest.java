package tencent;

import java.util.PriorityQueue;

/**
 * @author songyongshuo
 * @date 2021-03-08 17:09
 */
public class findKthLargest {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9};
        int kthLargest = new findKthLargest().findKthLargest(arr, 4);
        System.out.println(kthLargest);
    }

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            queue.offer(nums[i]);
        }

        for (int i = k; i < nums.length; i++) {
            if (nums[i] > queue.peek()) {
                queue.poll();
                queue.offer(nums[i]);
            }
        }

        return queue.peek();
    }
}
