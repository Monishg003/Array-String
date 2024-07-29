class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int left=0;
       int right=0;
       int  index=0;
        int nums3[] = new int[n+m];
        while(left<m && right<n){
            if(nums1[left]<=nums2[right]){
                nums3[index]=nums1[left];
                left++;
                index++;
            }
            else{
                nums3[index]=nums2[right];
                right++;
                index++;
            }
        }
        while(left<m){
            nums3[index]=nums1[left];
            left++;
            index++;
        }
        while(right<n){
            nums3[index]=nums2[right];
            right++;
            index++;
        }
        for(int i=0;i<nums3.length;i++){
            nums1[i]=nums3[i];
        }
    }
}
