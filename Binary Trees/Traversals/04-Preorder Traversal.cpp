class Solution {
public:
    void helperFunction(TreeNode* root, vector<int>& traversal){
        if(root == nullptr){
            return;
        }

        traversal.push_back(root -> val);
        helperFunction(root -> left, traversal);
        helperFunction(root -> right, traversal);
    }
    vector<int> preorderTraversal(TreeNode* root) {
        if(root == nullptr){
            return {};
        }

        vector<int> traversal;
        helperFunction(root, traversal);

        return traversal;
    }
};