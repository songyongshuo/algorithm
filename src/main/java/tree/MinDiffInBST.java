package tree;

import common.classes.TreeNode;

import java.util.Collections;

/**
 * 783. 二叉搜索树节点最小距离
 * 给定一个二叉搜索树的根节点 root，返回树中任意两节点的差的最小值。
 *
 *
 *
 * 示例：
 *
 * 输入: root = [4,2,6,1,3,null,null]
 * 输出: 1
 * 解释:
 * 注意，root是树节点对象(TreeNode object)，而不是数组。
 *
 * 给定的树 [4,2,6,1,3,null,null] 可表示为下图:
 *
 *           4
 *         /   \
 *       2      6
 *      / \
 *     1   3
 *
 * 最小的差值是 1, 它是节点1和节点2的差值, 也是节点3和节点2的差值。
 *
 * @author songyongshuo
 * @date 2020-08-18 13:53
 */
public class MinDiffInBST {
    private Integer minNum = Integer.MAX_VALUE;
    private Integer prev = null;

    public int minDiffInBST(TreeNode root) {
        dfs(root);
        return minNum;
    }

    private void dfs(TreeNode node) {
        if (node == null) {
            return;
        }
        dfs(node.left);
        if (prev != null) {
            minNum = Math.min(minNum, Math.abs(prev - node.val));
        }
        prev = node.val;
        dfs(node.right);
    }

    public static void main(String[] args) {
        Integer[] tree = {90,69,null,49,89,null,52,null,null,null,null};
        TreeNode treeNode = TreeNode.makeTree(tree);

        MinDiffInBST minDiffInBST = new MinDiffInBST();
        int i = minDiffInBST.minDiffInBST(treeNode);
        System.out.println(i);
    }
}
