package Demo.luyentap;

import java.util.Scanner;

public class sohoanhao {
    public static void PerfectNums(int nums) {
        long sum = 1;
        if (nums <= 1) {
            System.out.println("khong phai la so hoan hao");
        } else {
            for (long i = 2; i <= Math.sqrt(nums); i++) {
                if (nums % i == 0) {
                    sum = sum + i;
                    if (i != nums / i) {
                        sum = sum + nums / i;

                    }

                }
            }
            if (sum == nums) {
                System.out.println("la so hoan hao");

            } else {
                System.out.println("khong phai so hoan hao");
            }

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so hoan hao");
        int n = sc.nextInt();
        sc.nextLine();
        PerfectNums(n);
    }

}
