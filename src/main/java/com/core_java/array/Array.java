package com.core_java.array;

public class Array {

    public static void main(String[] args) {
// 1D
        // known value
        int[] num = {4, 5, 8, 9, 3,'z'};
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }


        System.out.println("//////////////////");
        //unknown value
        int[] age = new int[5];
        age[0] = 10;
        age[4] = 51;
        System.out.println(age[0]);

        int[] age1 = {45, 8, 6, 11111111, 54, 5};
        System.out.println(age1.length);


        // 2D

        //known value

        int[][] a = {{4, 5, 6}, {7, 9}, {1, 2, 3,5}};

        // 4 5 6
        // 7 8 9
        // 1 2 3

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println(" ");
        }


        int[][] b = new int[2][3];
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length + 1; j++) {
                b[i][j] = j + 5;
            }

        }
        System.out.println("---------------------");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length + 1; j++) {
                System.out.print(b[i][j]+" ");
            }
            System.out.println(" ");

        }

        // jagged Array

        int[][] arr =new int[3][];
        arr[0]= new int[5];
        arr[1]= new int[10];
        arr[2]= new int[2];

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=count++;
            }
        }

        System.out.println("-------------------");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println(" ");
        }

    }
}
