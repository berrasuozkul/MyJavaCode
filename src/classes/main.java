package classes;

public class main {
    public static void main(String[]args){
        //reference type
        customerManager customerManager = new customerManager();
        /*customerManager.add();
        customerManager.remove();
        customerManager.update();*/
        customerManager.tc = 12121211;
        customerManager.name = "Berra";
        customerManager.soyad = "özkul";
        customerManager.nereli = "Konya";
        customerManager.id = 999999;
        System.out.println(customerManager.tc);
        //classların en önemli özelliği gruplamasıdır
        //classlar referans tiptir
        //diziler referans tiptir
        //classların en temel özelliği ortak özellikleri tutmak
        // | veya demek & ve demek

    }
}
//public halka açık yani herkes erişim sağlayabilir.Private ise sadece tab-nımlandığı blokta geçerli blok harici
//erişime kapalı.diğer sınıfta tanımlayabilmen de için get ya da set ıd seklinde tanımlamalısın