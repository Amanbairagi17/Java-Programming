package FaisalMemon.CollectionsFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratingDemo {
    public static void main(String[] args) {
        List<String> users = new ArrayList<>();
        users.add("Alice");
        users.add("Bob");
        users.add("charlie");
        users.add("Emway");

        //using for loop
        System.out.println("Using for loop");
        for(int i=0 ; i<users.size() ; i++){
            System.out.println(users.get(i));
        }

        //For each loop
        System.out.println("Using enhanced for loop");
        for(String user : users){
            System.out.println(user);
        }

        //Iterator
        System.out.println("Using Iterator ");
        Iterator<String> it = users.iterator();
        while (it.hasNext())
        {
            //System.out.println(it.next());
            if (it.next().equals("Bob")) it.remove();
        }

        //List Iterator backward traversal
        System.out.println("Reverse using List Iterator ");
        ListIterator<String> listIterator = users.listIterator(users.size());
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }

        // List Iterator Forward traversal
        System.out.println("Forward traversal using list Iterator");
        ListIterator<String> listIterator1 = users.listIterator(0);
        while (listIterator1.hasNext()){
            System.out.println(listIterator1.next());
        }





    }
}
