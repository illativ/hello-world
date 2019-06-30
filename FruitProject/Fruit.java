import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fruit {
    private String name;
    private String color;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fruit(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void print() {
        System.out.println("This is - " + getName() + ", color is " + getColor() + ".");
    }

    public void input() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Input new name for a fruit: ");
            this.name = br.readLine();
            System.out.print("Input new color for a fruit: ");
            this.color = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Fruit {" + "name=" + getName() + ", color=" + getColor() + "}" + "\n";
    }
}
