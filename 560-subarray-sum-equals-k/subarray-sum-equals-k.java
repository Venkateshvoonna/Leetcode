class Solution {
    public int subarraySum(int[] arr, int k) {
        
        int count=0;
        for(int i =0;i<arr.length;i++){
            
            int sum =0;
            for(int j =i;j<arr.length;j++){
                sum += arr[j];
                if(sum == k)
                count++;
            }
        }
        return count;
    }
}