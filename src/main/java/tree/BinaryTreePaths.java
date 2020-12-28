package tree;

import common.classes.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 257. 二叉树的所有路径
 * 给定一个二叉树，返回所有从根节点到叶子节点的路径。
 *
 * 说明: 叶子节点是指没有子节点的节点。
 *
 * 示例:
 *
 * 输入:
 *
 *    1
 *  /   \
 * 2     3
 *  \
 *   5
 *
 * 输出: ["1->2->5", "1->3"]
 *
 * 解释: 所有根节点到叶子节点的路径为: 1->2->5, 1->3
 *
 * @author songyongshuo
 * @date 2020-08-18 13:18
 */
public class BinaryTreePaths {
    private List<String> list = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) {
            return Collections.EMPTY_LIST;
        }

        recursion(root, "");
        return list;
    }

    private void recursion(TreeNode node, String prefix) {
        if (node == null) {
            return;
        }

        if (node.left == null && node.right == null) {
            list.add(prefix + node.val);
            return;
        }

        recursion(node.left, prefix + node.val + "->");
        recursion(node.right, prefix + node.val + "->");
    }

    public static void main(String[] args) {
        Integer[] trees = {1, 2, null, 4, 5};
        TreeNode treeNode = TreeNode.makeTree(trees);
        List<String> strings = new BinaryTreePaths().binaryTreePaths(treeNode);
        System.out.println(strings);
    }
}
