/** The Singleton */

public class Singleton {
    
    //The instance of a class
    private static final Singleton theInstance = new Singleton();
    
    //Count number of instances created
    private static int numCreated;
    
    /** Hidden constructor */
    private Singleton() { 
        System.out.println("Singleton Constructor\t" + numCreated);
        numCreated++;
    }
    
    /** Returns an instance of the class */
    public static synchronized final Singleton getSingleton() { 
        return theInstance;
    }
}
