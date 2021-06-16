import java.io.IOException;
import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) throws IOException {

        String joe = String.format("%s = %d", "joe", 35);
        String jim = String.format("%s = %d", "jim", 33);
        StringJoiner output = new StringJoiner(",", "[", "]");
        output.add(joe);
        output.add(jim);
        System.out.println(output.toString());   //-> [joe = 35,jim = 33]
    }

}
