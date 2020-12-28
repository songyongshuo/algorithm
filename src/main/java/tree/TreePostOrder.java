package tree;

import common.classes.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * 【590. N叉树的后序遍历】
 * 给定一个 N 叉树，返回其节点值的后序遍历。
 * https://leetcode-cn.com/problems/n-ary-tree-postorder-traversal/
 *
 * @author songyongshuo
 * @date 2020-08-16 20:03
 */
public class TreePostOrder {
    private List<Integer> list = new ArrayList<>();

    public List<Integer> postorder(Node root) {
        if (root == null) {
            return list;
        }

        recursion(root);

        return list;
    }

    public void recursion(Node node) {
        if (node.children == null) {
            return;
        }

        for (Node child : node.children) {
            recursion(child);
        }

        list.add(node.val);
    }
}
