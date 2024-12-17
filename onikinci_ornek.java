package JAVA101;
import java.util.Scanner;
public class onikinci_ornek {
    public static void main(String[] args) {
        int a , b , c ;
        Scanner input = new Scanner(System.in);

        System.out.println("İlk Sayıyı Giriniz: ");
        a = input.nextInt();

        System.out.println("İkinci Sayıyı Giriniz: ");
        b = input.nextInt();

        System.out.println("Üçüncü Sayıyı Giriniz: ");
        c = input.nextInt();

        if ( (a < b) && (a < c) ){
            System.out.println("En Küçük Sayı: "+a);

        } else if ( (b < c) && (b < a) ) {
            System.out.println("En Küçük Sayı: "+b);

        }else {
            System.out.println("En Küçük Sayı: "+c);
        }
    }
}
