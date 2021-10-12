package org.example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        map.put(1, "Hello");
        map.put(2, "Hi");
        map.put(3, "Howdy");

        System.out.println("Iterating with a while loop");

        //Iterating through the hash map with while loop
        Iterator iterator = map.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry entry = (Map.Entry)iterator.next();
            String greetings = ((String)entry.getValue());
            System.out.println("Greeting " + entry.getKey() + ": " + greetings);
        }
        System.out.println("---------------------");

        //Iterating through with an enhanced for loop

        System.out.println("Iterating through with an enhanced for loop");
        for (Map.Entry entry: map.entrySet()) {
            int key = (int)entry.getKey();

            String greetings = ((String)entry.getValue());

            System.out.println("Greeting" + key + ": " + greetings);


        }
        System.out.println("-------------------------");
    }
}
