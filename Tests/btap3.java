package Demo.Tests;

import java.util.Scanner;
public class btap3 {public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so ");
        int n = sc.nextInt();
        int f1 = 0;
        int f2 = 1;
        int fn = 0;
        while (fn < n) {
            System.out.println(f1 + " ");
            fn = f1 + f2;
            f1 = f2;
            f2 = fn;

        }
            System.out.println(fn);
        }
        

}
    

