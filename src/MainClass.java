/**
 * Created by IShAani on 28-07-2015.
 */
public class MainClass {

    public static void main(String[] args){
        Shape shape = new Rectangle(3,4);
        System.out.println(shape.calculateArea());
        Shape shape2 = new Square(5);
        System.out.println(shape2.calculateArea());

    }
}
