/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tools;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author admin
 */
public class Tools {

    private static String getContentFrom(String link) throws IOException {
        // Gởi HTTP request và nhận về kết quả là chuỗi các thẻ HTML
        URL url = new URL(link);
        Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
        scanner.useDelimiter("\\\\Z");
        String content = scanner.next();
        scanner.close();
        // xoá các ký tự ngắt dòng (xuống dòng)
        content = content.replaceAll("\\\\R", "");
        return content;
    }

    private static List<String> getLinksFromMenu(String content, String menuPattern) {
        // Regex
        List<String> links = new ArrayList<>();
        Pattern p = Pattern.compile(menuPattern);
        Matcher m = p.matcher(content);
        while (m.find()) {
            Pattern p2 = Pattern.compile("<li class='lv1'><a href='(.*?)' class='haslink '>");
            Matcher m2 = p2.matcher(m.group(1));
            while (m2.find()) {
                links.add(m2.group(1));
            }
        }
        return links;
    }

    public static void main(String[] args) throws IOException {
        String content = getContentFrom("<https://batdongsan.com.vn>");
        String sellMenuPattern = "<li class='lv0'><a href='/nha-dat-ban' class='haslink '>Nhà đất bán</a><ul>(.*?)</ul>";
        List<String> sellLinks = getLinksFromMenu(content, sellMenuPattern);
        String rentalMenuPattern = "<li class='lv0'><a href='/nha-dat-cho-thue' class='haslink '>Nhà đất cho thuê</a><ul>(.*?)</ul>";
        List<String> rentalLinks = getLinksFromMenu(content, rentalMenuPattern);
        System.out.println(sellLinks);
        System.out.println(rentalLinks);
    }

}
