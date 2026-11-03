package inheritencee2;

public class Main {
    public static void main(String[] args){
    BaseKrediManager BaseKrediManager = new BaseKrediManager();
    BaseKrediManager.krediHesapla();
    krediUI krediUI = new krediUI();
    krediUI.krediUI(BaseKrediManager);
}
}