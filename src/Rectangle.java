/**
 * Created by IShAani on 28-07-2015.
 */
public class Rectangle {

    private double length;
    private double breath;


    public Rectangle(double length, double breath) {
        this.length = length;
        this.breath = breath;
    }

    public double calculateArea(){
        return length*breath;
    }

    public double calculatePerimeter(){
        return 2*(length+breath);
    }



}
