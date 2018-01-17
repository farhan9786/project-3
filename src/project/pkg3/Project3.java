/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg3;

/**
 *
 * @author Muhammad Farhan
 */
import java.util.Scanner;
public class project3 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        
        int kod;
        
        System.out.println("Ini adalah sistem yang menunjukkan bilangan buku mengikut kod buku.");
        System.out.print("Masukkan kod buku :");
        kod=input.nextInt();
        
        if (kod==100) {
            System.out.println("Bilangan buku bagi kod 100 adalah 12");
        }
        else if (kod==101) {
            System.out.println("Bilangan buku bagi kod 101 adalah 5");
        }
        else if (kod==111) {
            System.out.println("Bilangan buku bagi kod 111 adalah 2");
        }
        else if (kod==113) {
            System.out.println("Bilangan buku bagi kod 113 adalah 16");
        }
        else if (kod==145) {
            System.out.println("Bilangan buku bagi kod 145 adalah 25");
        }
        else {
            System.out.println("Tiada data dalam sistem.");
            System.out.print("Masukkan kod buku yang betul :");
            kod=input.nextInt();
        }
        System.out.println(+kod);
}
}
