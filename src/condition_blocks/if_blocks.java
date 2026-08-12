package condition_blocks;

import java.util.Scanner;

public class if_blocks {
    //üç sayı yazdırıp aralarından en büyük sayıyı bulduralım.
    public static void main (String[] args){
        int a,b,c;
        Scanner scan = new Scanner(System.in);
        System.out.println("ilk sayıyı giriniz");
        a = scan.nextInt();
        System.out.println("ikinci sayıyı giriniz");
        b = scan.nextInt();
        System.out.println("üçüncü sayıyı giriniz");
        c = scan.nextInt();
        if (b>a && b>c){
            System.out.println("en büyük sayı: " + b );
        } else if (c>a && c>b){
            System.out.println("en büyük sayı: " + c);
        } else {
            System.out.println("en büyük sayı: " + a);
        }
    }
}
