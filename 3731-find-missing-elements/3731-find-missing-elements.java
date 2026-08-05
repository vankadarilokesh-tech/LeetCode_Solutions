class Solution {
    public List<Integer> findMissingElements(int[] nums) {
       List<Integer> n= new ArrayList<>();
    for(int i=0;i<nums.length;i++){
        for(int j=i+1;j<nums.length;j++){
            if(nums[i]>nums[j]){
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
            }
        }
    }
    int i=nums[0];
    int j=0;
    while(i<=nums[nums.length-1]){
        if(i!=nums[j]){
            n.add(i);
        }
        else{
            j++;
        }
        i++;
    }
    return n;
    
    }

}