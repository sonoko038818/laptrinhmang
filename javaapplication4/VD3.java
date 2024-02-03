/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author ADMIN
 */
public class VD3 {
    public static void main(String[] args) {
        try {
            //Tạo đối tượng lấy địa chỉ
            URL url = new URL("http://www.google.com");
            //mở kết nối
            URLConnection uRLConnection = url.openConnection();
            //đọc dữ liệu từ kết nối
            BufferedReader reader = new BufferedReader(new InputStreamReader(uRLConnection.getInputStream()));
            //tạo đối tượng ghi file
            FileWriter fileWriter = new FileWriter("tuan4.html");
            //đọc từng dòng
            String line="";
            while ((line=reader.readLine())!=null) {
                fileWriter.write(line + "\n");
            }
            reader.close();// đóng luồng
            fileWriter.close();//đóng file
        } catch (Exception e) {
            
        }
    }
}