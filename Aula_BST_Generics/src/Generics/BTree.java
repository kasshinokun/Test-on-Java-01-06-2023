package Generics;
//Credits:
/*Developer: Zac Blanco
 * 
 * Github's URL: https://gist.github.com/ZacBlanco/f5802755d4f964a649e532d6373e2c26
 * 
 * 
 * */
import java.util.*;

public class BTree<T extends Comparable<T>> {

    public static void main (String[] args) {
        printScoreReport(test());
        // You can write more code to test your methods under here.

    }

    protected BSTNode<T> root;
    
    public BTree() {
        root = null;
    }

    ///////////////////////////
    // FILL IN THESE METHODS //
    ///////////////////////////
    /**
     * Insert an item into a binary tree. NO DUPLICATES.
     * @param data - the data to insert into the tree
     * @return boolean indicating whether or not the insert was performed successfully
     */
    public boolean insert(T data) {
    	if (root == null) {
    		root = new BSTNode<T>();
    		root.data = data;
    		return true;
    	} else {
    		return insert(data, root);
    	}
    }
    
    public boolean insert(T data, BSTNode<T> root) {
    	if(root == null) {
    		return false;
    	}
    	
    	if (data.compareTo(root.data) > 0) {
    		if (root.right == null) {
    			root.right = new BSTNode<T>();
    			root.right.data = data;
    			return true;
    		} else {
    			return insert(data, root.right);
    		}
    	} else if (data.compareTo(root.data) < 0) {
    		if (root.left == null) {
    			root.left = new BSTNode<T>();
    			root.left.data = data;
    			return true;
    		} else {
    			return insert(data, root.left);
    		}
    	} else if (data.compareTo(root.data) == 0) {
    		return false;
    	}
    	return false;
    }
    
    /**
     * Gets the number of nodes in the binary tree.
     * @return int - the number of nodes in the tree
     */
    public int getSize() {
        return getSize(root);
    }
    
    public int getSize(BSTNode<T> root) {
    	if (root == null) {
    		return 0;
    	} else {
    		return getSize(root.left) + getSize(root.right) + 1;
    	}
    }

    /**
     * Returns -1 if root is null. 0 If a root exists, otherwise return the height
     * @returns int - The height of the tree (max # of edges)
     */
    public int getHeight() {
    	return getHeight(root);
    }
    public int getHeight(BSTNode<T> root) {
    	if (root == null) {
        	return -1;
        } else {
        	return 1 + max(getHeight(root.left), getHeight(root.right));
        }
    }
    
    public int max(int i1, int i2) {
    	return i1 > i2 ? i1 : i2;
    }

    
    /**
     * @param item - the item to check for
     */
    public boolean exists(T item) {
        return getNode(item, this.root) != null;
    }

    /**
     * Get the root of the subtree rooted by item T
     * @param item - The data you're searching for
     * Return null if T doesn't exist
     */
    public BSTNode<T> getNode(T item) {
        return getNode(item, root);
    }
    
    public BSTNode<T> getNode(T item, BSTNode<T> root) {
    	if (root == null) {
    		return null;
    	}
    	if (root.data.compareTo(item) == 0) {
    		return root;
    	} else if (root.data.compareTo(item) > 0) {
    		return getNode(item, root.left);
    	} else if (root.data.compareTo(item) < 0) {
    		return getNode(item, root.right);
    	} else {
    		return null;
    	}
    }

    /**
     * Returns the smallest value in the tree.
     */
    public T min() {
    	if (root == null) {
    		return null;
    	}
    	BSTNode<T> min = root;
        while (min.left != null) {
        	min = min.left;
        }
        return min.data;
    }

    /**
     * Returns the largest value in the tree.
     */
    public T max() {
    	if (root == null) {
    		return null;
    	}
    	BSTNode<T> max = root;
        while (max.right != null) {
        	max = max.right;
        }
        return max.data;
    }

    /**
     * Return a sorted ArrayList of the items in the tree
     * @param inverse - whether we ascending vs descending order (ascending = true, descending = false)
     */
    @SuppressWarnings("unchecked")
	public ArrayList<T> toArrayList(boolean ascending) {
    	ArrayList<T> items = new ArrayList<T>();
    	fillArrayList(ascending, root, items);
    	return items;
    }
    
    public void fillArrayList(boolean ascending, BSTNode<T> root, ArrayList<T> items) {
    	if (root == null) { return; }
    	if (ascending) {
	    	fillArrayList(ascending, root.left, items);
	    	items.add(root.data);
	    	fillArrayList(ascending, root.right, items);
    	} else {
    		fillArrayList(ascending, root.right, items);
	    	items.add(root.data);
	    	fillArrayList(ascending, root.left, items);
    	}
    }

