public class Main {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        Rectangle a = new Rectangle(new Point(0, 5), new Point(5, 1));
        a.xVelocity = 2;
        a.yVelocity = 1;
        canvas.addShape(a);

        while (true) {
            canvas.draw();

            // this will make the pc wait for a second beforee continuing.
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                break;
            }
        }
    }
}
