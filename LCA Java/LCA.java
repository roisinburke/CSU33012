public class LCA {

    TreeNode root;

    TreeNode findLCA(int n1, int n2)
    {
        return findLCA(root, n1, n2);
    }

    TreeNode findLCA(TreeNode node, int n1, int n2)
    {

        if (node == null)
            return null;

        if (node.data == n1 || node.data == n2)
            return node;

            TreeNode left_lca = findLCA(node.left, n1, n2);
            TreeNode right_lca = findLCA(node.right, n1, n2);

        if (left_lca!=null && right_lca!=null)
            return node;

        return (left_lca != null) ? left_lca : right_lca;
    }
}
class TreeNode {
    int data;
    TreeNode left, right;
    public TreeNode(int item) {
        data = item;
        left = right = null;
    }
}