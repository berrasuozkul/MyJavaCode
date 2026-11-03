package Encapsulation;

public class product {
    int id;
     private String name;
    private String desctription;
    private int price;
    private int stockAmount;
     private String kod;
    //getter
    public int getId(){
        return id;
    }
    //setter
    public void setId(int id){
        this.id= id;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesctription() {
        return desctription;
    }

    public void setDesctription(String desctription) {
        this.desctription = desctription;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getKod() {
        return this.name.substring(0,1) + id
                ;
    }

}
