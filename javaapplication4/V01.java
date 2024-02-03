/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;
/**
 *
 * @author ADMIN
 */
import java.net.InetAddress;
import java.net.URL;
public class V01 {
    public static void main(String[] args) {
        try {
            //c1 tạo đối tượng Inetadress bằng tên máy chủ
            InetAddress dcByName= InetAddress.getByName("www.google.com");
            //tạo đối tượng InetAdress bằng địa chỉ IP
            
            System.out.println("Lay dia chi tu name:"+dcByName.getHostAddress());
            //c2 tao đói tượng InetAdress bằng địa chỉ IP
            InetAddress dcByID=InetAddress.getByName("216.239.38.120");
            System.out.println("Lay dia chi tu IP:"+dcByID);
            //------------------------------------
            InetAddress dcByName1 = InetAddress.getByName("www.vnexpress.net");
            System.out.println("Host Name:" +dcByName1.getHostName());
            System.out.println("Dc IP:" +dcByName1.getHostAddress());
            //---------------------------------------
            InetAddress dcByName2 = InetAddress.getByName("www.vnexpress.net");
            //kiểm tra xem địa chỉ IP có phải IP4 không?
            boolean isIP4 = dcByName2 instanceof java.net.Inet4Address;
            System.out.println(" Có phai IP4 không?" +isIP4);
            //kiểm tra xem địa chỉ IP có phải IP6 không?
            boolean isIP6 = dcByName2 instanceof java.net.Inet6Address;
            System.out.println(" Có phai IP6 không?" +isIP6);
            //---------------------------------------
            URL url = new URL("https://example.com/landing-page?utm_source=company-x&utm_medium=newsletter&utm_campaign=march_01&project-id=123");
            // phân tích thông tin từ URL
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host: "+url.getHost());
            System.out.println("Port: "+url.getPort());
            System.out.println("Path: "+url.getPath());
            System.out.println("Tham chieu: "+url.getRef());
            System.out.println("Truy van: "+url.getQuery());
        }catch(Exception e) {
            
        } 
    }
    
}