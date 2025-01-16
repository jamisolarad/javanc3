package chapter5;

public class Tasksheet128 {
    
    public interface Shape {
        double calculateArea();
        double calculatePerimeter();
    }

    public static abstract class AbstractShape implements Shape {
        protected String color;
        protected double length;
        protected double width;

        public AbstractShape(String color, double length, double width) {
            this.color = color;
            this.length = length;
            this.width = width;
        }
        @Override
        public double calculateArea() {
            return Math.PI * length * length; 
        }

        
        @Override
        public double calculatePerimeter() {
            return 2 * Math.PI * length;
        }
    }

    public static class Circle extends AbstractShape {
        private double radius;

        public Circle (String color, double radius){
            super(color,0, 0);
            this.radius = radius;
        }

        @Override
        public double calculateArea() {
            return Math.PI * radius * radius;
        }

        @Override
        public double calculatePerimeter() {
            return 2 * Math.PI * radius;
        }
    }

    public static class Rectangle extends AbstractShape {
        public Rectangle (String color, double length, double width) {
            super(color, length, width);
        }

        @Override
        public double calculateArea() {
            return length * width;
        }

        @Override
        public double calculatePerimeter() {
            return 2 * (length + width);
        }
    }

        public static void main(String[] args) {
            Circle circle = new Circle("Yellow", 7);
            Rectangle rectangle = new Rectangle("White", 3, 6);
        
            System.out.println("Area of a Circle: " + circle.calculateArea());
            System.out.println("Perimeter of a Circle: " + circle.calculatePerimeter());

            System.out.println("");

            System.out.println("Area of a Rectangle: " + rectangle.calculateArea());
            System.out.println("Perimeter of a Rectangle: " + rectangle.calculatePerimeter());
    }
    
}
