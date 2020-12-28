package tree;

import common.classes.TreeNode;

/**
 * 剑指 Offer 55 - II. 平衡二叉树
 * 输入一棵二叉树的根节点，判断该树是不是平衡二叉树。如果某二叉树中任意节点的左右子树的深度相差不超过1，那么它就是一棵平衡二叉树。
 *
 *
 *
 * 示例 1:
 *
 * 给定二叉树 [3,9,20,null,null,15,7]
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回 true 。
 *
 * 示例 2:
 *
 * 给定二叉树 [1,2,2,3,3,null,null,4,4]
 *
 *        1
 *       / \
 *      2   2
 *     / \
 *    3   3
 *   / \
 *  4   4
 * 返回 false 。
 *
 * @author songyongshuo
 * @date 2020-08-24 19:03
 */
public class Offer_55_IsBalanced {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }

        if (!isBalanced(root.left)) {
            return false;
        }

        if (!isBalanced(root.right)) {
            return false;
        }

        if (Math.abs(depth(root.left) - depth(root.right)) <= 1) {
            return true;
        } else {
            return false;
        }
    }

    private int depth(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int l = depth(node.left);
        int r = depth(node.right);
        return Math.max(l, r) + 1;
    }

    public static void main(String[] args) {
//        Integer[] tree = {1,2,2,3,3,null,null,4,4};
        Integer[] tree = {3,9,20,null,null,15,7};
        boolean balanced = new Offer_55_IsBalanced().isBalanced(TreeNode.makeTree(tree));
        System.out.println(balanced);
    }
}
