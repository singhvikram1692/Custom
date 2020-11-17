package arrays;

public class DuplicateZeros {


/*
    Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining elements to the right.

    Note that elements beyond the length of the original array are not written.

    Do the above modifications to the input array in place, do not return anything from your function.

    Input: [1,0,2,3,0,4,5,0]
    Output: null
    Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]


    Input: [1,2,3]
    Output: null
    Explanation: After calling your function, the input array is modified to: [1,2,3]
*/

    public void duplicateZeros(int[] arr) {
        for(int i =0; i< arr.length-1;i++){
            if(arr[i] == 0){
                int [] temp = new int[arr.length];
                int placeHolder = i;
                temp[placeHolder+1] = 0;
                while(placeHolder>=0){
                    temp[placeHolder] = arr[placeHolder];
                    placeHolder--;
                }
                if(i<arr.length-1){
                    for(int j = i+1; j<arr.length-1;j++){
                        temp[j+1] = arr[j];
                    }
                }
              i++;
                for(int x =0;x<arr.length;x++){
                    arr[x] = temp[x];
                }
            }
        }
    }

}


