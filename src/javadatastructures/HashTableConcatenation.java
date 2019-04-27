package javadatastructures;

import java.util.ArrayList;

/**
 *
 * @author Raul Farkas
 */
public class HashTableConcatenation<E> {

    ArrayList<HashTableNode>[] list;

    public HashTableConcatenation() {
        list = new ArrayList[100];
    }

    public HashTableConcatenation(int i) {
        list = new ArrayList[i];
    }

    public int hash(String value) {
        int hashValue = 0;
        for (int i = 0; i < value.length(); i++) {
            hashValue += (int) (value.charAt(i) * Math.pow(2, i));
            //hashValue += (int) value.charAt(i);
        }
        return hashValue % list.length;
    }

    public void add(String key, E value) {
        int hkey = hash(key);
        if (list[hkey] == null) {
            list[hkey] = new ArrayList();
        }

        list[hkey].add(new HashTableNode(key, value));

    }

    public HashTableNode get(String key) throws Exception {
        int hkey = hash(key);
        HashTableNode ret = null;
        if (list[hkey] != null) {
            for (HashTableNode l : list[hkey]) {
                if(l.getKey() == key){
                    ret = l;
                    break;
                }

            }
        }
        if(ret == null){
            throw new Exception("Key not found!");
        }
        return ret;
    }

}
