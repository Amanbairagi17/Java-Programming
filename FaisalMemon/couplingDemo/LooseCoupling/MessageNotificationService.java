package FaisalMemon.couplingDemo.LooseCoupling;

public class MessageNotificationService implements NotificationService{
    @Override
    public void send(String msg) {
        System.out.println("Notification from SMS" +msg);
    }
}
