package FaisalMemon.couplingDemo;

import FaisalMemon.couplingDemo.LooseCoupling.EmailNotificationService;
import FaisalMemon.couplingDemo.LooseCoupling.NotificationService;
import FaisalMemon.couplingDemo.TightCoupling.UserService;

public class AppMain {
    public static void main(String[] args) {
        //Tight
        UserService userService = new UserService();
        userService.notifyUser("Hii dosto");

        //Loose
        NotificationService emailNotificationService = new EmailNotificationService();
        FaisalMemon.couplingDemo.LooseCoupling.UserService userService1 = new FaisalMemon.couplingDemo.LooseCoupling.UserService(emailNotificationService);
        userService1.notifyUser("Order Placed ");
    }
}
