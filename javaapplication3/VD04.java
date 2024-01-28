/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

//TIẾN TRÌNH TREO 1
public class VD04 {
    private final Object lc=new Object();//doi tuong khoa
    public synchronized void pt1(){//phuong thuc dong bo hoa
    
    }
    public synchronized void pt2(){
        synchronized (lc)//giu khoa
        {
            
        }
    }
    public static void main(String[] args) {
        Thread th=new Thread(()->{
            //code
        });
        th.start();
        try {
            //phuong thuc 1 la tien trinh treo
        } catch (Exception e) {
        }
    }
}
