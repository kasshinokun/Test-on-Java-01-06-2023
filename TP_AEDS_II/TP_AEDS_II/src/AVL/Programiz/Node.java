package AVL.Programiz;//Subproject's Name
import java.util.*;//necessaries libraries 

/*temporary test(not edited)

Credits: Site Programiz
http://www.programiz.com/dsa/avl-tree

AVL tree implementation in Java*/

// Create node
public class Node {
    public int item, height;
    public Node left, right;

    public Node(int d) {
        item = d;
        height = 1;
    }
}

