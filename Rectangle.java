import java.awt.*;

public class Rectangle extends Shape {

    public Rectangle(int x, int y, int width, int height, Color color) {
        super(x, y, width, height, color);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }

    @Override
    public boolean contains(Point p) {
        return p.x >= x && p.x <= x + width
            && p.y >= y && p.y <= y + height;
    }
}
