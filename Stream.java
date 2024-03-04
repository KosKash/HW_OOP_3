import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup>{
    
    private List<StudentGroup> groupList;
    public Stream(List<StudentGroup> groupList){
        this.groupList = groupList;
    }
    
    public List<StudentGroup> getGroupList(){
        return groupList;
    }
    
    
    
    public void addGroup(StudentGroup StudentGroup){
        groupList.add(StudentGroup);
    }
    
    public int getSizeGroupList(){
        return groupList.size();
    }
    
    

    @Override
    public Iterator<StudentGroup> iterator() {
        return new StreamIterator(this);
    }

    @Override
    public String toString() {
        return "Stream [groupList=" + groupList + "]"+ " : " + groupList.size();
    }
    
    
    
}
