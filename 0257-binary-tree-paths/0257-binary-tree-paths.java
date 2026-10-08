

class Solution {
    
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        
        if (root == null) {
            return result;
        }
        
        findPaths(root, "", result);
        return result;
    }
    
    private void findPaths(TreeNode node, String path, List<String> result) {
        
        
        path = path + node.val;
        
        
        if (node.left == null && node.right == null) {
            result.add(path);
            return;
        }
        
       
        if (node.left != null) {
            findPaths(node.left, path + "->", result);
        }
        
        
        if (node.right != null) {
            findPaths(node.right, path + "->", result);
        }
    }
}