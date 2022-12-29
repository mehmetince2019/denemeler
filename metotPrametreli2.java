package denemeler;

import java.util.Scanner;

public class metotPrametreli2 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen Adinizi giriniz ");
        String adiniz = scan.next();

        selemlama(adiniz);
            
    
    }
    
    static void selemlama(String kime){
        System.out.println("nasilsin" +kime);
    }

}
