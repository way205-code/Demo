package Demo.Tests;

import java.util.Scanner;

public class btap {public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so");
        int num = sc.nextInt();
        int remind ;
        int temp = num;
        String kq = "";
        if (temp == 0) {
            kq = "0";
        }
        else{
        while (temp > 0) {
            
            remind = temp % 2;
            kq = remind +kq ;
            temp = temp / 2;
           
        }
    }
        System.out.println(kq);
}
    
}
