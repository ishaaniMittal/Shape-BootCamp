/**
 * Created by IShAani on 28-07-2015.
 */
public class Rectangle {

    private int length;
    private int breath;

    public int getLength() {
        return length;
    }

    public int getBreath() {
        return breath;
    }

    public Rectangle(int length, int breath) {
        this.length = length;
        this.breath = breath;
    }

    public int calculateArea(int length, int breath){
        return length*breath;
    }

    public int calculateArea(Rectangle r){
        return r.getLength()*r.getBreath();
    }

}
