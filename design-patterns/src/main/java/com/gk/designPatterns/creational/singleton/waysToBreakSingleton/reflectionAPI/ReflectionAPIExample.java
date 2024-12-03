package main.java.com.gk.designPatterns.creational.singleton.waysToBreakSingleton.reflectionAPI;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Reflection is an API that is used to examine or modify the behavior of methods, classes,
 * and interfaces at runtime. The required classes for reflection are provided under
 * java.lang.reflect package which is essential in order to understand reflection.
 */
public class ReflectionAPIExample {

    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {

        MySingleton instance1 = MySingleton.getInstance();
        System.out.println(instance1.hashCode());

        Constructor[] declaredConstructors = MySingleton.class.getDeclaredConstructors();
        MySingleton instance2 = null;

        for (Constructor constructor : declaredConstructors) {
            // This will destroy the singleton pattern
            constructor.setAccessible(true);
            instance2 = (MySingleton) constructor.newInstance();
            break;
        }

        /**
         * we will see that hashCodes are different which means,
         * 2 objects of the same class are created and the singleton pattern has been destroyed.
         */
        System.out.println(instance2.hashCode());
        System.out.println(instance1.equals(instance2)); //false

        /**
         * Overcome Reflection issue Using Enum
         */

        MySingletonEnum instance3 = MySingletonEnum.INSTANCE;
        System.out.println(instance3.hashCode());

        Constructor[] declaredEnumConstructors = MySingletonEnum.class.getDeclaredConstructors();
        MySingletonEnum instance4 = null;

        /**
         * Runtime error : Cannot reflectively create enum objects
         */
        for (Constructor constructor : declaredEnumConstructors) {
            constructor.setAccessible(true);
            instance4 = (MySingletonEnum) constructor.newInstance();
            break;
        }

        System.out.println(instance4.hashCode());
        System.out.println(instance3.equals(instance4));
    }
}
