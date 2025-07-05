package LLD.Lesson_2.Example_1.BetterCode;

public class SmsNotification implements Notification{
    @Override
    public void send() {
        System.out.println("Sending SMS...");
    }
}
