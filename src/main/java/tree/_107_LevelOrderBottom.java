package tree;

import common.classes.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * 107. 二叉树的层次遍历 II
 * 给定一个二叉树，返回其节点值自底向上的层次遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）
 *
 * 例如：
 * 给定二叉树 [3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回其自底向上的层次遍历为：
 *
 * [
 *   [15,7],
 *   [9,20],
 *   [3]
 * ]
 *
 * @author songyongshuo
 * @date 2020-09-27 18:38
 */
public class _107_LevelOrderBottom {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        recursion(root, 0, list);
        Collections.reverse(list);
        return list;
    }

    public void recursion(TreeNode node, int level, List<List<Integer>> list) {
        if (node == null) {
            return;
        }

        if (list.size() <= level) {
            list.add(new ArrayList<>());
        }
        list.get(level).add(node.val);
        recursion(node.left, level + 1, list);
        recursion(node.right, level + 1, list);
    }

    public static void main(String[] args) {
        Integer[] array = {3, 9, 20, null, null, 15, 7};
        TreeNode treeNode = TreeNode.makeTree(array);
        List<List<Integer>> lists = (new _107_LevelOrderBottom()).levelOrderBottom(treeNode);
        System.out.println(lists);
    }
}
