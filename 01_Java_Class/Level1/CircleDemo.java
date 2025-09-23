package Level1;
public class CircleDemo {
    static class Circle {
        double radius;

        Circle(double radius) {
            this.radius = radius;
        }

        double calculateArea() {
            return Math.PI * radius * radius;
        }

        double calculateCircumference() {
            return 2 * Math.PI * radius;
        }

        void display() {
            System.out.println("Radius: " + radius + ", Area: " + calculateArea() + ", Circumference: " + calculateCircumference());
        }
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        Circle c2 = new Circle(7);

        c1.display();
        c2.display();
    }
}
