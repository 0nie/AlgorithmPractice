package baekjoon.lv5;

import java.util.Scanner;

public class Main2562 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int maxIndex = 0;
        int[] arr=new int[9];

        arr[0] = scan.nextInt();
        int max = arr[0];

        for (int i =1; i < 9; i++) {
            arr[i]=scan.nextInt();
            if(max<arr[i]){
                maxIndex = i;
                max = arr[i];
            }

        }
        System.out.println(arr[maxIndex]);
        System.out.println(maxIndex+1);
    }
}