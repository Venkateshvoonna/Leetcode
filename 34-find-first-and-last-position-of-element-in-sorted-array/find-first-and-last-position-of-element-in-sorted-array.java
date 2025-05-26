class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = findIndex(nums,target,true);
        int last = findIndex(nums,target,false);

        return new int[] {first,last};
    }
    public int findIndex(int[] nums,int target,boolean findFirst){
        int index = -1;
        int left = 0;
        int right = nums.length-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(nums[mid]==target){
                index = mid;
                if(findFirst){
                    right = mid - 1;
                }else{
                    left = mid+1;
                }
            }else if(nums[mid] < target){
                left  = mid+1;
            }else{
                right = mid -1;
            }
        }
        return index;
    }
}