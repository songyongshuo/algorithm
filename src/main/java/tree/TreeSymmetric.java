package tree;

import common.classes.TreeNode;

/**
 * 【101. 对称二叉树】
 * 给定一个二叉树，检查它是否是镜像对称的。
 * https://leetcode-cn.com/problems/symmetric-tree/
 *
 * @author songyongshuo
 * @date 2020-08-16 11:16
 */
public class TreeSymmetric {
    public boolean isSymmetric(TreeNode treeNode) {
        if (treeNode == null) {
            return true;
        }
        return check(treeNode.left, treeNode.right);
    }

    public boolean check(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }

        if (left == null || right == null) {
            return false;
        }

        if (left.val != right.val) {
            return false;
        }

        return check(left.left, right.right) && check(left.right, right.left);
    }

    public static void main(String[] args) {
        TreeSymmetric treeSymmetric = new TreeSymmetric();

//        Integer[] trees = {1, 2, 2, 3, 4, 4, 3};
        Integer[] trees = {1, 2, 2, null, 3, null, 3};
        TreeNode treeNode = TreeNode.makeTree(trees);

        boolean symmetric = treeSymmetric.isSymmetric(treeNode);
        System.out.println("result is : " + symmetric);
    }
}
