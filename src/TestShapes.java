import java.util.ArrayList;
import java.util.List;

/**
 *
 * FIRST, COMPLETE Shape interface
 * THEN, COMPLETE Rectangle, Square, and Circle classes
 * LASTLY, COMPLETE TestShapes class
 */

public class TestShapes {
    public static void main(String[] args) {

        /*
        This will be our actual program that we request some information from user to create 3 objects
        We will create 1 Rectangle, 1 Square and 1 Circle object

        Information to create objects will be as below
         -width of the rectangle = 5.5
         -height of the rectangle = 6
         -side of the square = 2.5
         -radius of the circle = 4


         Then print each object
         And print area and perimeters of each object
         Find and print the object which has the largest area

         EXPECTED OUTPUT:
         Circle{radius=4.0}
         Area of the Circle is = 50.24
         Perimeter of the Circle is = 25.12

         Rectangle{width=5.5, height=6.0}
         Area of the Rectangle is = 33.0
         Perimeter of the Rectangle is = 23.0

         Square{side=2.5}
         Area of the Square is = 6.25
         Perimeter of the Square is = 10.0

         Circle has the largest area as 50.24
         */
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Square square = new Square();

        List<Shape> shapes = new ArrayList<>();

        square.setSide(2.5);
        circle.setRadius(0.5);
        rectangle.setHeight(6);
        rectangle.setWidth(5.5);


        shapes.add(circle);
        shapes.add(rectangle);
        shapes.add(square);

        Shape classMax = null;
        double maxArea = Double.MIN_VALUE;

        for (Shape shape : shapes) {
            String cN = shape.getClass().getSimpleName();
            System.out.println(shape + "\nArea of the " + cN + " is = " + shape.getArea()
                    + "\nPerimeter of the " + cN + " is = " + shape.getPerimeter() + "\n");

            if (shape.getArea() > maxArea){
                maxArea = shape.getArea();
                classMax = shape;
            }
        }

        System.out.println(classMax.getClass().getSimpleName() + " has the largest area as " + maxArea);

    }
}
