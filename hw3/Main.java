import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<UchebnayaGruppa> gruppi = new ArrayList<>();
        gruppi.add(new UchebnayaGruppa("Группа 2", 15));
        gruppi.add(new UchebnayaGruppa("Группа 3", 18));
        gruppi.add(new UchebnayaGruppa("Группа 1", 20));

        Stream stream = new Stream(gruppi);
        stream.sort();

        while (stream.hasNext()) {
            System.out.println(stream.next());
        }
    }
}