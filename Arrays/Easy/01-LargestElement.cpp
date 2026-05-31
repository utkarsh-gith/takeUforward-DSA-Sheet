class Solution {
  public:
    int largest(vector<int> &nums) {
        int maxNum = INT_MIN;
        for(int num : nums){
            maxNum = max(num, maxNum); //num > maxNum ? num : maxNum;
        }
        return maxNum;
    }
};