    /**
     * Returns the kth smallest value.
     * If k is larger than size return null.
     * If k is less than 1 return null.
     * @param kth - the kth smallest value to check for
     */
    public T kthSmallest(int kth) {
        if (root == null) {
        	return null;
        } else {
        	return kthSmallest(kth, root);
        }
    }
    
    public T kthSmallest(int k, BSTNode<T> root) {
    	int leftSize = getSize(root.left);
    	if(k == leftSize + 1) {
    		return root.data;
    	} else if (k <= leftSize) {
    		return kthSmallest(k, root.left);
    	} else if (k > leftSize + 1){
    		return kthSmallest(k - leftSize - 1, root.right);
    	} else {
    		return null;
    	}
    }
    

    /**
     * Given an input element search for the element of the tree which is the next greatest elemtn and return it.
     * i.e. if the array is {1, 2, 3, 4, 5, 6, 7} nextGreatest(4) ==> 5
     * If the item is the greatest element, return null
     * @param item - the item which is exactly the first-least item
     * @returns T - the item which is next greatest
     */
    public T nextGreatest(T item) {
        return null;
    }

    /**
     * Delete an item from the binary tree.
     * @param item - the item to search for an delete
     * @return boolean - true or false if the item was successfully deleted.
     */
    public boolean delete(T item) {
    	
    	// Not very efficient b/c of getSize()
    	int sz1 = getSize();
    	root = delete(item, root);
    	int sz2 = getSize();
    	return sz2 < sz1 ? true : false;
    }
    
    public BSTNode<T> delete(T item, BSTNode<T> root) {
    	if (root == null) {
    		return null;
    	}
    	
    	if (item.compareTo(root.data) == 0) {
    		//Its equal and we need to delete it
    		if (root.left == null) {
    			return root.right;
    		} else if (root.right == null) {
    			return root.left;
    		} else {
    			BSTNode<T> rootmin = min(root.right);
    			root.data = rootmin.data;
    			root.right = delete(rootmin.data, root.right);
    		}
    	} else if (item.compareTo(root.data) > 0) {
    		root.right = delete(item, root.right);
    	} else {
    		root.left = delete(item, root.left);
    	}
    	return root;
    }
    
    public BSTNode<T> min(BSTNode<T> root) {
    	if (root == null) {
    		return null;
    	} else if (min(root.left)== null) {
    		return root;
    	} else {
    		return null;
    	}
    }
    
    /**
     * Print the pre-order traversal as a string. Put spaces between item values.
     * @return boolean - true or false if the item was successfully deleted.
     */
    public String preOrder() {
        return preOrder(this.root).trim();
    }
    
    public String preOrder(BSTNode<T> root) {
    	if (root == null) {
    		return "";
    	}
    	String s = "";
    	s += " " + root.data.toString();
    	s += preOrder(root.left);
    	s += preOrder(root.right);
    	return s;
    	
    }
    
    /**
     * Get the post-order traversal as a string
     * @return boolean - true or false if the item was successfully deleted.
     */
    public String postOrder() {
        return postOrder(this.root).trim();
    }
    public String postOrder(BSTNode<T> root) {
    	if (root == null) {
    		return "";
    	}
    	String s = "";
    	s += postOrder(root.left);
    	s += postOrder(root.right);
    	s += " " + root.data.toString();
    	return s;
    	
    }

    /**
     * Counts the number of leaves (nodes with no children)
     * @return int - the number of leaf nodes.
     */
    public int countLeaves() {
        return countLeaves(root);
    }
    
    public int countLeaves(BSTNode<T> root) {
    	if (root == null) {
    		return 0;
    	} else if (root.left == null && root.right == null) {
    		return 1;
    	} else {
    		return countLeaves(root.left) + countLeaves(root.right);
    	}
    }
    
    
    public boolean validate() {
        return valRecurse(this.root);
    }

    private boolean valRecurse(BSTNode<T> root) {
        if (root == null) {
            return true;
        }
        if (root.left != null) {
            if (!valRecurse(root.left)) {
                return false;
            }
            if (root.data.compareTo(root.left.data) < 0) {
                return false;
            }
        }
        if (root.right != null) {
            if (!valRecurse(root.right)) {
                return false;
            }
            if (root.data.compareTo(root.right.data) > 0) {
                return false;
            }
        }
        return true;
    }


    /**
     * resets the tree.
     */
    public void reset() {
        this.root = null;
    }


    // Don't touch this method
    public static double assertTrue(boolean condition, double points, String error) {
        if (!condition) {
        	if (error.length() > 0) {
        		System.out.println("Lost " + error + " points on line " + Thread.currentThread().getStackTrace()[3].getLineNumber());
        	}
            return 0;
        } else { return points; }
    }
    
    public static double assertTrue(boolean condition, double points) {
        return assertTrue(condition, points, points + "");
    }

