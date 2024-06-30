
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;

public class LiteracyComparison {

    public static void main(String[] args) {
        ArrayList<Literacy> literacies = new ArrayList<>();

        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(row -> row.split(","))
                    .map(parts -> new Literacy(parts[0].trim(), parts[1].trim(), parts[2].trim(), parts[3].trim(),
                            Integer.parseInt(parts[4].trim()), Double.parseDouble(parts[5].trim())))
                    .forEach(literacy -> literacies.add(literacy));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        literacies.stream().sorted().forEach(literacy -> System.out.println(literacy));

    }
}
