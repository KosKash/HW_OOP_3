import java.util.List;

public class StreamService {
    
    StreamComporator comp = new StreamComporator();
    public void getSortedStream(List<Stream> streams){
        streams.sort(comp);
    }
}
