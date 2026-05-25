package Demo;

import java.util.Scanner;

public class sodx {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("nhap so dx");
    int a = sc.nextInt();
    sc.nextLine();
    int sodao = 0;
     int kq = sodao;
    while (a >0) {
        sodao = sodao * 10 + a % 10;
        a /= 10;
       
        }
    if (a == kq){
        System.out.println("la so dx");
    }



        }

    


    
}

    
