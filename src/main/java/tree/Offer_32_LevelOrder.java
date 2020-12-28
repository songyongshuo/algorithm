package tree;

import common.classes.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 剑指 Offer 32 - II. 从上到下打印二叉树 II
 * 从上到下按层打印二叉树，同一层的节点按从左到右的顺序打印，每一层打印到一行。
 *
 *
 *
 * 例如:
 * 给定二叉树: [3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回其层次遍历结果：
 *
 * [
 *   [3],
 *   [9,20],
 *   [15,7]
 * ]
 *
 * @author songyongshuo
 * @date 2020-08-23 22:21
 */
public class Offer_32_LevelOrder {
    List<List<Integer>> ret = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        dfs(root, 0);
        return ret;
    }

    private void dfs(TreeNode node, int level) {
        if (node == null) {
            return;
        }
        if (ret.size() == level) {
            ret.add(new ArrayList<>());
        }
        ret.get(level).add(node.val);
        dfs(node.left, level + 1);
        dfs(node.right, level + 1);
    }

    public static void main(String[] args) {
        Integer[] tree = {3, 9, 20, null, null, 15, 7};
        TreeNode treeNode = TreeNode.makeTree(tree);
        List<List<Integer>> lists = new Offer_32_LevelOrder().levelOrder(treeNode);
        System.out.println(lists);
    }
}
