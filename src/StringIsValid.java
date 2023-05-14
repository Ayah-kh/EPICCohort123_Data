import java.lang.reflect.Array;
import java.util.Arrays;

public class StringIsValid {
    public static void main(String[] args) {
        isValid("))))");

    }

    public static boolean isValid(String data){
        char[] array = data.toCharArray();
        System.out.println("Arrays.toString(array) = " + Arrays.toString(array));
        return false;
    }


}