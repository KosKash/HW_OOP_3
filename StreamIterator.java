import java.util.Iterator;
import java.util.List;

public class StreamIterator implements Iterator<StudentGroup> {
    private List<StudentGroup> studentGroupList;
    private int counter;

    public StreamIterator(Stream Stream) {
        this.studentGroupList = Stream.getGroupList();
        counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < studentGroupList.size();
    }

    @Override
    public StudentGroup next() {
        if (hasNext()) {
            return studentGroupList.get(counter++);
        }
        return null;
    }

    @Override
    public void remove() {
        if (hasNext())
            studentGroupList.remove(counter);
    }

}
