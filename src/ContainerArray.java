import java.util.ArrayList;
import java.util.List;

public class ContainerArray<E> {
    private int initialCapacity = 10;
    private static int id = 0;
    private int currentSize = 0;
    private List<Object>  internalArray;

    public ContainerArray () {
        this(id);
        id++;
    }

    public ContainerArray (int initialCapacity) {
        internalArray = new ArrayList<Object>();
    }

    public void add (E element) {
    	currentSize++;
        internalArray.add(element) ;
    }

    public int size () {
        return internalArray.size();
    }

    public void remove (E objectToRemove) {
    	internalArray.remove(objectToRemove);
     //   currentSize--;
    }

    @SuppressWarnings("unchecked")
    public E get (int index) {
        return (E)internalArray.get(index);
    }
}
