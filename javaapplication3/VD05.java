/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

//TIẾN TRÌNH TREO 2
public class VD05 {
    private final Object monitor = new Object();
    public void doi() throws InterruptedException{
        monitor.wait();//doi
    }
    public void danhThuc(){
        synchronized (monitor) {
            monitor.notify();//danh thuc
        }
    }
}