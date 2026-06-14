class Solution {
public:
    vector<vector<int>> levelOrder(TreeNode* root) {
        if(root == nullptr){
            return {};
        }

        vector<vector<int>> traversal;
        
        queue<TreeNode*> q;
        q.push(root);

        while(!q.empty()){
            vector<int> level;
            int n = q.size();

            for(int i = 0; i < n; i++){
                TreeNode* temp = q.front();
                q.pop();

                level.push_back(temp -> val);

                if(temp -> left){
                    q.push(temp -> left);
                }
                if(temp -> right){
                    q.push(temp -> right);
                }
            }

            traversal.push_back(level);
        }

        return traversal;
    }
};