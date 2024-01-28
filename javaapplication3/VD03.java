/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

public class VD03 {
    private int count = 0;
    //
    public synchronized void demTang(){
        count++;
    }
    public  synchronized void demGiam(){
        count-=2;
    }
    public int getCount(){
        return count;
    }
    public static void main(String[] args) {
        VD03 c=new VD03();
        Thread inTh=new Thread(()->{//tao luong tang
            for(int i=0;i<1000;i++){
                c.demTang();//goi ham dong bo hoa
            }
        });
          Thread deTh=new Thread(()->{//tao long giam
            for(int i=0;i<1000;i++){
                c.demGiam();//goi ham dong bo hoa
            }
        });
          inTh.start();//chay luong
          deTh.start();
          try {
            inTh.join();//doi luong nay hoan thanh moi xu ly tiep
            deTh.join();//doi luong nay hoan thanh moi xu ly tiep
        } catch (Exception e) {
        }//in ra ket qua cuoi cung
          System.out.println("Ket qua dem cuoi cung: "
          +c.getCount());
    }
}
