/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author ASUS
 */
public class bai1 extends Thread {
    @Override
public void run() {
    System.out.println("Luong dang chay");
}
public static void main(String[] args) {
    bai1 th = new bai1();
    th.start();
}
    
}
