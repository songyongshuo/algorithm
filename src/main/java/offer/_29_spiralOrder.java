package offer;

/**
 * 剑指 Offer 29. 顺时针打印矩阵
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * 输出：[1,2,3,6,9,8,7,4,5]
 * 示例 2：
 * <p>
 * 输入：matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
 * 输出：[1,2,3,4,8,12,11,10,9,5,6,7]
 * <p>
 * <p>
 * 限制：
 * <p>
 * 0 <= matrix.length <= 100
 * 0 <= matrix[i].length <= 100
 *
 * @author songyongshuo
 * @date 2021-02-02 14:37
 */
public class _29_spiralOrder {
    public int[] spiralOrder(int[][] matrix) {
        if (matrix.length == 0) {
            return new int[0];
        }

        int l = 0, t = 0, r = matrix[0].length - 1, b = matrix.length - 1, x = 0;
        int[] res = new int[(r + 1) * (b + 1)];

        while (true) {
            for (int i = l; i <= r; i++) res[x++] = matrix[t][i];
            if (++t > b) break;

            for (int i = t; i <= b; i++) res[x++] = matrix[i][r];
            if (l > --r) break;

            for (int i = r; i >= l; i--) res[x++] = matrix[b][i];
            if (t > --b) break;

            for (int i = b; i >= t; i--) res[x++] = matrix[l][i];
            if (++l > r) break;
        }

        return res;
    }

    public static void main(String[] args) {
        int[][] ints = new int[3][3];

        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        int[] c = {7, 8, 9};

        ints[0] = a;
        ints[1] = b;
        ints[2] = c;

        int[] ints1 = new _29_spiralOrder().spiralOrder(ints);
        for (int i = 0; i < ints1.length; i++) {
            System.out.println(ints1[i]);
        }
    }
}
