package javadatastructures;

/**
 *
 * @author Raul Farkas
 */
public class Queue <E>{
    private LinkedList list;
    
    public Queue(){
        list = new LinkedList();
    }
    
    
    public Queue(E value){
        list = new LinkedList(value);
    }
    
    public void enqueue(E value){
        list.append(value);
    }
    
    public E dequeue(){
        E value = (E) list.getHead();
        list.removeHead();
        return value;
    }

    @Override
    public String toString() {
        return list.toString();
    }
    
    
}
