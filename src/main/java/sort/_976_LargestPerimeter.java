package sort;

import java.util.Arrays;

/**
 * 976. 三角形的最大周长
 *
 * 给定由一些正数（代表长度）组成的数组 A，返回由其中三个长度组成的、面积不为零的三角形的最大周长。
 *
 * 如果不能形成任何面积不为零的三角形，返回 0。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：[2,1,2]
 * 输出：5
 * 示例 2：
 *
 * 输入：[1,2,1]
 * 输出：0
 * 示例 3：
 *
 * 输入：[3,2,3,4]
 * 输出：10
 * 示例 4：
 *
 * 输入：[3,6,2,3]
 * 输出：8
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/largest-perimeter-triangle
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author songyongshuo
 * @date 2020-12-29 11:17
 */
public class _976_LargestPerimeter {
    public int largestPerimeter(int[] a) {
        Arrays.sort(a);
        for (int i = a.length - 1; i > 1; i--) {
            if (a[i] < a[i-1] + a[i-2]) {
                return a[i] + a[i-1] + a[i-2];
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int i = new _976_LargestPerimeter().largestPerimeter(new int[]{1, 2, 1});
        System.out.println(i);
    }
}
