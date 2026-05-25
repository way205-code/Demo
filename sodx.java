package Demo;

import java.util.Scanner;

public class sodx {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("nhap so dx");
    int a = sc.nextInt();
    sc.nextLine();
    int sodao = 0;
    int temp = 0;
     int kq =0;
    int ss = a;
    while (a >0) {
        temp = a % 10;
        kq = kq *10 + temp;
        a /= 10;
       
        }
        

    if (ss == kq){
        System.out.println("la so dx");
    }



        }

    


    
}

    
