class Solution {
    public void helperFunction(TreeNode root, List<Integer> traversal){
        if(root == null){
            return;
        }

        helperFunction(root.left, traversal);
        helperFunction(root.right, traversal);
        traversal.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root == null){
            return new ArrayList<>();
        }
        
        List<Integer> traversal = new ArrayList<>();

        helperFunction(root, traversal);

        return traversal;
    }
}