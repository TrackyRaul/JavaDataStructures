package javadatastructures;

/**
 *
 * @author Raul Farkas
 */
public class LinkedListNode<E> {
    private E info;
    private LinkedListNode next;
    
    public LinkedListNode(E info){
        this.info = info;
    }

    LinkedListNode() {
        
    }

    /**
     * @return the info
     */
    public E getInfo() {
        return info;
    }

    @Override
    public String toString() {
        return info.toString();
    }
    
    

    /**
     * @param info the info to set
     */
    public void setInfo(E info) {
        this.info = info;
    }

    /**
     * @return the next
     */
    public LinkedListNode getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(LinkedListNode next) {
        this.next = next;
    }
    
    
    
}
