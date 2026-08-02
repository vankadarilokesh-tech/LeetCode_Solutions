class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int num:nums){
            if(even(num)){     //if num if even count++ 
                count++;
            }
        }
             return count;
        }
        boolean even(int num){
            int numofDigits = digits(num);
            if(numofDigits%2 == 0){
                return true;                 //if a num is divided by 2 and give remainder 0 is even
            }
            return false;
        }
        int digits(int num){
            int count=0;
            while(num > 0){
                num = num / 10;     //the num last digits are lefting and count will be increasing
                count++;
            }
            return count;
        }
    
}