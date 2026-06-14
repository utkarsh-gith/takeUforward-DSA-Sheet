class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null){
            return new ArrayList<>();
        }

        Stack<TreeNode> st = new Stack<>();
        List<Integer> traversal = new ArrayList<>();
        TreeNode current = root;
        
        while(!st.empty() || current != null){
            while(current != null){
                st.push(current);
                current = current.left;
            }

            current = st.pop();
            traversal.add(current.val);
            current = current.right;
        }

        return traversal;
    }
}