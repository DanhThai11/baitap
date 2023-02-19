package helloword;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai7 {
    public static void main(String[] args) {
        int n, result = 1;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Nhap n : ");
        n = input.nextInt();
        
        for(int i = n; i >= 1; i--){
            result *= i;
        }
        
        System.out.println("n! = "+result);
    }
}