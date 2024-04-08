import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Stream implements Iterator<UchebnayaGruppa> {
    private List<UchebnayaGruppa> gruppi;
    private int currentIndex;

    public Stream(List<UchebnayaGruppa> gruppi) {
        this.gruppi = gruppi;
        this.currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < gruppi.size();
    }

    @Override
    public UchebnayaGruppa next() {
        return gruppi.get(currentIndex++);
    }

    public void sort() {
        Collections.sort(gruppi, Comparator.comparingInt(UchebnayaGruppa::getStudNumb));
    }

    @Override
    public String toString() {
        return "Stream: " + gruppi.toString();
    }
}
