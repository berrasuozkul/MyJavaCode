package Encapsulation;

public class Main {
    public static void main(String[] args) {
        product product = new product();
        product.setId(1);
        product.setName("Mercedes-Benz s400");
        product.setPrice(6000000);
        product.setStockAmount(1000);
        System.out.println(product.id);
        System.out.println(product.getName());
        System.out.println(product.getDesctription());
        System.out.println(product.getPrice());
        System.out.println(product.getStockAmount());
        System.out.println("------------------------------");
        productManeger productManeger = new productManeger();
        productManeger.add(product);
        System.out.println(product.getKod());
    }
    }
