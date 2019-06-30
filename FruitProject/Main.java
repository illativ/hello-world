import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Fruit> fruits = new ArrayList<Fruit>();

        fruits.add(new Fruit("Peach", "Orange"));
        fruits.add(new Citrus("Lemon", "Yellow", 15));
        fruits.add(new Citrus("Grapefruit", "Orange", 10));
        fruits.add(new Fruit("Apple", "Green"));
        fruits.add(new Citrus("Pomelo", "Yellow", 12));

        // Fruits which color is Yellow

        for (int i = 0; i < fruits.size(); i++) {
            if (fruits.get(i).getColor().equals("Yellow")) {
                System.out.print(fruits.get(i));
            }
        }

        // Sorted fruits by name and output in a file

        System.out.println("----------------------------------------------------------");

        fruits.sort(new FruitsComparator());

        File file = new File("sortedFruits.txt");

        try (FileOutputStream fileOutputStream = new FileOutputStream(file)) {
            byte[] bytes = fruits.toString().getBytes();
            fileOutputStream.write(bytes);
            fileOutputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Fruits sorted by name and recorded in a file.");
        System.out.println("----------------------------------------------------------");

        // methods print() and input()

        for (int i = 0; i < fruits.size(); i++) {
            fruits.get(i).input();
        }

        System.out.println();

        for (Fruit f : fruits) {
            f.print();
        }


    }
}
