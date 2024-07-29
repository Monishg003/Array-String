class Solution {
    public int removeDuplicates(int[] nums) {
        int ptr=0;
        int arr[]=new int[nums.length];
        for(int i=1;i<nums.length;i++){
            if(nums[ptr]!=nums[i]){
                 ptr++;
                 nums[ptr]=nums[i];
            }
        }
        return ptr+1;
    }
}
