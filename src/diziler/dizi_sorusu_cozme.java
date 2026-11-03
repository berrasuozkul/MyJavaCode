package diziler;

import java.util.Random;

public class dizi_sorusu_cozme {
    //0 ile 100 arasında 3'e veya 5'e tam bölünen sayılarla oluşturulmuş
    // 20 elemanlı bir dizi üretiniz.
    public static void main(String[] args){
        int dizi[] = new int[20];
        Random r = new Random();
        for(int i=0; i==0 ; i++){
            int rastgele = r.nextInt(100);
            if (rastgele%3 == 0 || rastgele%5 ==0){
                System.out.println(i);
            }
        }
    }
}
