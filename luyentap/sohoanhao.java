package Demo.luyentap;

import java.util.Scanner;

public class sohoanhao {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("nhap so hoan hao");
    int n = sc.nextInt();
    sc.nextLine();
    long sum = 1;
    if (n <= 1) {
        System.out.println("khong phai la so hoan hao");
    }
    else {
        for (long i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                sum = sum + i;
                if (i != n / i) {
                    sum = sum + n / i;

                }

            }
        }
        if (sum == n) {
            System.out.println("la so hoan hao");

        }
        else {
            System.out.println("khong phai la so hoan hao");
        }


    }


} 

    
}
