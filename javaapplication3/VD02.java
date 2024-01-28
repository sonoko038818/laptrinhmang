/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;//tao khoa
//ĐỒNG BỘ LUỒNG 2
public class VD02 {
    private int count=0;
    private Lock lc=new ReentrantLock();//tao khoa
    public void demTang()
    {
        lc.lock();//khoa lai
        try {
            count++;//thuc hien dem
        } catch (Exception e) {
        }
        finally
        {
            lc.unlock();//dem xong can mo khoa
        }
    }
}
