package javadatastructures;

/**
 *
 * @author Raul Farkas
 */
public class BinaryTree {

    public BinaryTreeNode root;

    public BinaryTree() {

    }

    public BinaryTree(int value) {
        root = new BinaryTreeNode(value);

    }
    public void symetricVisit(BinaryTreeNode node){
        if(node == null){
            return;
            
        }
        if(node.getLeft() != null){
            symetricVisit(node.getLeft());
        }
        System.out.println(node.toString());
        if(node.getRight() != null){
            symetricVisit(node.getRight());
        }
        
        
    }

    public void add(int value, BinaryTreeNode node) {
        if (node == null) {
            setRoot(new BinaryTreeNode(value));
            return;
        }
        if (value <= node.getInfo()) {
            if (node.getLeft() == null) {
                node.setLeft(new BinaryTreeNode(value));
            } else {
                add(value, node.getLeft());
            }
        } else {
            if (node.getRight() == null) {
                node.setRight(new BinaryTreeNode(value));
            } else {
                add(value, node.getRight());
            }
        }

    }

    /**
     * @return the root
     */
    public BinaryTreeNode getRoot() {
        return root;
    }

    /**
     * @param root the root to set
     */
    public void setRoot(BinaryTreeNode root) {
        this.root = root;
    }

}
