package Demo;
import java.util.Scanner;
public class btap3 {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("nhap so");
    int n = sc.nextInt();
    if (n<0){
        System.out.println("phai la so duong");
    }
    if (n ==0){
        System.out.println("phai la so khac 0");

    }
    int temp = 0;
        int count = 0;
    while(n>0){
        temp = n% 10;
        n = n/10;
        if (temp ==3){
            count++;
        }

    }
    System.out.println(count);

}

    
}
