package tree;

import common.classes.Node;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 589. N叉树的前序遍历
 * 给定一个 N 叉树，返回其节点值的前序遍历。
 *
 * 例如，给定一个 3叉树 :
 *
 *
 *
 *
 *
 *
 *
 * 返回其前序遍历: [1,3,5,6,2,4]。
 * @author songyongshuo
 * @date 2020-08-28 21:39
 */
public class _589_Preorder {
    private List<Integer> list = new ArrayList<>();

    public List<Integer> preorder(Node root) {
        recursive(root);
        return list;
    }

    private void recursive(Node node) {
        if (node == null) {
            return;
        }
        list.add(node.val);
        if (node.children == null) {
            return;
        }
        for (Node child: node.children) {
            recursive(child);
        }
    }

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3, Arrays.asList(node1, node2));
        List<Integer> preorder = new _589_Preorder().preorder(node3);
        System.out.println(preorder);
    }
}