    public static double test() {
        double points = 0;
        BTree<Integer> t1 = new BTree<Integer>();
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        points += assertTrue(t1.root == null, 5, "Root was not null on empty tree"); 
        points += assertTrue(t1.getHeight() == -1, 1.0, "Hieght was not -1 on new tree");
        points += assertTrue(t1.validate(), 1.0, "validate not true on empty tree");
        for(int i = 0; i < A.length; i++) {
            points += assertTrue(t1.insert(A[i]), 0.5, "insert not true for valid value: " + A[i]);
            points += assertTrue(t1.getSize() == i+1, 0.25, "Size not properly modified after inserting " + A[i]);
        }
        points += assertTrue(t1.insert(1) == false, 1.0, "Must return false for duplicate insert");
        points += assertTrue(t1.insert(6) == false, 1.0, "Must return false for duplicate insert");
        points += assertTrue(t1.countLeaves() == 1, 10.0, "count leaves not proper on linear tree");
        points += assertTrue(t1.getHeight() == A.length-1, 2.5);
        points += assertTrue(t1.getSize() == A.length, 2.5);
        for(int i = A.length-1; i >= 0; i--) {
            points += assertTrue(t1.delete(A[i]), 3);
            points += assertTrue(t1.getSize() == i, 0.25);
        }
        

        try {
            points += assertTrue(t1.kthSmallest(2) == 2, 3.5);
            points += assertTrue(t1.kthSmallest(5) == 5, 3.5);
            ArrayList<Integer> A1 = t1.toArrayList(true);
            for(int i = 0; i < A.length; i++) {
                points += assertTrue(A1.get(i) == A[i], 0.5);
            }
            A1 = t1.toArrayList(false);
            for(int i = A.length-1; i >= 0; i--) {
                points += assertTrue(A1.get(i) == A[i], 0.5);
            }
        } catch (NullPointerException e) {}

        t1.reset();
        for(int i = A.length - 1; i >= 0; i--) {
            points += assertTrue(t1.insert(A[i]), 0.5);
            points += assertTrue(t1.getSize() == A.length - i, 0.25);
        }
        for(int i = 0; i < A.length; i++) {
            points += assertTrue(t1.exists(i+1), 0.25);
        }

        t1.reset();
        int[] B = {2, 1, 3};
        points += assertTrue(t1.kthSmallest(1) == null, 3.0);
        points += assertTrue(t1.getHeight() == -1, 1.0);
        for(int i = 0; i < B.length; i++) {
            points += assertTrue(t1.insert(B[i]), 0.25);
            points += assertTrue(t1.validate() == true, 0.5);
        }
        points += assertTrue(t1.validate() == true, 1.5);
        points += assertTrue(t1.countLeaves() == 2, 5.0);
        try{
            points += assertTrue(t1.min() == 1, 3.5);
            points += assertTrue(t1.max() == 3, 3.5);
        } catch (NullPointerException e) {}
        points += assertTrue(t1.insert(2) == false, 0.5);
        points += assertTrue(t1.getHeight() == 1, 4.25); //Single edge = height 1
        points += assertTrue(t1.insert(4) == true, 2.0);
        points += assertTrue(t1.getHeight() == 2, 5); //Right subtree heavy
        
        BSTNode<Integer> r = t1.getNode(1);
        try{
            points += assertTrue(t1.getNode(1).right.data == 3, 3.25);
            points += assertTrue(t1.getNode(1).left.data == 2, 3.25);
        } catch (NullPointerException e) {}
        t1.reset();
        t1.insert(5);
        t1.insert(4);
        t1.insert(7);
        t1.insert(2);
        t1.insert(9);
        t1.insert(3);
        t1.insert(6);
        points += assertTrue(t1.validate(), 2.5);
        points += assertTrue(t1.countLeaves() == 3, 4.5);
        try {
            points += assertTrue (t1.nextGreatest(4) == 5, 3.5);
            points += assertTrue (t1.nextGreatest(7) == 9, 3.5);
            points += assertTrue (t1.nextGreatest(9) == null, 3.5);
        } catch (NullPointerException e) {}
        
        t1.reset();
        t1.insert(5);
        t1.insert(3);
        t1.insert(4);
        t1.insert(7);
        t1.insert(6);
        points += assertTrue(t1.postOrder().equals("4 3 6 7 5"), 10.5);
        points += assertTrue(t1.preOrder().equals("5 3 4 7 6"), 10.5);

        return points;
    }

	public static void printScoreReport(double points) {
        System.out.println("==============================================================");
        System.out.println("======================== Score Report ========================");
        System.out.println("==============================================================");
        System.out.println();
        System.out.println("You scored " + points + " points on your binary tree implementation");
        System.out.println();
        System.out.println("==============================================================");
    }

}

class BSTNode<T extends Comparable<T>> {
    T data;
    BSTNode<T> left, right;
}
