public class MySingleton {

    private static MySingleton instance= null;
    /**
     * Create private constructor
     */
    private static Object object= new Object();
    private MySingleton(){
        /*
         * Create a static method to get instance
         */

    }
    public static synchronized MySingleton getInstance(){
        if(instance==null){
            instance= new MySingleton();
        }
        return instance;
    }
    public void message(){
        // prints message
        System.out.println("This Mysingleton Class is Thread Safe");
    }

    public static void main(String[] args) {

        MySingleton mysingleton= getInstance();
        mysingleton.message();

    }

}


