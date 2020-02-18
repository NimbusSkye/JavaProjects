package Java;

public class Stuff {
	int value;
    Stuff right;
    Stuff left;
	public Stuff (int value) {
	    this.value = value;
	}

	public static boolean contains(Stuff root, int value) {
	    while (root != null) {
	        if (root.value == value)
	            return true;
	        if (value > root.value)
	            root = root.right;
	        else
	            root = root.left;
	    }
	    return false;
	}

	public static void main (String[] args) {
	    Stuff root = new Stuff (1);
	    root.left = new Stuff (-1);
	    root.right = new Stuff (3);
	    root.left.left = new Stuff (-2);
	    root.left.right = new Stuff (0);
	    root.right.left = new Stuff (2);
	    root.right.right = new Stuff (4);
	    for (int i = -5; i < 5; i++) {
	    System.out.print (i + ": ");
	    if (contains(root, i)) {
	    	System.out.print ("yes");
	    	System.out.println ();
	    }
	    else {
	    	System.out.print ("no");
	    	System.out.println ();
	    }
	}
}
}
