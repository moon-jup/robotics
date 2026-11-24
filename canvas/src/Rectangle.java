public class Rectangle implements Shape {
    int xVelocity;
    int yVelocity;
    Point topLeft;
    Point bottomRight;

    public Rectangle(Point topLeft, Point bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public void setBottomRight(Point bottomRight) {
        this.bottomRight = bottomRight;
    }

    public Point getBottomRight() {
        return bottomRight;
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public void draw(char[][] display) {
        Line top = new Line(topLeft, new Point(bottomRight.getX(), topLeft.y));
        Line bottom = new Line(new Point(topLeft.getX(), bottomRight.y), bottomRight);
        Line right = new Line(new Point(bottomRight.getX(), topLeft.getY()), bottomRight);
        Line left = new Line(topLeft, new Point(topLeft.getX(), bottomRight.getY()));

        top.draw(display);
        bottom.draw(display);
        right.draw(display);
        left.draw(display);
    }

    public void update() {
        topLeft.setX(topLeft.getX() + xVelocity);
        topLeft.setY(topLeft.getY() + yVelocity);

        bottomRight.setX(bottomRight.getX() + xVelocity);
        bottomRight.setY(bottomRight.getY() + yVelocity);
    }
}
