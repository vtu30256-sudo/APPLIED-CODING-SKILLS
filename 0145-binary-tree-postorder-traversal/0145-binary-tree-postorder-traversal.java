

class Solution {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();

            // Add current node at the beginning
            result.add(0, node.val);

            // Push left first
            if (node.left != null) {
                stack.push(node.left);
            }

            // Push right second
            if (node.right != null) {
                stack.push(node.right);
            }
        }

        return result;
    }
}