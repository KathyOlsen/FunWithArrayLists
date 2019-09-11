import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void  main(String[] args){
        ArrayList<String> colors = new ArrayList<>();
        colors.add("mauve");
        colors.add("cyan");
        colors.add("crimson");
        colors.add("cerulean");
        colors.add("aquamarine");

        System.out.println(colors);

        System.out.println(colors.get(1));

        Scanner key = new Scanner(System.in);
        String another = "";
        while(!another.equalsIgnoreCase("q")){
            System.out.println("Please enter a color: ");
            String newColor = key.nextLine();
            colors.add(newColor);
            System.out.println("Do you want enter another color or quit? (a/q)" );
            another = key.nextLine();
        }

        System.out.println(colors);
    }
}
