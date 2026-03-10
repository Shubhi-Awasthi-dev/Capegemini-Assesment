import java.util.function.Function;

public class Exercise {

    public static void main(String[] args) {

        Function<String, String> formatString = str ->
                String.join(" ", str.split(""));

        System.out.println(formatString.apply("CG"));
        System.out.println(formatString.apply("HELLO"));
    }
}