/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author ADMIN
 */
public class VD2 {
    public static void main(String[] args) {
        try {
            //Tạo đối tượng lấy địa chỉ
        URL url = new URL("http://www.google.com");
        //mở kết nối
        URLConnection uRLConnection = url.openConnection();
        //đọc dữ liệu từ kết nối
        BufferedReader reader = new BufferedReader(new InputStreamReader(uRLConnection.getInputStream()));
        //đọc từng dòng
        String line="";
        while ((line=reader.readLine())!=null) {
            System.out.println(line);
        }
        reader.close();
        } catch (Exception e){
            
        }
    }
}

