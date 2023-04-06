package java_homework_week_9;

import java.util.ArrayList;

/**
 * 11. Declare following two array list and compare it.
 * ArrayList<String> c1= new ArrayList<String>();
 * c1.add("Red");
 * c1.add("Green");
 * c1.add("Black");
 * c1.add("White");
 * c1.add("Pink");
 * ArrayList<String> c2= new ArrayList<String>();
 * c2.add("Red");
 * c2.add("Green");
 * c2.add("Black");
 * c2.add("Pink");
 */

public class Program11 {
    public static void main(String[] args) {
        comparison();
    }


    public static void comparison(){
        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        ArrayList<String> c2 = new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");
//store the comparison out put in ArrayList
        ArrayList<String> compare = new ArrayList<>();
        for(String arr : c1){
            compare.add(c2.contains(arr) ? "Yes" : "No");
            System.out.println(compare);
        }

    }
}
