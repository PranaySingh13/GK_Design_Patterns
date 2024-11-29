package main.java.com.gk.designPatterns.creational.singleton.innerClass;

public class InnerClassSingletonExample {
    public static void main(String[] args) {
        MySingleton instance1 = MySingleton.getInstance();
        instance1.showMessage();

        MySingleton instance2 = MySingleton.getInstance();
        instance2.showMessage();
        System.out.println(instance1 == instance2);

    }
}
