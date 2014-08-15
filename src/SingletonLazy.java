/** Singleton lazy instantiation (only when first called) */

public class SingletonLazy {
    
    //The instance of a class
    private static SingletonLazy theInstance;
    
    //Count number of instances created
    private static int numCreated;
    
    /** Hidden constructor */
    private SingletonLazy() { 
        System.out.println("Singleton Constructor\t" + numCreated);
        numCreated++;
    }
    
    /** Returns an instance of the class */
    public static synchronized final SingletonLazy getSingleton() { 
        if(theInstance == null) {
            theInstance = new SingletonLazy();
        }
        return theInstance;
    }
}
