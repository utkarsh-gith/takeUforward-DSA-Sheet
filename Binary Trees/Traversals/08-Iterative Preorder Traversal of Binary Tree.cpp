class Solution {
public:
    vector<int> preorderTraversal(TreeNode* root) {
        if(root == nullptr){
            return {};
        }

        stack<TreeNode*> st;
        st.push(root);

        vector<int> traversal;

        while(!st.empty()){
            TreeNode* temp = st.top();
            st.pop();

            traversal.push_back(temp -> val);

            if(temp -> right){
                st.push(temp -> right);
            }
            if(temp -> left){
                st.push(temp -> left);
            }
        }

        return traversal;
    }
};