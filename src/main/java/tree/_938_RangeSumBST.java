package tree;

import common.classes.TreeNode;

/**
 * 938. 二叉搜索树的范围和
 * 给定二叉搜索树的根结点 root，返回 L 和 R（含）之间的所有结点的值的和。
 * <p>
 * 二叉搜索树保证具有唯一的值。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：root = [10,5,15,3,7,null,18], L = 7, R = 15
 * 输出：32
 * 示例 2：
 * <p>
 * 输入：root = [10,5,15,3,7,13,18,1,null,6], L = 6, R = 10
 * 输出：23
 *
 * @author songyongshuo
 * @date 2020-08-23 21:35
 */
public class _938_RangeSumBST {
    private Integer sum = 0;
    private int l;
    private int r;

    public int rangeSumBST(TreeNode root, int L, int R) {
        l = L;
        r = R;
        dfs(root);
        return sum;
    }

    private void dfs(TreeNode node) {
        if (node == null) {
            return;
        }
        dfs(node.left);
        if (node.val >= l && node.val <= r) {
            sum += node.val;
        }
        dfs(node.right);
    }

    public static void main(String[] args) {
        Integer[] tree = {10, 5, 15, 3, 7, null, 18};

        int i = new _938_RangeSumBST().rangeSumBST(TreeNode.makeTree(tree), 7, 15);
        System.out.println(i);
    }
}
