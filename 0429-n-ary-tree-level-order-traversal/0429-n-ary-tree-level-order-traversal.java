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
    public List<List<Integer>> levelOrder(final Node root) {
        if(root == null)
            return Arrays.asList();

        final List<List<Integer>> result = new ArrayList<>();
        final Queue<Node> queue = new LinkedList<>();

        queue.offer(root);

        while(!queue.isEmpty()) {
            final int size = queue.size();
            final List<Integer> list = new ArrayList<>();

            for(int i = 0; i < size; ++i) {
                final Node node = queue.poll();
                
                for(final Node child : node.children)
                    queue.offer(child);

                list.add(node.val);
            }

            result.add(list);
        }

        return result;
    }
}