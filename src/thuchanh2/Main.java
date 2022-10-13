package thuchanh2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        ArrayExample arrExample = new ArrayExample();
        Integer[] arr = arrExample.createRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nVui lòng nhập chỉ số của một phần tử bất kỳ: ");
        int x = scanner.nextInt();
        try {
            System.out.println("Giá trị của phần tử có chỉ số 5" + x + " là " + arr[x]);
        } catch (Exception ex) {
            System.err.println("khong hop le vui long nhap lai");
        }
    }
}
