package tree;

import common.classes.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 剑指 Offer 54. 二叉搜索树的第k大节点
 * 给定一棵二叉搜索树，请找出其中第k大的节点。
 *
 *
 *
 * 示例 1:
 *
 * 输入: root = [3,1,4,null,2], k = 1
 *    3
 *   / \
 *  1   4
 *   \
 *    2
 * 输出: 4
 * 示例 2:
 *
 * 输入: root = [5,3,6,2,4,null,null,1], k = 3
 *        5
 *       / \
 *      3   6
 *     / \
 *    2   4
 *   /
 *  1
 * 输出: 4
 *
 *
 * 限制：
 *
 * 1 ≤ k ≤ 二叉搜索树元素个数
 *
 * @author songyongshuo
 * @date 2020-08-28 23:27
 */
public class Offer_54_KthLargest {
    private List<Integer> list = new ArrayList<>();

    public int kthLargest(TreeNode root, int k) {
        recursion(root);
        return list.get(list.size() - k);
    }

    private void recursion(TreeNode node) {
        if (node == null) {
            return;
        }
        recursion(node.left);
        list.add(node.val);
        recursion(node.right);
    }

    public static void main(String[] args) {
        Integer[] tree = {5,3,6,2,4,null,null,1};
        int i = new Offer_54_KthLargest().kthLargest(TreeNode.makeTree(tree), 1);
        System.out.println(i);
    }
}
