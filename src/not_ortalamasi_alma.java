import java.util.Scanner;

public class not_ortalamasi_alma {
    public static void main(String[] args) {
        int vize, odev, fin;
        Scanner scan = new Scanner(System.in);
        System.out.println("vize notunuzu giriniz: ");
        vize = scan.nextInt();
        System.out.println("ödev notunuzu giriniz: ");
        odev = scan.nextInt();
        System.out.println("final notunuzu giriniz: ");
        fin = scan.nextInt();
        float ort = (float)(vize*0.375) + (float)(odev*0.125) + (float)(fin*0.5);
        System.out.println("ortalama= " + ort);
        if(ort>=60){
            System.out.println("tebrikler,geçtiniz!");
        }else {
            System.out.println("maalesef,bütünlemeye kaldiniz.");
            System.out.println("bütünleme notunuzu giriniz: ");
            int bütünleme = scan.nextInt();
            ort = (float)(vize*0.375) + (float)(odev*0.125) + (float)(bütünleme*0.5);
            System.out.println("bütünleme sonrası yeni ortalamaniz: ");
        }
        if (ort>=60){
            System.out.println("Bütünlemeyle geçtiniz");
        }else{
            System.out.println("Bütünlemeyle kaldiniz");
        }
    }
}
