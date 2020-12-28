package tree;

import common.classes.TreeNode;

/**
 * 538. 把二叉搜索树转换为累加树
 * 给定一个二叉搜索树（Binary Search Tree），把它转换成为累加树（Greater Tree)，使得每个节点的值是原来的节点值加上所有大于它的节点值之和。
 *
 *
 *
 * 例如：
 *
 * 输入: 原始二叉搜索树:
 *               5
 *             /   \
 *            2     13
 *
 * 输出: 转换为累加树:
 *              18
 *             /   \
 *           20     13
 *
 * @author songyongshuo
 * @date 2020-08-23 22:11
 */
public class _538_ConvertBST {
    int i = 0;

    public TreeNode convertBST(TreeNode root) {
        if (root != null) {
            convertBST(root.right);
            i += root.val;
            root.val = i;
            convertBST(root.left);
        }

        return root;
    }

    public static void main(String[] args) {
        Integer[] tree = {5, 2, 13};
        TreeNode treeNode = new _538_ConvertBST().convertBST(TreeNode.makeTree(tree));
        System.out.println(treeNode);
    }
}
