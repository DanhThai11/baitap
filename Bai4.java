package helloword;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        float a;
        Scanner diemthi = new Scanner(System.in);
        
        System.out.println("Moi ban nhap diem");
        a = diemthi.nextFloat();
        
        if(a<5){
            System.out.println("Hoc sinh Kem");
        } 
        else{
                if (a>=5 && a<=7){
                    System.out.println("Hoc sinh Trung Binh");
                }
                else {
                    if (a>=7 && a<=8){
                        System.out.println("Hoc sinh Kha");
                    }
                    else{
                        System.out.println("Hoc sinh Gioi");}
                }
        }
    }
}
