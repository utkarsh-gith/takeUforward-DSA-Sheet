class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null){
            return new ArrayList<>();
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        List<List<Integer>> traversal = new ArrayList<>();
        
        while(!q.isEmpty()){
            List<Integer> level = new ArrayList<>();
            int n = q.size();

            for(int i = 0; i < n; i++){
                TreeNode temp = q.poll();

                level.add(temp.val);

                if(temp.left != null){
                    q.offer(temp.left);
                }
                if(temp.right != null){
                    q.offer(temp.right);
                }
            }

            traversal.add(level);
        }

        return traversal;
    }
}