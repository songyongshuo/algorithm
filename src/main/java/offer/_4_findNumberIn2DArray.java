package offer;

/**
 * 剑指 Offer 04. 二维数组中的查找
 * 在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个高效的函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 *
 *
 *
 * 示例:
 *
 * 现有矩阵 matrix 如下：
 *
 * [
 *   [1,   4,  7, 11, 15],
 *   [2,   5,  8, 12, 19],
 *   [3,   6,  9, 16, 22],
 *   [10, 13, 14, 17, 24],
 *   [18, 21, 23, 26, 30]
 * ]
 * 给定 target = 5，返回 true。
 *
 * 给定 target = 20，返回 false。
 *
 *
 *
 * 限制：
 *
 * 0 <= n <= 1000
 *
 * 0 <= m <= 1000
 *
 *
 * @author songyongshuo
 * @date 2021-03-01 19:56
 */
public class _4_findNumberIn2DArray {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int i = matrix.length - 1;
        int j = 0;
        while (i >= 0 && j < matrix[0].length) {
            if (matrix[i][j] < target) {
                j++;
            } else if (matrix[i][j] > target) {
                i--;
            } else {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] a = {1, 4, 7, 11, 15};
        int[] b = {2, 5, 8, 12, 19};
        int[] c = {3, 6, 9, 16, 22};
        int[] d = {10, 13, 14, 17, 24};
        int[] e = {18, 21, 23, 26, 30};

        int[][] matrix = {a, b, c ,d ,e};
        boolean numberIn2DArray = new _4_findNumberIn2DArray().findNumberIn2DArray(matrix, 33);
        System.out.println(numberIn2DArray);


        String s = "aa a bb b".replace(" ", "%20");
        System.out.println(s);
    }
}
