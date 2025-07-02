class Solution {
    int preIdx = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder, inorder, 0, inorder.length - 1);
    }

    private TreeNode build(int[] preorder, int[] inorder, int inStart, int inEnd) {
        if (inStart > inEnd) return null;

        int rootVal = preorder[preIdx++];
        TreeNode root = new TreeNode(rootVal);

        // Find the root value index in inorder array
        int mid = inStart;
        while (mid <= inEnd && inorder[mid] != rootVal) {
            mid++;
        }

        root.left = build(preorder, inorder, inStart, mid - 1);
        root.right = build(preorder, inorder, mid + 1, inEnd);

        return root;
    }
}
