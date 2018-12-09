package pl.sda.creational.singleton;

public class Singleton {

    private static Singleton instance;

    private Singleton() {
    }
    public static Singleton getInstance1(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}

