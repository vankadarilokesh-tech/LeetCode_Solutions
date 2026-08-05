class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer> n = new ArrayList<>();
         for(int i = 0; i < nums.length-1 ; i++){
            int current = nums[i];
            int next = nums[i+1];
            while(current + 1 < next){
                n.add(current+1);
                current++;
            }
         }
         return n;

    }

}