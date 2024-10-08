/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
         List<Integer> result = new ArrayList<>();
         if (root == null) {
            return new ArrayList();
        }

        traverseTree(root, result);

        return result;
    }

    private void traverseTree(Node root, List<Integer> result) {
        result.add(root.val); // Add root value first
        for (Node child : root.children) {
            traverseTree(child, result);
        }
    }
}