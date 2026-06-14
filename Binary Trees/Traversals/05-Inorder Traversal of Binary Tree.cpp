class Solution {
public:
    void helperFunction(TreeNode* root, vector<int>& traversal){
        if(root == nullptr){
            return;
        }

        helperFunction(root -> left, traversal);
        traversal.push_back(root -> val);
        helperFunction(root -> right, traversal);
    }
    vector<int> inorderTraversal(TreeNode* root) {
        if(root == nullptr){
            return {};
        }

        vector<int> traversal;
        helperFunction(root, traversal);

        return traversal;
    }
};