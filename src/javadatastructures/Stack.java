package javadatastructures;

/**
 *
 * @author Raul Farkas
 */
public class Stack <E>{
    private LinkedList list;
    
    public Stack(){
        list = new LinkedList();
    }
    
    
    public Stack(E value){
        list = new LinkedList(value);
    }
    
    public void push(E value){
        list.append(value);
    }
    
    public E pop(){
        E value = (E) list.getTail();
        list.removeTail();
        
        return value;
    }

    @Override
    public String toString() {
        return list.toString();
    }
    
    
    
    
    
    
}
