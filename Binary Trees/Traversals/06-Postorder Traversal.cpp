class Solution {
public:
    void helperFunction(TreeNode* root, vector<int>& traversal){
        if(root == nullptr){
            return;
        }

        helperFunction(root -> left, traversal);
        helperFunction(root -> right, traversal);
        traversal.push_back(root -> val);
    }
    vector<int> postorderTraversal(TreeNode* root) {
        if(root == nullptr){
            return {};
        }

        vector<int> traversal;
        helperFunction(root, traversal);

        return traversal;
    }
};