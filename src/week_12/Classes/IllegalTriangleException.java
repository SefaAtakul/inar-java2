package week_12.Classes;

public class IllegalTriangleException extends Exception {

    public IllegalTriangleException(){
        super("The sum of any two sides must " +
                "be greater than the remaining side ");
    }

}
