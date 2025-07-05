package LLD.Lesson_2.Example_1.BetterCode;

import LLD.Lesson_2.Example_1.ProblematicCode.NotificationType;

import java.util.List;

public class NotificationSender {

    public void sendNotifications(List<Notification> notifications) {
        for(Notification notification : notifications) {
            notification.send();
        }
    }
}
