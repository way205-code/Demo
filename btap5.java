package Demo;

import java.util.Scanner;

public class btap5 {public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so");
        int n = sc.nextInt();
        int giaithua = 1;
        for (int i = n; i >= 1; i--) {
            giaithua *= i;
        }
        System.out.println(giaithua);
}

    
}
