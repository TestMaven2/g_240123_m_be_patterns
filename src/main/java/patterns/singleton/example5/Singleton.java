package patterns.singleton.example5;

public class Singleton {

    private Singleton() {

    }

    private static class SingletonHolder {
        public static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}