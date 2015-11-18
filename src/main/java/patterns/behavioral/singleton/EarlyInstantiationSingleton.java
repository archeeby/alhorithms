package patterns.behavioral.singleton;

public class EarlyInstantiationSingleton {
    private static EarlyInstantiationSingleton instance = new EarlyInstantiationSingleton();

    private EarlyInstantiationSingleton() {}

    public EarlyInstantiationSingleton getInstance() {
        return instance;
    }
}