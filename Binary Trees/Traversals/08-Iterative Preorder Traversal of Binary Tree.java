class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null){
            return new ArrayList<>();
        }

        Stack<TreeNode> st = new Stack<>();
        st.push(root);

        List<Integer> traversal = new ArrayList<>();

        while(!st.empty()){
            TreeNode temp = st.pop();

            traversal.add(temp.val);

            if(temp.right != null){
                st.push(temp.right);
            }
            if(temp.left != null){
                st.push(temp.left);
            }
        }

        return traversal;
    }
}