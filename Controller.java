import java.util.ArrayList;
import java.util.List;

public class Controller {
    private List<Stream> streams;
    private StreamService streamService;

    public  Controller(){
        streams = new ArrayList<>();
        streamService = new StreamService();
    }

    public List<Stream> getStreams(){
        return streams;
    }

    public void addStream(Stream stream){
        streams.add(stream);
    }

    public void sortStream(){
        streamService.getSortedStream(streams);
    }
}
