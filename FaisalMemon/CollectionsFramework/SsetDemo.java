package FaisalMemon.CollectionsFramework;

import java.util.HashSet;
import java.util.Set;

public class SsetDemo {
    // Duplicates not allowed
    // insertion order not maintain
    public static void main(String[] args) {
        Set<String> roles = new HashSet<>();
        roles.add("Manager");
        roles.add("Admin");
        roles.add("User");
        //roles.add("Manager");

        System.out.println(roles);
    }
}
