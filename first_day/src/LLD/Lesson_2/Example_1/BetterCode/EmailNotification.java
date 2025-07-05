package LLD.Lesson_2.Example_1.BetterCode;

public class EmailNotification implements Notification{

    @Override
    public void send() {
        System.out.println("Sending Email...");
    }
}
