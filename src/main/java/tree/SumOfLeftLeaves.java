package tree;

import common.classes.TreeNode;

/**
 * 【404. 左叶子之和】
 * 计算给定二叉树的所有左叶子之和。
 *
 * 示例：
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 *
 * 在这个二叉树中，有两个左叶子，分别是 9 和 15，所以返回 24
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/sum-of-left-leaves
 *
 * @author songyongshuo
 * @date 2020-08-17 17:22
 */
public class SumOfLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        return sumLeft(root, false);
    }

    private int sumLeft(TreeNode node, boolean isLeft) {
        if (node == null) {
            return 0;
        }

        if (node.left == null && node.right == null) {
            return isLeft ? node.val : 0;
        }
        return sumLeft(node.left, true) + sumLeft(node.right, false);
    }

    public static void main(String[] args) {
        SumOfLeftLeaves sumOfLeftLeaves = new SumOfLeftLeaves();
//        Integer[] trees = {6,2,8,0,4,7,9,null,null,3,5};
        Integer[] trees = {3, 9, 20, null, null, 15, 7};
        int i = sumOfLeftLeaves.sumOfLeftLeaves(TreeNode.makeTree(trees));
        System.out.println(i);
    }
}
