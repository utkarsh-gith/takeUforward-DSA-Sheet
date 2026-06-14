lass Solution {
public:
    vector<int> inorderTraversal(TreeNode* root) {
        if(root == nullptr){
            return {};
        }

        stack<TreeNode*> st;
        vector<int> traversal;
        TreeNode* current = root;
        
        while(!st.empty() || current != nullptr){
            while(current != nullptr){
                st.push(current);
                current = current -> left;
            }

            current = st.top();
            st.pop();

            traversal.push_back(current -> val);
            current = current -> right;
        }

        return traversal;
    }
};