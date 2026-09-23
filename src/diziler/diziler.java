package diziler;

public class diziler {
    public static void main(String[] args){
        String[] ogrenciler = new String[3];
        ogrenciler[0]= "Berra";
        ogrenciler[1]= "İrem";
        ogrenciler[2] ="Melisa";
        for(int i = 0;i<ogrenciler.length;i++){
            System.out.println(ogrenciler[i]);

        }
        System.out.println("-----------------------------");
        String[][] sehirler = new String[3][3];
        sehirler[0][0]= "KONYA";
        sehirler[0][1]="Ankara";
        sehirler[0][2]="Niğde";
        sehirler[1][0]="İstanbul";
        sehirler[1][1]="Bursa";
        sehirler[1][2]="Balıkesir";
        sehirler[2][0]="Şanlıurfa";
        sehirler[2][1]="Gaziantep";
        sehirler[2][2]="Kahramanmaraş";

        for(int i = 0;i<3;i++){
            System.out.println("-------------");
            for(int j = 0;j<3;j++){
                System.out.println(sehirler[i][j]);
            }
        }
    }
}
