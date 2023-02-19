/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helloword;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai8 {
    public static void main(String[] args) {
        int n, x, tram, chuc, dvi;
        String t="", c="", d="";
        Scanner input = new Scanner(System.in);
        
        System.out.println("Nhap n : ");
        n = input.nextInt();
        x = n;
        
        dvi = (x%10); x/=10;
        chuc = (x%10); x/=10;
        tram = (x%10);
        
        switch(tram){
            case 1 :{
                t = "mot tram";
                break;
            }
            case 2 :{
                t = "hai tram";
                break;
            }
            case 3 :{
                t = "ba tram";
                break;
            }
            case 4 :{
                t = "bon tram";
                break;
            }
            case 5 :{
                t = "nam tram";
                break;
            }
            case 6 :{
                t = "sau tram";
                break;
            }
            case 7 :{
                t = "bay tram";
                break;
            }
            case 8 :{
                t = "tam tram";
                break;
            }
            case 9 :{
                t = "chin tram";
                break;
            }
        }
        
        switch(chuc){
            case 1 :{
                c = "muoi";
                break;
            }
            case 2 :{
                c = "hai muoi";
                break;
            }
            case 3 :{
                c = "ba muoi";
                break;
            }
            case 4 :{
                c = "bon muoi";
                break;
            }
            case 5 :{
                c = "nam muoi";
                break;
            }
            case 6 :{
                c = "sau muoi";
                break;
            }
            case 7 :{
                c = "bay muoi";
                break;
            }
            case 8 :{
                c = "tam muoi";
                break;
            }
            case 9 :{
                c = "chin muoi";
                break;
            }
        }
                
        switch(dvi){
            case 1 :{
                d = "mot";
                break;
            }
            case 2 :{
                d = "hai";
                break;
            }
            case 3 :{
                d = "ba";
                break;
            }
            case 4 :{
                d = "bon";
                break;
            }
            case 5 :{
                d = "lam";
                break;
            }
            case 6 :{
                d = "sau";
                break;
            }
            case 7 :{
                d = "bay";
                break;
            }
            case 8 :{
                d = "tam";
                break;
            }
            case 9 :{
                c = "chin tram";
                break;
            }
        }
        
        System.out.println(t+" "+c+" "+d);
    }
}