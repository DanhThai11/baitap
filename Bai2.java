package helloword;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        float a,b,c;
        Scanner bai2 = new Scanner(System.in);
        
        System.out.println("moi ban nhap A");
        a = bai2.nextFloat();
        
        System.out.println("moi ban nhap B");
        b = bai2.nextFloat();
        
        System.out.println("moi ban nhap C");
        c = bai2.nextFloat();
        
        if (a==0){
             if ( b==0 ){
                if ( c==0 ){
                    System.out.println("pt vo so nghiem");
                } 
                else {
                    System.out.println("pt vo nghiem");
                }
             }
             else {
                System.out.println("pt co nghiem la :" + (-c/b));
             }
         }
//        ax^2+bx+c=0
        else{
            float delta = b*b - 4*a*c;
            if (delta > 0 ){
                System.out.println("phuong trinh co 2 nghiem phan biet");
                System.out.println("x1 = "+ ((-b+Math.sqrt(delta))/(2*a))+" x2 = "+ ((-b-Math.sqrt(delta))/(2*a)));
            }
            else if (delta == 0){
                System.out.println("phuong trinh co nghiem kep x = " + (-b/2*a));
            }
            else {
                System.out.println("phuong trinh vo nghiem");
            } 
        }
    }
}
