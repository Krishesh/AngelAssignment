package Java.q4;

public class Test_main {
    public static void main(String args[]){
 
        GeometricObject geometricObject = new GeometricObject();
        GeometricObject geometricObject2 = new GeometricObject("black",false);
       
        Rectangle rectangle = new Rectangle(2,5);

        Circle circle = new Circle(3);
       
        System.out.println("Color "+geometricObject.getColor());
        System.out.println("Color "+geometricObject2.getColor());
        System.out.println("----------------Rectangle---------------");
        System.out.println("Area "+rectangle.getArea());
        System.out.println("perimeter "+rectangle.getPerimeter());
        System.out.println("----------------circle------------------");
        System.out.println("Area "+circle.getArea());
        System.out.println("Perimeter "+circle.getPerimeter());
        System.out.println("Diameter"+circle.getDiameter());
    }
    
}
