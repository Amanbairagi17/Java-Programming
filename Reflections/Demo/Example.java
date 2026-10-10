package Reflections.Demo;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Example {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        Cat myCat = new Cat("Stella", 6);

//        This for filed  of class
//        Field[] myFiled = myCat.getClass().getDeclaredFields();
//
//        for (Field cat : myFiled){
//            if(cat.getName().equals("name")){
//                cat.setAccessible(true);
//                cat.set(myCat, "Mic Gilla");
//            }
//
//        }
//        System.out.println(myCat.getName());

        // This for method of class
        Method[] myMethods = myCat.getClass().getDeclaredMethods();

        for(Method method : myMethods){
//            if(method.getName().equals("meow")){
//                method.setAccessible(true);// we can call public method without refection
//                method.invoke(myCat);
//            }

            if(method.getName().equals("newMethodName")){
                method.setAccessible(true);
                method.invoke(myCat);
            }
           //System.out.println(method.getName());
        }

    }
}
