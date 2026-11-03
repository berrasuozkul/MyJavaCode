package degiskenler;

public class a{
    public static void main(String[] args) {
        String mesaj = "hello cnm";
         String yeniMesaj = mesaj.substring(0,2);
        System.out.println(yeniMesaj);
        String yepyeniMesaj = sehirVer();
        System.out.println(yepyeniMesaj);
        int yepisyeniMesaj = topla(10,2);
        System.out.println(yepisyeniMesaj);
    }
    public static void güncelle(){
        System.out.println("güncellendi");
    }
    public static String sehirVer(){
        return"Ankara";
    }
    public static int topla(int i ,int ii){
        return i+i;
    }
}
