class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOnes = 0, tempOnes = 0;

        for (int num : nums){
            if(num == 1){
                tempOnes++;
            }else{
                maxOnes = Math.max(maxOnes , tempOnes);
                tempOnes = 0;
            }
        }
        maxOnes = Math.max(maxOnes , tempOnes);

        return maxOnes;
    }
}