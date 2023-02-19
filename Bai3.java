package helloword;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        float sodien , tien;
        Scanner bai3 = new Scanner (System.in);
        
        System.out.println("nhap so dien dung thang nay");
        sodien= bai3.nextFloat();
                
                if (sodien<=50){
                    System.out.println("tien dien thang nay la " + (sodien*1000) );
                }
                    else {
                    System.out.println("tien dien thang nay la "+ ((50*1000)+(sodien-50)*1200));
                            }
    }
}

