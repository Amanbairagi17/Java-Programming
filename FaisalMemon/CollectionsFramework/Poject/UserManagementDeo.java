package FaisalMemon.CollectionsFramework.Poject;

import java.util.*;

public class UserManagementDeo {
    public static void main(String[] args) {
        Set<String> roles = new HashSet<>(Arrays.asList("Admin","Users","Manager"));
        List<Users> users = new ArrayList<>();

        Users user1 = new Users("Aman", true,
                new HashSet<>(Arrays.asList("Manager")));
        Users user2 = new Users("Kanha", false,
                new HashSet<>(Arrays.asList("Admin")));
        Users user3 = new Users("Ram", true,
                new HashSet<>(Arrays.asList("User")));
        Users user4 = new Users("Baba", false,
                new HashSet<>(Arrays.asList("User")));

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);

        Iterator<Users> it = users.iterator();
        while (it.hasNext()){
            if (!it.next().isActive())it.remove();
            System.out.println(it.next().getNames());
        }

        System.out.println("Active Users");
        for(Users user : users){
            System.out.println(user.getRoles());
        }

        // Count users per roles
        Map<String, Integer> roleCount = new HashMap<>();
        for (Users user : users){
            for (String role : user.getRoles()){
                roleCount.put(role, roleCount.getOrDefault(role,0)+1);
            }
        }

        // visit map
        for(String key : roleCount.keySet()){
            System.out.println(key +" : " +roleCount.get(key));
        }
    }
}
