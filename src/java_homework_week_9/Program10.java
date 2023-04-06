package java_homework_week_9;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 10. Write a programme that tells you which line passes through particular stations.
 * Just use Zone 1 stations name.
 */

public class Program10 {
    public static void main(String[] args) {
        char result;

        System.out.println(" Zone 1 Station list : ");
        System.out.println("");
        System.out.println("ALDGATE, EUSTON SQUARE, OXFORD CIRCUS, WATERLOO LU, TOWER HILL, OLD STREET,");
        System.out.println("SOUTH KENSINGTON, VICTORIA LU, LANCASTER GATE, GREEN PARK, FARRINGDON, EDGWARE ROAD,");
        System.out.println("QUEENSWAY, KINGS CROSS ST PANCRAS LU, VAUXHALL LU, EUSTON LU, BAYSWATER, ANGEL, PADDINGTON LU,");
        System.out.println("BAKERSTREET, KNIGHTBRIDGE, CHARING CROSS LU, GLOUCESTER ROAD, REGENTS PARK, HYDE PARK CORNER,");
        System.out.println("LEICESTER SQUARE, LONDON BRIDGE LU, PICCADILLY CIRCUS, MOORGATE, ST PAUL'S, WESTMINSTER, HOLBORN,");
        System.out.println("COVENT GARDEN, BOND STREET, MARBLE ARCH, TOTTENHAM COURT ROAD, RUSSELL SQUARE,");

        System.out.println("");

        HashMap<String, String> zone1 = new HashMap<String, String>();
        zone1.put("ALDGATE", "Circle/Metropolitan");
        zone1.put("ANGEL", "Northern");
        zone1.put("BAKERSTREET", "Bakerloo/Circle/Hammersmith & City/Jubilee/Metropolitan");
        zone1.put("BAYSWATER", "Circle/District");
        zone1.put("BOND STREET", "Circle/Jubilee");
        zone1.put("CHARING CROSS LU", "Northern/Bakerloo");
        zone1.put("COVENT GARDEN", "Piccadilly");
        zone1.put("EDGWARE ROAD", "Circle/District/Hammersmith & City");
        zone1.put("EUSTON LU", "Victoria/Northern");
        zone1.put("EUSTON SQUARE", "Metropolitan/Hammersmith & City/Circle");
        zone1.put("FARRINGDON", "Circle/Hammersmith & City/Metropolitan");
        zone1.put("GLOUCESTER ROAD", "District/Circle/Piccadilly");
        zone1.put("GREEN PARK", "Jubilee/Piccadilly/Victoria");
        zone1.put("HOLBORN", "Central/Piccadilly");
        zone1.put("HYDE PARK CORNER", "Piccadilly");
        zone1.put("KINGS CROSS ST PANCRAS LU", "Circle/Piccadilly/Hammersmith & City/Northern/Metropolitan/Victoria");
        zone1.put("KNIGHTBRIDGE", "Piccadilly");
        zone1.put("LANCASTER GATE", "Central");
        zone1.put("LEICESTER SQUARE", "Northern/Piccadilly");
        zone1.put("LONDON BRIDGE LU", "Northern/Jubilee");
        zone1.put("MARBLE ARCH", "Central");
        zone1.put("MOORGATE", "Circle/Hammersmith & City/Metropolitan/Northern");
        zone1.put("OLD STREET", "Northern");
        zone1.put("OXFORD CIRCUS", "Bakerloo/Central/Victoria");
        zone1.put("PADDINGTON LU", "Hammersmith & City/Bakerloo/District/Circle");
        zone1.put("PICCADILLY CIRCUS", "Piccadilly/Bakerloo");
        zone1.put("QUEENSWAY", "Central");
        zone1.put("REGENTS PARK", "Bakerloo");
        zone1.put("RUSSELL SQUARE", "Piccadilly");
        zone1.put("SOUTH KENSINGTON", "District/Circle/Piccadilly");
        zone1.put("ST PAUL'S", "Central");
        zone1.put("TOTTENHAM COURT ROAD", "Central/Northern");
        zone1.put("TOWER HILL", "District/Circle");
        zone1.put("VAUXHALL LU", "Victoria");
        zone1.put("VICTORIA LU", "District/Circle");
        zone1.put("WATERLOO LU", "Bakerloo/Jubilee/Northern");
        zone1.put("WESTMINSTER", "Circle/District/Jubilee");

        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter any station name from above list:");

            String name1 = input.nextLine();
            name1 = name1.toUpperCase();

            for (String i : zone1.keySet()) {
                if (name1.equals(i)) {
                    System.out.println("Tube Lines Available  : " + zone1.get(i));
                }
            }
            System.out.println("Do you want to try again : 'Y' or 'N' ");
            result = input.next().charAt(0);
        } while (result == 'Y' || result == 'y');

    }

}
