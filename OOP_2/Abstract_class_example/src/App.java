// Abstraction is a process of hiding the implementation details and showing only 
// functionality to the user.


public class App {
    public static void main(String[] args) throws Exception {

        // Abstract class cannot be used to create objects
        // Shape shape = new Shape();

        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Ractangle ractangle = new Ractangle();

        circle.draw();
        triangle.draw();
        ractangle.draw();
    }
}
