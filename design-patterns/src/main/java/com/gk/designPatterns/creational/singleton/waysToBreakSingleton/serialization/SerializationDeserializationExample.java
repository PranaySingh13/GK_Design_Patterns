package main.java.com.gk.designPatterns.creational.singleton.waysToBreakSingleton.serialization;

import java.io.*;

public class SerializationDeserializationExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        MySingleton1 instance1 = MySingleton1.getInstance();

        // Serialize the instance
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("file.text"));
        outputStream.writeObject(instance1);
        outputStream.close();

        // De-Serialize the instance
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("file.text"));

        /**
         * When a singleton object is serialized and then deserialized, the readObject()
         * method creates a new instance of the class during deserialization.
         * This violates the singleton property, as you now have multiple instances
         * of the singleton class.
         */

        MySingleton1 instance2 = (MySingleton1) inputStream.readObject();
        inputStream.close();

        System.out.println("instance1 hashCode:- " + instance1.hashCode()); //instance1 hashCode:- 1174361318
        System.out.println("instance2 hashCode:- " + instance2.hashCode()); //instance2 hashCode:- 1364335809
        System.out.println(instance1.equals(instance2)); //false

        /**
         * After fix
         */

        MySingleton2 instance3 = MySingleton2.getInstance();

        // Serialize the instance
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("file.text"));
        os.writeObject(instance3);
        os.close();

        // De-Serialize the instance
        ObjectInputStream is = new ObjectInputStream(new FileInputStream("file.text"));
        MySingleton2 instance4 = (MySingleton2) is.readObject();
        is.close();

        System.out.println("instance3 hashCode:- " + instance3.hashCode()); //instance3 hashCode:- 254413710
        System.out.println("instance4 hashCode:- " + instance4.hashCode()); //instance4 hashCode:- 254413710
        System.out.println(instance3.equals(instance4)); //true

    }
}
