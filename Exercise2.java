public class Exercise2 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2, 8);
        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());

        Square square = new Square(4);
        System.out.println("Square Area: " + square.getArea());
        System.out.println("Square Perimeter: " + square.getPerimeter());
    }

    public static class Rectangle {
        private double width;
        private double length;

        public Rectangle(double width, double length) {
            this.width = width;
            this.length = length;
        }

        public double getArea() {
            return width * length;
        }

        public double getPerimeter() {
            return 2 * (width + length);
        }
    }

    public static class Square extends Rectangle {
        public Square(double side) {
            super(side, side);
        }
    }
}