class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = -1;// 0 is workouts but if in can there are negative values in the given array the -1 can help.....
        for(int i : candies){
            if(i > max){
                max = i;
            }
        }
        List <Boolean> result = new ArrayList();
        for(int i : candies){
            if(i + extraCandies >= max){
                result.add(true);
            }else{
                result.add(false);
            }
        }
        return result;
    }
}