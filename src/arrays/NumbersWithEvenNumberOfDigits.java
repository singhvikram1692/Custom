package arrays;

public class NumbersWithEvenNumberOfDigits {

/*    Input: nums = [12,345,2,6,7896]
    Output: 2
    Explanation:
            12 contains 2 digits (even number of digits).
            345 contains 3 digits (odd number of digits).
            2 contains 1 digit (odd number of digits).
            6 contains 1 digit (odd number of digits).
            7896 contains 4 digits (even number of digits).
    Therefore only 12 and 7896 contain an even number of digits.*/

    public int findNumbers(int[] nums) {
        int numbersWithEvenNumberOfDigits = 0;
        for(int i =0; i<nums.length;i++){
            int number = nums[i];
            int numberOfDivides = 2;
            if(number > 9){
                while((number/10) >=10){
                    number = number/10;
                    numberOfDivides++;
                }

                if(numberOfDivides%2 == 0){
                    numbersWithEvenNumberOfDigits++;
                }
            }
        }
        return numbersWithEvenNumberOfDigits;
    }

}
