class Solution {
public:
    int findMaxConsecutiveOnes(vector<int>& nums) {
        int maxOnes = 0, tempOnes = 0;

        for (int num : nums){
            if(num == 1){
                tempOnes++;
            }else{
                maxOnes = max(maxOnes , tempOnes);
                tempOnes = 0;
            }
        }
        maxOnes = max(maxOnes , tempOnes);

        return maxOnes;
    }
};