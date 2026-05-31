class Solution {
    public static int largest(int[] arr) {
        int maxNum = Integer.MIN_VALUE;
        for(int a : arr){
            maxNum = Math.max(maxNum, a);
        }
        return maxNum;
    }
}