package java_homework_week_9;

import java.util.HashMap;
import java.util.Map;

/**
 * 9. Create a HashMap object called people that will store String keys and Integer values:
 * And use for each loop to iterate the value from Map.
 */

public class Program9 {
    String i;
    Integer x;

    public static void HashMap() {
        Map<String, Integer> people = new HashMap<String, Integer>();

        //Add keys and values (Name, ID)
        people.put("Sara", 100);
        people.put("Esha", 200);
        people.put("Disha", 300);
        people.put("Rekha", 400);
        people.put("Rama", 500);
        people.put("Kiron", 600);

        for (String i : people.keySet()) {

            System.out.println("Name: " + "  " + i + "  " + "ID:" + "   " + people.get(i));
        }
    }

    public static void main(String[] args) {

        HashMap();
    }
}