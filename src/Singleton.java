/** The Singleton */

public class Singleton {
    
    //The instance of a class
    private static Singleton theInstance = null;
    
    //Count number of instances created
    private static int numCreated;
    
    /** Hidden constructor */
    private Singleton() { 
        System.out.println("Singleton Constructor\t" + numCreated);
        numCreated++;
    }
    
    /** Returns an instance of the class */
    public static Singleton getSingleton() { 
        if(theInstance == null) { 
            theInstance = new Singleton();
        }
        return theInstance;
    }
}
