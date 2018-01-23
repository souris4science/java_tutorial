public class Singleton {
    private static Singleton singleton = null;

    private Singleton() { }

    public static Singleton getInstance() {
        if (singleton == null)
            singleton = new Singleton();
        return singleton;
    }

    protected static void demoMethod() {
        System.out.println("Demoing singleton class!!!");
    }
}
