package patterns.singleton.example1;

// Минус данного подхода - неленивая инициализация
public class Singleton {

    private static final Singleton INSTANCE = new Singleton();

    private Singleton() {

    }

    public static Singleton getInstance() {
        return INSTANCE;
    }
}