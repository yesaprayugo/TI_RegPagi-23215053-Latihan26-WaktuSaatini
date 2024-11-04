/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan5;

/**
 *
 * @author Dell
 */
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class WaktuSaatIni {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, dd MMM yyyy HH:mm:ss", Locale.getDefault());
        String formattedDateTime = now.format(formatter);

        System.out.println("Hari ini adalah hari : " + formattedDateTime);
    }
}