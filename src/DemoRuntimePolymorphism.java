
class Shape {
    public void draw() {
        System.out.println("drawing...");
    }
}

class Circle extends Shape {
    public void draw() {
        System.out.println("drawing circle...");
    }
}

class Rectangle extends Shape {
    public void draw() {
        System.out.println("drawing rectangle...");
    }
}

class Triangle extends Shape {
    public void draw() {
        System.out.println("drawing Triangle...");
    }
}

public class DemoRuntimePolymorphism {

    public static void main(String[] args) {
        Shape shape;

        shape = new Triangle();
        shape.draw();

        shape = new Rectangle();
        shape.draw();

        shape = new Circle();
        shape.draw();
    }

}
