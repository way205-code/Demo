package Demo.luyentap;

import java.util.Scanner;

public class btap1 {
    public static int BinarySearch(int k, int[] arr) {
        int left = arr[0];
        int right = arr.length - 1;

        while (left < right) {
            int mid = (left + right) / 2;

            if (arr[mid] == k) {
                return arr[mid];
            } else if (arr[mid] > k) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("nhap so");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("nhap so thu" + (i + 1) + ":");
            arr[i] = sc.nextInt();
        }
        System.out.println("nhap so can tim");
        int k = sc.nextInt();
        System.out.println(BinarySearch(k, arr));
    }

}
