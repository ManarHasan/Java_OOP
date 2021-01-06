import java.util.ArrayList;
public class ExceptionsTest{
    public static void main(String[] args){
        Exceptions test = new Exceptions();
        try {
            test.errorMessage();
            System.out.println("No errors");
        } catch (Exception e){
            System.out.println("Error");
        }
    }
}
