package ArrayListProblems;

public class Singleton {

    //create a private static instance of the class
    private static Singleton instance ;

    private Singleton() {};//private constructor to prevent instantiation

    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();//lazy initialization
        }
        return instance;
    }

    /*double checked locking for thread safety

    public static Singleton getInstance(){
        if (instance == null){
            synchronized (Singleton.class){
                if (instance == null){
                    instance = new Singleton();//lazy initialization
                }
            }
        }
        return instance;


     */




}
