package FaisalMemon.couplingDemo.LooseCoupling;

public class EmailNotificationService implements NotificationService{
    @Override
    public void send(String msg) {
        System.out.println("Notification from mail : "+msg);
    }
}
