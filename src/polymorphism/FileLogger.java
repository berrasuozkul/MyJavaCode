package polymorphism;

public class FileLogger extends BaseLogger{
        public void log(String message){
            System.out.println("Loged to file: " +  message);
        }
    }

