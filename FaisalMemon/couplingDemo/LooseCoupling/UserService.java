package FaisalMemon.couplingDemo.LooseCoupling;

public class UserService {
    NotificationService notificationService;

    public UserService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void notifyUser(String msg){
        System.out.println("Notification from : "+msg);
    }
}
