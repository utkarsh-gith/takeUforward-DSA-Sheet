class Solution {
    public int getSecondLargest(int[] arr) {
        int first = arr[0];
        int second = -1;
        
        for (int a : arr) {
            if (a > first) {
                second = first;
                first = a;
            }
            else if (a < first && a > second){
                second = a;
            }
        }
        
        return second;
    }
}