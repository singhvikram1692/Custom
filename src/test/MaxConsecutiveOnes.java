package test;

public class MaxConsecutiveOnes {

    //Input: [1,1,0,1,1,1]
    //Output: 3
    //Explanation: The first two digits or the last three digits are consecutive 1s.
    //The maximum number of consecutive 1s is 3.
    
    
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int localMax = 0;
        for(int i =0; i< nums.length;i++){

            if(nums[i] == 0){
                if(localMax >max){
                    max = localMax;
                }
                localMax = 0;
            }else{
                localMax++;
            }
            if(i == nums.length-1){
                if(localMax >max){
                    max = localMax;
                }
            }
        }
        return max;
    }
}
