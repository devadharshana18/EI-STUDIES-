import java.util.ArrayList;
import java.util.List;

// Component interface
interface Graphic {
    void draw();
}

// Leaf
class Button implements Graphic {
    private String name;

    public Button(String name) {
        this.name = name;
    }

    @Override
    public void draw() {
        System.out.println("Drawing button: " + name);
    }
}

// Leaf
class Panel implements Graphic {
    private List<Graphic> graphics = new ArrayList<>();
    
    public void add(Graphic graphic) {
        graphics.add(graphic);
    }

    public void remove(Graphic graphic) {
        graphics.remove(graphic);
    }

    @Override
    public void draw() {
        System.out.println("Drawing panel:");
        for (Graphic graphic : graphics) {
            graphic.draw();
        }
    }
}

// Main
public class CompositePatternDemo {
    public static void main(String[] args) {
        Button button1 = new Button("OK");
        Button button2 = new Button("Cancel");

        Panel panel = new Panel();
        panel.add(button1);
        panel.add(button2);

        Panel mainPanel = new Panel();
        mainPanel.add(panel);

        mainPanel.draw();
    }
}
