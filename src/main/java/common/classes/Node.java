package common.classes;

import java.util.List;

/**
 * @author songyongshuo
 * @date 2020-08-17 13:15
 */
public class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
