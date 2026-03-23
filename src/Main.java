import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        //1.
        int sonuc = karesiniAl(4);
        System.out.println("karesi: " + sonuc);
        //2.
        boolean sonuc2 = ciftMi(7);
        System.out.println("çift mi: "+ sonuc2);
        //3.
        int sonuc3 = buyukSayi(9, 11);
        System.out.println("büyük olan: " + sonuc3);
        //4.
        int sonuc4 = uzunluk("deneme");
        System.out.println("karakter satyısı: " + sonuc4);
        //5.
        boolean sonuc5 = asalMi(9);
        System.out.println("asal mi: " + sonuc5);
        //bonus.
        int sonuc6 = toplam(7);
        System.out.println("sayıların toplamı: " + sonuc6);



    }
    //1. Sayının karesini döndüren metot
    public static int karesiniAl(int num1){
        int karesi = num1*num1;
        return karesi;
    }
    //return num1 * num1;
//--------------------------------------------------------
    //2. Sayı çift mi kontrol eden metot
    public static boolean ciftMi(int num2){
        if(num2 %2 ==0){
            return true;
        }
        else{
            return false;
        }
    }
    //return num2 % 2 == 0;
//--------------------------------------------------------
    //3. İki sayının büyüğünü döndüren metot
    public static int buyukSayi(int a, int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }
    //return a > b ? a : b;
//--------------------------------------------------------
    //4. Kelimenin uzunluğunu döndüren metot
    public static int uzunluk(String kelime){
        int karakterSay = kelime.length();
        return karakterSay;
    }
    //return kelime.length();
//--------------------------------------------------------
    //5. Sayı asal mı kontrol eden metot
    public static boolean asalMi(int sayi){
        boolean asalMiacaba = false;
        for(int i = 2 ; i<sayi ; i++){
            if(sayi %i == 0){
                asalMiacaba = false;
                break;
            }
            else{
                asalMiacaba = true;
            }
        }
        return asalMiacaba;
    }
    //bonus: 1 ile n arasındaki sayıların toplamını döndüren metot
    public static int toplam(int n){
        int nToplam = 0;
        for(int i = 1; i <= n; i++){
            nToplam = nToplam + i;
        }
        return nToplam;
    }

}


