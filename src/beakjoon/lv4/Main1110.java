package beakjoon.lv4;


import java.util.Scanner;

public class Main1110 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        int cycle = 0;
        int one = num % 10;
        int ten = num / 10 ;
        int neww;

        do {if ((one + ten) >= 10) {
            neww = one * 10 + (one + ten) % 10;
        } else {
            neww = one * 10 + (ten + one);
        }
            ten = neww / 10;
            one = neww % 10;
            ++cycle;
        } while (neww != num);

        System.out.print(cycle);
    }
}