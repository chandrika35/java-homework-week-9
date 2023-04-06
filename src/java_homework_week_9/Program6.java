package java_homework_week_9;

import java.util.ArrayList;
import java.util.List;

/**
 * 6. Write a Java program to retrieve an element (at a specified index) from a given array list
 */

public class Program6 {
    public static void main(String[] args) {
        Retrieve();
    }
    public static void Retrieve(){
        // Create a list and add some City names to the list
        List<String> list = new ArrayList<>();
        list.add("Ahmedabad");
        list.add("Baroda");
        list.add("Chandigarh");
        list.add("Bombay");
        list.add("Delhi");
        list.add("Lucknow");
        list.add("Jaipur");
        list.add("Udaipur");
        // Print the list
        System.out.println(list);
        // Retrieve the fifth and seventh element from the array list
        String element = list.get(5);
        System.out.println("First element: "+element);
        element = list.get(7);
        System.out.println("Third element: "+element);
    }
}



