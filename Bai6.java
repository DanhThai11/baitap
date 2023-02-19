package helloword;

import java.util.Scanner;

public class Bai6 {
 
    public static void main(String[] args) {
        int n;
        Scanner
                input = new Scanner(System.in);
        
        System.out.println("Nhap so dinh cua do thi : ");
        n = input.nextInt();
        
        System.out.println("Ma tran tuong ung la : ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print("n\t");
            }
            System.out.println("");
        }
        
    }
}

