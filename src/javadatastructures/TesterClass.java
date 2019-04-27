/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadatastructures;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Raul Farkas
 */
public class TesterClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList ll = new LinkedList();

        ll.insert(0, 2);
        ll.append(3);
        ll.append(4);
        ll.remove(1);
        System.out.println(ll.toString());
        System.out.println("Value:" + ll.get(4));
        
        Stack s = new Stack(2);
        s.push(3);
        s.push(4);
        System.out.println(s.pop());
        //System.out.println(s.pop());
        //System.out.println(s.pop());
        System.out.println(s.toString());
        
        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(2);
        System.out.println(q.dequeue());
        System.out.println(q.toString()+"\n\n");
        
        BinaryTree bt = new BinaryTree();
        bt.add(0, bt.getRoot());
        bt.add(1, bt.getRoot());
        bt.add(5, bt.getRoot());
        bt.add(4, bt.getRoot());
        
        bt.symetricVisit(bt.getRoot());
        System.out.println("\n\n");
        HashTableConcatenation htc = new HashTableConcatenation();
        
        htc.add("anna", "panna");
        htc.add("anan", "panne");
        try {
            System.out.println(htc.get("anna").toString());
            System.out.println(htc.get("anan").toString());
        } catch (Exception ex) {
            Logger.getLogger(TesterClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("\n\n");
        
        HashTableOpenAddressing htoa = new HashTableOpenAddressing();
        htoa.add("cane", "charlie");
        htoa.add("anec","casa");
        try {
            System.out.println(htoa.get("cane").toString());
            System.out.println(htoa.get("anec").toString());
        } catch (Exception ex) {
            Logger.getLogger(TesterClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        
                
    }
    
}
