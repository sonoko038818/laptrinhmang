/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.net.InetAddress;

/**
 *
 * @author ASUS
 */
public class bai1 {
    public static void main(String[] args) {
    try {
       InetAddress inet=InetAddress.getByName("www.google.com");
       boolean isKN=inet.isReachable(5000);
       if(isKN)
       {
           System.out.println("Co Internet");
       }
       else
       {
           System.out.println("Khong co Inetnet");
       }
   } catch (Exception e) 
    { 
        e.printStackTrace(); 
    }
}
    
}
