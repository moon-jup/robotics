public class Line implements Shape {
    int xVelocity;
    int yVelocity;
    Point start;
    Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public void draw(char[][] display) {
        if (start.getX() == end.getX()) {
            for (int y = Math.min(start.getY(), end.getY()); y <= Math.max(start.getY(), end.getY()); y++) {
                display[y][start.getX()] = '*';
            }
        }
        else if (start.getY() == end.getY()) {
            for (int x = Math.min(start.getX(), end.getX()); x <= Math.max(start.getX(), end.getX()); x++) {
                display[start.getY()][x] = '*';
            }
        }
    }

    public void update() {
        start.setX(start.getX() + xVelocity);
        start.setY(start.getY() + yVelocity);

        end.setX(end.getX() + xVelocity);
        end.setY(end.getY() + yVelocity);
    }
}
