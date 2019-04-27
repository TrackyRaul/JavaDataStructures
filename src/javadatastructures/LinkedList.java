package javadatastructures;

/**
 *
 * @author Raul Farkas
 */
public class LinkedList<E> {

    private LinkedListNode head;

    public LinkedList(E headValue) {
        this.head = new LinkedListNode(headValue);

    }

    LinkedList() {

    }

    public String describe() {
        LinkedListNode ref = this.head;
        String s = "";
        if (this.head != null) {
            while (ref.getNext() != null) {
                s += ref.toString() + ",";
                ref = ref.getNext();

            }
            s += ref.toString();
        }
        return s;

    }

    public String describe(String separator) {
        LinkedListNode ref = this.head;
        String s = "";
        if (this.head != null) {
            while (ref.getNext() != null) {

                s += ref.toString() + separator;

                ref = ref.getNext();

            }
            s += ref.toString();
        }
        return s;

    }

    public void append(E value) {
        LinkedListNode ref = this.head;
        if (ref == null) {
            this.head = new LinkedListNode(value);
        } else {
            while (ref.getNext() != null) {
                ref = ref.getNext();
            }
            ref.setNext(new LinkedListNode(value));
        }

    }

    public void prepend(E value) {
        LinkedListNode ref = this.head;
        if (ref == null) {
            this.head = new LinkedListNode(value);
        } else {
            LinkedListNode newNode = new LinkedListNode(value);
            newNode.setNext(this.head);
            this.head = newNode;

        }
    }

    public void insert(int i, E value) {
        int counter = 0;
        LinkedListNode ref = this.head;
        if (i == 0) {
            this.prepend(value);
            return;
        }
        while (ref.getNext() != null) {
            if (counter + 1 == i) {
                LinkedListNode newNode = new LinkedListNode(value);
                newNode.setNext(ref.getNext());
                ref.setNext(newNode);

                break;
            }
            counter += 1;
            ref = ref.getNext();

        }

        if (i == counter + 1 && ref.getNext() == null) {
            LinkedListNode newNode = new LinkedListNode(value);
            newNode.setNext(ref.getNext());
            ref.setNext(newNode);

        }
    }

    public E getTail() {
        LinkedListNode ref = this.head;
        if (ref.getNext() != null) {

            ref = ref.getNext();

        }
        

        return (E) ref.getInfo();

    }
    public E get(int i){
        LinkedListNode ref = this.head;
        int counter = 0;
        if(i == 0){
            return (E) this.getHead();
        }
        while (ref.getNext() != null) {
            if(counter+1 == i){
                
                return (E) ref.getNext();
            }
            counter += 1;

            ref = ref.getNext();

        }
        return (E) ref.getNext();
        
        
    }


    public void removeHead() {
        if (this.head == null) {
            return;
        }
        if (this.head.getNext() == null) {
            this.head = null;
            return;
        }
        this.head = this.head.getNext();
    }

    public void removeTail() {
        LinkedListNode ref = this.head;
        if (this.head == null) {
            return;
        }
        if (this.head.getNext() == null) {
            this.head = null;
            return;
        }
        while (ref.getNext().getNext() != null) {

            ref = ref.getNext();

        }
        ref.setNext(null);

    }

    public void remove(int i) {
        int counter = 0;
        LinkedListNode ref = this.head;
        if (i == 0) {
            removeHead();
            return;
        }
        while (ref.getNext().getNext() != null) {
            if (counter + 1 == i) {
                ref.setNext(ref.getNext().getNext());
                return;
            }
            counter += 1;

            ref = ref.getNext();

        }

        if (ref.getNext().getNext() == null && counter + 1 == i) {
            ref.setNext(null);

        }

    }

    @Override
    public String toString() {
        return this.describe();
    }

    /**
     * @return the head
     */
    public LinkedListNode getHead() {
        return head;
    }

    /**
     * @param head the head to set
     */
    public void setHead(LinkedListNode head) {
        this.head = head;
    }

}
