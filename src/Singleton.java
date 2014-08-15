/** The Singleton */

public class Singleton {
    
    //The instance of a class
    private static Singleton theInstance = null;
    
    /** Hidden constructor */
    private Singleton() { 
        
    }
    
    /** Returns an instance of the class */
    public static Singleton getSingleton() { 
        if(theInstance == null) { 
            theInstance = new Singleton();
        }
        return theInstance;
    }
}
