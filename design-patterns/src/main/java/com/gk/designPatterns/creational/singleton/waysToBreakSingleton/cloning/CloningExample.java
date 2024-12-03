package main.java.com.gk.designPatterns.creational.singleton.waysToBreakSingleton.cloning;

public class CloningExample {
    public static void main(String[] args) throws CloneNotSupportedException {

        Singleton1 instance1 = Singleton1.getInstance();
        Singleton1 instance2 = (Singleton1) instance1.clone();
        System.out.println(instance1.hashCode()); //455659002
        System.out.println(instance2.hashCode()); //250421012
        System.out.println(instance1.equals(instance2)); //false

        /**
         * Cloning Handled
         */

        Singleton3 instance5 = Singleton3.getInstance();
        Singleton3 instance6 = (Singleton3) instance5.clone();
        System.out.println(instance5.hashCode()); // 1283928880
        System.out.println(instance6.hashCode()); // 1283928880
        System.out.println(instance5.equals(instance6));// true

        Singleton2 instance3 = Singleton2.getInstance();
        Singleton2 instance4 = (Singleton2) instance3.clone();

        //Error: Singleton instance cannot be cloned
        System.out.println(instance3.hashCode());
        System.out.println(instance4.hashCode());
        System.out.println(instance3.equals(instance4));
    }
}
