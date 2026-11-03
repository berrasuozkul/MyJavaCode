package interfaces;

public class Main {
  public static void main(String[] args){
      ICustomerDal IcustomerDal = new MySqlCustomerDal();
      IcustomerDal.add();
      ICustomerDal Icustomerdal = new OracleCustomerDal();
      Icustomerdal.add();
  }
}
