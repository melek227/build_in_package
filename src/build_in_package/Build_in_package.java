/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package build_in_package;

//aynı dosyanın altındaki classlara erişebiliriz
//konuyla ilgili hangi classı aradığımızda hangi pakete gideceğimizi biliriz
//bir paketi başka projelerde de kullanabiliriz
//src klasörünün altında main classı var
//bu klasöre başka classlar eklediğimizde de aynı src klasörünün altında oldukları için erişim sağlayabiliriz
//javada tanımlı paketler vardır
//bu paketler built-in paketlerdir
//paketleri javada katmanlı yapı oluşturmak için kullanırız


import java.util.Scanner;//kullanıcıdan bilgi almayı sağlayan paket
//konsol ekranında kullanıcıdan data okur


public class Build_in_package {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in); 

        System.out.println("Adınız:");
        String isim=scanner.nextLine(); //kullanıcının girdiği değeri okuruz
        System.out.println("Merhaba" +isim);
        
        
        
        
    }
    
}
