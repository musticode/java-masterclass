package org.master.Classes.Homeworks;

public class Hw2ArraysFunctions {

    public static void main(String[] args) {

        int [] arr2 = {4,5,7,8};

        int missingarr  = findMissingNumInArray(arr2);
        System.out.println(missingarr);


        System.out.println("------222--------");

        int [] arr3 = {1,5,7,12,4}; // {4,1,5,7,12}
        //
        int [] arr4 = shiftArr2(arr3);

        for (int i = 0; i < arr4.length; i++){
            System.out.print(arr4[i]+ " ");
        }

        System.out.println("------3333--------");
        char[] charArr = {'a', 'c', 'T', 'Y'};  //
        changeChar(charArr);


        System.out.println("--------44444--------");
        int [] arrMissingAdded = {5,7,8,9,10};
        int [] newArrMissingAdded = addMissingNumInArray(arrMissingAdded);
        System.out.println("missing new array");
        for (int i = 0; i < newArrMissingAdded.length; i++){
            System.out.print(newArrMissingAdded[i] +" ");
        }


        System.out.println("--------44444- 2222222--------");
        int [] arrMissingAdded2 = {4,5,7,8};
        int [] newArrMissingAdded2 = addMissing2(arrMissingAdded2);
        System.out.println("missing new array 222222");
        for (int i = 0; i < newArrMissingAdded2.length; i++){
            System.out.print(newArrMissingAdded2[i] +" ");
        }


        System.out.println("--------44444- 2222222--------");
        int [] arrMissingAdded3 = {7,9,10,11};
        int [] newArrMissingAdded3 = addMissing2(arrMissingAdded3);
        System.out.println("missing new array 222222");
        for (int i = 0; i < newArrMissingAdded3.length; i++){
            System.out.print(newArrMissingAdded3[i] +" ");
        }


    }
    public static int[] addMissing2(int [] arr){
        int missing = 0;
        int indexMissing = 0;

        for (int i = 0; i < arr.length-1; i++){
            if (arr[i+1] - arr[i] != 1 ){ // 6 - 4 !=1 --> (6 + 4)/ 2 = 5
                missing = (arr[i+1] + arr[i] ) / 2;

                //System.out.println("missing index"+ i);
                indexMissing = i + 1;
                System.out.println("indexMissing: "+indexMissing);

            }

        }

        int [] newArr = new int[arr.length+1];

        for (int i = 0; i < newArr.length; i++){  //3
            if (i < indexMissing){ //3
                for (int j = i; j < newArr.length -1; j++){ //5 boyut
                    newArr[j] = arr[j];
                }

            }else if (indexMissing == i){
                newArr[i] = missing;

            }else if(i > indexMissing){
                for(int k = i; k < newArr.length; k++){
                    newArr[k] = arr[k-1];
                }
            }


        }

        return newArr;
    }




    public static int [] addMissingNumInArray(int [] arr){
        if ( arr.length <= 0 ){
            System.out.println("Array size is less than 0");
        }
        // 4 5 7 8 -->  4 5 6 7 8
        int [] newArr = new int[arr.length+1];

        int missing = 0;
        int index = 0;

        for (int i = 0; i < arr.length-1; i++){


            if (arr[i+1] - arr[i] == 1 ){ // 6 - 4 !=1 --> (6 + 4)/ 2 = 5
                missing = (arr[i+1] + arr[i] ) / 2;
                System.out.println("index "+ i);
            }

        }



        return newArr;
    }

    public static void changeChar(char [] arr){

        // A = 65 , a = 97  fark 32 ,, C = 67 c = 99  fark 32
        for (int i = 0; i < arr.length; i++){

            if (arr[i] > 64 && arr[i] < 91){
                arr[i] = (char) (arr[i] + 32);
            }else if(arr[i] > 96 && arr[i] < 122){
                arr[i] = (char) (arr[i] - 32);
            }

        }


        for (int i = 0; i < arr.length; i++){
            System.out.print( arr[i] + " " );
        }
    }

    public static int [] shiftArr2(int [] arr){

        int last = arr[arr.length-1];
        for (int i = arr.length-1; i > 0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = last;

        return arr;
    }


    public static int [] shiftArray(int [] arr){

//        int temp = arr[0]; // 1
//        int temp2 = arr[1]; // 5
//        int temp3 = arr[2]; // 7
//
//        arr[1] = temp; // 1
//        arr[2] = temp2;
//        arr[3] = temp3;

        //{1,5,7,12,4}; // {4,1,5,7,12}
        for (int i = 0; i < arr.length-4; i++){
            int last = arr[arr.length-1];

            for (int j = arr.length-1; j > 0; j--){
                arr[j] = arr[j-1];
            }

            arr[0] = last;


        }

        return arr;

    }






    public static int findMissingNumInArray(int [] arr){
        int missing = 0;
        int indexMissing ;

        for (int i = 0; i < arr.length-1; i++){
            if (arr[i+1] - arr[i] != 1 ){ // 6 - 4 !=1 --> (6 + 4)/ 2 = 5
                missing = (arr[i+1] + arr[i] ) / 2;

                //System.out.println("missing index"+ i);
                indexMissing = i + 1;
                System.out.println("indexMissing: "+indexMissing);
                return missing;
            }

        }

        int [] newArr = new int[arr.length+1];
        for (int i = 0; i < newArr.length; i++){
            newArr[i] = arr[i];

        }




        return missing;
    }





}
