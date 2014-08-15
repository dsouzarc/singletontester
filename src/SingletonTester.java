
public class SingletonTester {

    public static void main(String[] rcd) { 
        
        //Below line doesn't work b/c of access modifier.
        //Singleton ryan = new Singleton();
        
        //Create a new singleton
        Singleton ryan = Singleton.getSingleton();

    }
}
