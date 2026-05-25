package Demo;

import java.util.Scanner;

public class btap4 {public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so ");
        int n = sc.nextInt();
        sc.nextLine();
        int temp = 0;
        int sum = 0;
        while (n > 0) {
            temp = n % 10;
            n /= 10;
            sum = sum + temp;


            

        }
        System.out.println(sum);
}

    
}
