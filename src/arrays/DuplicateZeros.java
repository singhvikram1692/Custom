package arrays;

public class DuplicateZeros {

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


