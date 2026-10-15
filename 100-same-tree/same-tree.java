
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // Both trees are empty
        if (p == null && q == null) {
            return true;
        }

        // One tree is empty, or node values are different
        if (p == null || q == null || p.val != q.val) {
            return false;
        }

        // Compare left and right subtrees
        return isSameTree(p.left, q.left)
                && isSameTree(p.right, q.right);
    }
}
