public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double initLength, double initWidth) {
        this.length = initLength;
        this.width = initWidth;
    }

    public double calculateArea() {
        double area = this.length * this.width;
        return area;
    }

    public double calculatePerimeter() {
        double perimeter = (2 * this.length) + (2 * this.width);
        return perimeter;
    }    

    public void print() {
        System.out.println(this.calculateArea());
        System.out.println(this.calculatePerimeter());
    }

    public boolean compareRectangles(Rectangle r2) {
        double area1 = this.calculateArea();
        double area2 = r2.calculateArea();
        if (area2 < area1) {
            return true;
        }
        return false;
    }

    public boolean isSquare() {
        if (this.length == this.width) {
            return true;
        }
        return false;
    }

    public static void main (String[] args) {
        Rectangle r1 = new Rectangle(5,7);
        Rectangle r2 = new Rectangle(6,6);
        Rectangle r3 = new Rectangle(5,5);
        r1.print();
        r2.print();
        r3.print();
        System.out.println(r1.compareRectangles(r2));
        System.out.println(r1.compareRectangles(r3));
        System.out.println(r2.compareRectangles(r3));
        System.out.println(r1.isSquare());
        System.out.println(r2.isSquare());
        System.out.println(r3.isSquare());
    }
}