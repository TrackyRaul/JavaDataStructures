package javadatastructures;

/**
 *
 * @author Raul Farkas
 */
public class HashTableNode <E>{
    public String key;
    public E info;

    public HashTableNode(String key, E info) {
        this.key = key;
        this.info = info;
    }

    @Override
    public String toString() {
        return "HashTableNode{" + "key=" + key + ", info=" + info + '}';
    }
    

    /**
     * @return the key
     */
    public String getKey() {
        return key;
    }

    /**
     * @return the info
     */
    public E getInfo() {
        return info;
    }

    /**
     * @param info the info to set
     */
    public void setInfo(E info) {
        this.info = info;
    }
    
    
}
