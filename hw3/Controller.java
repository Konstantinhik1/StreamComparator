import java.util.List;

public class Controller {
    private StreamService streamService;

    public Controller() {
        this.streamService = new StreamService();
    }
    public void sortStreams(List<Stream> streams) {
        streamService.sortStreams(streams);
    }
    // Дополнительные методы класса Controller
}
