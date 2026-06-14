class Solution {
    public void helperFunction(TreeNode root, List<Integer> traversal){
        if(root == null){
            return;
        }

        traversal.add(root.val);
        helperFunction(root.left, traversal);
        helperFunction(root.right, traversal);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null){
            return new ArrayList<>();
        }
        
        List<Integer> traversal = new ArrayList<>();

        helperFunction(root, traversal);

        return traversal;
    }
}