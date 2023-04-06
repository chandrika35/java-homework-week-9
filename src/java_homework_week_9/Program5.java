package java_homework_week_9;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * 5. Write a Java program to iterate through all elements in an array list using Iterator.
 */

public class Program5 {
    public static void main(String[] args) {//calling the method to the main method
        Iterator();

    }

    public static void Iterator(){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        numbers.add(500);
        numbers.add(600);
        numbers.add(700);
        numbers.add(800);
        numbers.add(900);
        numbers.add(1000);

        System.out.println("ArrayList: " + numbers);
        // Creating an instance of ListIterator
        ListIterator<Integer> iterate = numbers.listIterator();
        System.out.println("Iterating over ArrayList using Iterator:");
        while(iterate.hasNext()) {
            System.out.print(iterate.next() + ", ");
        }
    }

}
