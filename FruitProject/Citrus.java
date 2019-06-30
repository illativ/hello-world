import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Citrus extends Fruit {
    private int vitaminCContent;

    public int getVitaminCContent() {
        return this.vitaminCContent;
    }

    public void setVitaminCContent(int vitaminCContent) {
        this.vitaminCContent = vitaminCContent;
    }

    public Citrus(String name, String color, int vitaminCContent) {
        super(name, color);
        this.vitaminCContent = vitaminCContent;
    }

    @Override
    public void print() {
        System.out.println("This is citrus fruit - " + getName() + ", that contains " + getVitaminCContent() + "% vitamin C, color is " + getColor() + ".");
    }

    @Override
    public void input() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Input new name for a citrus fruit: ");
            setName(br.readLine());
            System.out.print("Input new color for a fruit: ");
            setColor(br.readLine());
            System.out.print("Input new percent of vitamin C in this fruit: ");
            setVitaminCContent(Integer.parseInt(br.readLine()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {

        return "Fruit {" + "name=" + getName() + ", color=" + getColor() + ", contain vitamin C=" + getVitaminCContent() + "}" + "\n";
    }
}
