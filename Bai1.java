package helloword;

import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {
        float a,b;
        Scanner nhap = new Scanner(System.in);
        
        System.out.println("moi ban nhap A:");
        a = nhap.nextFloat();
        
        System.out.println("moi ban nhap B:");
        b = nhap.nextFloat();
        
        System.out.println("gia tri a la : "+ a +" gia tri b la "+b);
//     ax + b = 0 
        if ( a==0 ){
            if ( b==0 ){
                System.out.println("pt vo so nghiem");
            } 
            else {
            System.out.println("pt vo nghiem");
            }
        }
        else {
            System.out.println("pt co nghiem la :"+ -b/a );
        }
    }
}