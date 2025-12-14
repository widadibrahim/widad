import java.awt.*;

public abstract class Shape {

    // Shared fields
    protected int x;
    protected int y;
    protected int width;
    protected int height;
    protected Color color;

    public Shape(int x, int y, int width, int height, Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    // Common behaviour
    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public abstract void draw(Graphics g);

    public abstract boolean contains(Point p);
}
