class Solution {
    public void helperFunction(TreeNode root, List<Integer> traversal){
        if(root == null){
            return;
        }

        helperFunction(root.left, traversal);
        traversal.add(root.val);
        helperFunction(root.right, traversal);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null){
            return new ArrayList<>();
        }
        
        List<Integer> traversal = new ArrayList<>();

        helperFunction(root, traversal);

        return traversal;
    }
}