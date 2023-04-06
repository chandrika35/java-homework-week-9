package java_homework_week_9;

import java.util.ArrayList;
/**
 * 7. Write a Java program to test if an array list is empty or not.
 */
public class Program7 {

    public static void IsArrayListEmpty(){
        ArrayList<String> area = new ArrayList<>();
        //creating an array list of area of London
        area.add("Harrow");
        area.add("Wembley");
        area.add("Watford");
        area.add("Stanmore");
        area.add("Pinner");
        area.add("Hatchend");
        area.add("Carpenders Park");
        System.out.println("Original array list:"  +  area);
        System.out.println("Checking the above array list is empty or not!" );
        System.out.println(area.isEmpty());
        //array list is not emtpty so, statement shows 'false' value
        area.removeAll(area);
        //removes all the elements from the array list
        System.out.println("Array list after removing all elements" + area);
        //list is empty now
        System.out.println("Checking the above array list is empty or not!" );
        System.out.println(area.isEmpty());
//Array list is empty so, statement shows 'true' value
    }

    public static void main(String[] args) {
        IsArrayListEmpty();
//calling the method IsArrayListEmpty in the main method
    }
}
