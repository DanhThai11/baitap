
package helloword;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        int[] a;
        int size, x, flag = 0;
        Scanner input = new Scanner(System.in);
                
        System.out.println("Nhap vao so luong phan tu co trong mang : ");
        size = input.nextInt();
        a = new int[size];
        
        for(int i = 0; i < size; i++){
            System.out.println("a["+i+"] : ");
            a[i] = input.nextInt();
        }
        
        System.out.println("Nhap vao gia tri x can xoa khoi mang : ");
        x = input.nextInt();
        
        for(int i = 0; i < size; i++){
            if(a[i] == x){
                for(int j = i; j < size-1; j++){
                    a[j] = a[j+1];
                }
                size--;
                flag = 1;
            }
        }
        
        if(flag==1){
            System.out.println("Da xoa gia tri "+x+" trong mang, mang sau khi xoa : ");
            for(int i = 0; i < size; i++){
                System.out.println("a["+i+"] = "+a[i]);
                     
            }
        }
        else{
            System.out.println("Khong ton tai gia tri x = "+x+" trong mang !");
        }
    }
}

