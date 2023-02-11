package singleton;

import proxy.DatabaseExecuter;
import proxy.DatabaseExecuterProxy;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Singleton design Patterns!");

        SingletonSynchronized instance = SingletonSynchronized.getInstance();
        System.out.println(instance);

        SingletonSynchronized instance1 = SingletonSynchronized.getInstance();
        System.out.println(instance1);

    }
}