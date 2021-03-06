package Shapes;

public class ShapesTest {

    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5, 4);
        System.out.println(box1.getArea());
        System.out.println(box1.getPerimeter());
        Square box2 = new Square(5);

        System.out.println(box2.getPerimeter());
        System.out.println(box2.getArea());

        Measurable myShape = new Square(5);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

        myShape = new Rectangle(5,4);
        System.out.println("myShape.getPerimeter() = " + myShape.getPerimeter());
        System.out.println("myShape.getArea() = " + myShape.getArea());
    }
}