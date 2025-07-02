class Solution {
    private int postIdx;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postIdx = postorder.length - 1;
        return build(inorder, postorder, 0, inorder.length - 1);
    }

    private TreeNode build(int[] inorder, int[] postorder, int inStart, int inEnd) {
        if (inStart > inEnd || postIdx < 0) return null;

        int rootVal = postorder[postIdx--];
        TreeNode root = new TreeNode(rootVal);

        int mid = inStart;
        while (mid <= inEnd && inorder[mid] != rootVal) {
            mid++;
        }

        root.right = build(inorder, postorder, mid + 1, inEnd);
        root.left = build(inorder, postorder, inStart, mid - 1);

        return root;
    }
}
