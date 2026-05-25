package Demo;

import java.util.Scanner;

public class btap4 {public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so ");
        int n = sc.nextInt();
        sc.nextLine();
        int temp = 0;
        int sum = 0;
        int count = 0;
        while (n > 0) {
            temp = n % 10;
            n /= 10;
            count++;
            sum = sum + temp;

        }
        
        System.out.println(sum);
        System.out.println(sum/count);


}

    
}
