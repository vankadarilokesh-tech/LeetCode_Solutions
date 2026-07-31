class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
        System.out.println(Arrays.toString(nums));
        
    }
    void reverse(int[] nums,int start , int end){
         
         while(start < end){
            swap(nums,start, end);
            start++;
            end--;
         }
    }
   void swap( int[] nums,int index1 , int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;


    }
}