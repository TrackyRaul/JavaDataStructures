package javadatastructures;

/**
 *
 * @author Raul Farkas
 */
public class BinaryTreeNode  {
    private int info;
    private BinaryTreeNode left;
    private BinaryTreeNode right;
    
    public BinaryTreeNode(){
        
    }
    
    public BinaryTreeNode(int value){
        this.info = value;
        
    }

    @Override
    public String toString() {
        return ""+info;
    }
    

    /**
     * @return the info
     */
    public int getInfo() {
        return info;
    }

    /**
     * @param info the info to set
     */
    public void setInfo(int info) {
        this.info = info;
    }

    /**
     * @return the left
     */
    public BinaryTreeNode getLeft() {
        return left;
    }

    /**
     * @param left the left to set
     */
    public void setLeft(BinaryTreeNode left) {
        this.left = left;
    }

    /**
     * @return the right
     */
    public BinaryTreeNode getRight() {
        return right;
    }

    /**
     * @param right the right to set
     */
    public void setRight(BinaryTreeNode right) {
        this.right = right;
    }
    
    
    
}
