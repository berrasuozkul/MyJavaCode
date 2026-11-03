package polymorphism;

public class Main {
    public static void main(String [] args){
        BaseLogger[] logers = new BaseLogger[]{new DatabaseLogger() , new EmailLogger(), new FileLogger()};
        for(BaseLogger logger:logers){
            logger.log("log mesajı");
        }
    }

      }

