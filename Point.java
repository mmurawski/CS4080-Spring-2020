public class Point {

    float xCoord;
    float yCoord;

    public Point(float x, float y) {
        this.xCoord = x;
        this.yCoord = y;
    }

    public float currentX() {
        return this.xCoord;
    }

    public float currentY() {
        return this.yCoord;
    }

    public void returnLocation() {
        System.out.println("Current point is: (" + this.xCoord + " ," + this.yCoord + ")");
    }

    public void shiftPoint(float x, float y) {

        this.xCoord = this.xCoord + x;
        this.yCoord = this.yCoord + y;
    }

    public static void main(String args[]) {

        Point current = new Point(1, 5);
        float xCoord = current.xCoord;
        float yCoord = current.yCoord;

        current.shiftPoint(3, 2);
        current.returnLocation();

        Runtime run = Runtime.getRuntime();
        run.gc();
        long memory = run.totalMemory() - run.freeMemory();

        System.out.println("Memory usage of object creation: " +  memory);
    }
}
