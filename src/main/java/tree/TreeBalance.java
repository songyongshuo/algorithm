package tree;

import common.classes.TreeNode;

/**
 * 【检查平衡性】
 * 实现一个函数，检查二叉树是否平衡。在这个问题中，平衡树的定义如下：任意一个节点，其两棵子树的高度差不超过 1。
 * https://leetcode-cn.com/problems/check-balance-lcci/
 *
 * @author songyongshuo
 * @date 2020-08-16 10:06
 */
public class TreeBalance {
    public static boolean isBalanced(TreeNode treeNode) {
        if (treeNode == null) {
            return true;
        }

        if (Math.abs(getDepth(treeNode.left) - getDepth(treeNode.right)) > 1) {
            return false;
        }

        return isBalanced(treeNode.left) && isBalanced(treeNode.right);
    }

    public static int getDepth(TreeNode treeNode) {
        if (treeNode == null) {
            return 0;
        }

        return Math.max(getDepth(treeNode.left), getDepth(treeNode.right)) + 1;
    }


    public static void main(String[] args) {
        Integer[] trees = {3, 9, 20, null, null, 15, 7};
//        Integer[] trees = {1, 2, 2, 3, 3, null, null, 4, 4};
        TreeNode treeNode = TreeNode.makeTree(trees);
        boolean balanced = isBalanced(treeNode);
        System.out.println("result is :" + balanced);
    }
}
