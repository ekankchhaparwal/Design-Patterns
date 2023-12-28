package MediatorPattern;

public class Demo {
    public static void main(String[] args) {
        User ekank = new User("ekank");
        User mody = new User("mody");
        ekank.sendMessage("Hello mody");
        mody.sendMessage("Hey Ekank");

        while(true) {
            System.out.println("Running");
        }
    }
}
