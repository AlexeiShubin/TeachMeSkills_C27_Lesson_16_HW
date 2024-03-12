package task1.createMap;

/*
 *the class contains a method for
 * creating interfaces like "map" and
 *  4 methods for outputting these maps to the console
 */

import task1.client.Client;

import java.util.HashMap;
import java.util.Map;

public class CreateMap {

    public static Map<String, Client> createMap(Client client1, Client client2, Client client3){
        Map<String, Client> map=new HashMap<>();
        map.put("MP1", client1);
        map.put("MP2", client2);
        map.put("MP3", client3);
        return map;
    }

    public static void FirstWay(Map<String, Client> map){
        for (Map.Entry<String, Client> element : map.entrySet()) {
            System.out.println( element.getKey() + element.getValue());
        }
    }

    public static void SecondWay(Map<String, Client> map) {
        for (Map.Entry<String, Client> stringClientEntry : map.entrySet()) {
            System.out.println(stringClientEntry);
        }
    }

    public static void Key(Map<String, Client> map){
        for (String key : map.keySet()){
            System.out.println( key);
        }
    }

    public static void Value(Map<String, Client> map){
        for (Client value : map.values()){
            System.out.println(value);
        }
    }
}
