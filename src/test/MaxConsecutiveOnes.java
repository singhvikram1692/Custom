package test;

public class MaxConsecutiveOnes {

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
