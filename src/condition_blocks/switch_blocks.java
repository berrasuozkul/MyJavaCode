package condition_blocks;

public class switch_blocks {
    public static void main(String[] args){
        char grade = 'k';
        switch (grade){
            case 'A':
                System.out.println("mükemmel, geçtiniz.");
                break;
            case 'B' :
                System.out.println("tebrikler, geçtiniz.");
                break;
            case 'C':
                System.out.println("güzel, geçtiniz.");
                break;
            case'D':
                System.out.println("geçtiniz.");
                break;
            case'F':
                System.out.println("kaldınız.");
                break;
            default:
                    System.out.println("geçersiz.");
        }
    }
}
