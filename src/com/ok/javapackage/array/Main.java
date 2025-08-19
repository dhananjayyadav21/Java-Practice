package com.ok.javapackage.array;

public class Main {
    public static void main(String[] args) {
        // 1. find 55 =========================================
        int[] arr = {1, 4, 2, 55, 7, -2};
        for(int i:arr){
            if(i == 55){
                System.out.println("found");
            }
        }

        // 2. find maximum number ==============================
        int[] arr2 = new int[5];
        arr2[0] = 2;
        arr2[1] = 12;
        arr2[2] = 4322;
        arr2[3] = -32;
        arr2[4] = 22;

        int res = arr2[0];
        for(int i:arr2){
            if( res < i){
                res = i;
            }
        }
        System.out.println(res);

        // 3. print reverse of array ======================
        int[] arr3 = {1, 3, 43, 4, 345, 53, 5, 4};
        for(int i = arr3.length - 1 ; i >= 0; i--){
            System.out.println(arr3[i]);
        }

        // 4. find sum of array ============================
        int[] arr4 = {2, 4, 55, -4, 11, -55, -11, 2};
        int sum = 0;
        for(int i = 0; i < arr4.length; i++){
            sum += arr4[i];
        }
        System.out.println("The sum of array is : " + sum);


        // 5. traversal 2D array ============================
        int[][] arr5 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for(int i= 0; i < arr5.length; i++){
            for (int j =0; j<arr5[i].length; j++){
                System.out.print(arr5[i][j] + " ");
            }
            System.out.println();
        }
    }
}
