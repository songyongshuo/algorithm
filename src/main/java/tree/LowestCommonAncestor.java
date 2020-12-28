package tree;

import common.classes.TreeNode;

/**
 * 【剑指 Offer 68 - I. 二叉搜索树的最近公共祖先】
 * 给定一个【二叉搜索树】, 找到该树中两个指定节点的【最近公共祖先】。
 * https://leetcode-cn.com/problems/er-cha-sou-suo-shu-de-zui-jin-gong-gong-zu-xian-lcof/
 *
 * @author songyongshuo
 * @date 2020-08-17 15:22
 */
public class LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }

        if (root.val > p.val && root.val > q.val) {
            // p、q都在root的右子树
            return lowestCommonAncestor(root.left, p, q);
        } else if (root.val < p.val && root.val < q.val) {
            // p、q都在root的左子树
            return lowestCommonAncestor(root.right, p, q);
        }
        return root;
    }

    public static void main(String[] args) {
        LowestCommonAncestor lowestCommonAncestor = new LowestCommonAncestor();
        Integer[] trees = {6,2,8,0,4,7,9,null,null,3,5};
        TreeNode p = new TreeNode(2);
        TreeNode q = new TreeNode(4);

        TreeNode treeNode = lowestCommonAncestor.lowestCommonAncestor(TreeNode.makeTree(trees), p, q);
        System.out.println(treeNode.val);
    }
}
