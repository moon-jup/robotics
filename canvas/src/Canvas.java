import java.util.ArrayList;

public class Canvas {
    ArrayList<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape)
    {
        shapes.add(shape);
    }

    public void draw() {
        char[][] display = new char[20][40];

        for (int i = 0; i < display.length; i++) {
            for (int j = 0; j < display[i].length; j++) {
                display[i][j] = ' ';
            }
        }

        for (Shape shape : shapes) {
            shape.update();
            shape.draw(display);
        }

        for (int y = 19; y >= 0; y--) {
            for (int x = 0; x < 40; x++) {
                System.out.print(display[y][x]);
            }
            System.out.println();
        }
    }
}
