package Demo.Tests;

import java.util.Scanner;

public class btap2 {public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so ");
        int n = sc.nextInt();
        int temp = n;
        int sodao = 0;
        int k;
        
        while (temp > 0) {
            k = temp % 10;
            sodao = (sodao * 10) + k;
            temp = temp / 10;

        }
        if (n == sodao) {
            System.out.println("la so doi xung");
        
    } else {System.out.println("khong phai la so doi xung");}

        
}
    
}
