import java.io.IOException;
import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) throws IOException {

        String jo = String.format("%s = %d", "Jonas", 47);
        String kat = String.format("%s = %d", "Katja", 48);
        String alex = String.format("%s = %d", "Alex", 2);
        StringJoiner output = new StringJoiner(",", "[", "]");
        output.add(jo);
        output.add(kat);
        output.add(alex);
        System.out.println(output.toString());   //-> [joe = 35,jim = 33]
    }

}
