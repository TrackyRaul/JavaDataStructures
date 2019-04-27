package javadatastructures;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Raul Farkas
 */
public class HashTableOpenAddressing <E> {
    HashTableNode[] list;

    public HashTableOpenAddressing() {
        list = new HashTableNode[100];
    }

    public HashTableOpenAddressing(int i) {
        list = new HashTableNode[i];
    }
    
    public int hash(String value) {
        int hashValue = 0;
        for (int i = 0; i < value.length(); i++) {
            //hashValue += (int) (value.charAt(i) * Math.pow(2, i));
            hashValue += (int) value.charAt(i);
        }
        return hashValue % list.length;
    }
    
    public void add(String key, E value){
        int hkey = hash(key);
        if(list[hkey] == null){
            list[hkey] = new HashTableNode(key,value);
        }else{
            try {
                list[linearAnalysis(hkey,key,"add")] = new HashTableNode(key,value);
            } catch (Exception ex) {
                Logger.getLogger(HashTableOpenAddressing.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }
    }
    public HashTableNode get(String key) throws Exception{
        int hkey = hash(key);
        if(list[hkey] == null){
            throw new Exception("Element not found!");
        }else if(!list[hkey].getKey().equals(key)){
            try {
                return list[linearAnalysis(hkey,key,"search")];
            } catch (Exception ex) {
                Logger.getLogger(HashTableOpenAddressing.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }
        
        
        return list[hkey];
    }
    
    public int linearAnalysis(int initialPos, String key, String operation) throws Exception{
        int p = initialPos;
        while(true){

            p++;
            
            p = p%list.length;
            if(p == initialPos){
                throw new Exception("Table full!");
            }
            if(operation.equals("add")){
                if(list[p] == null){
                    return p;
                }
            }else if(operation.equals("search")){
                if(list[p] == null){
                    throw new Exception("Element not found!");
                    
                }
                if(list[p].getKey().equals(key)){
                    return p;
                }
            }
        }
        
        
    }
    
}
