package DataStructures;

import java.util.HashMap;

public class MapIntroduction2 {
    public static void main(String[] args){
        HashMap<String, String> newHashMap = new HashMap<String, String>();
        newHashMap.put("978-1-60309-452-8","A Letter to Jo");
        newHashMap.put("978-1-60309-459-7", "Lupus");
        newHashMap.put("978-1-60309-444-3", "Red Panda and Moon Bear");
        newHashMap.put("978-1-60309-461-0", "The Lab");

        for (String key: newHashMap.keySet()) {
            System.out.println(newHashMap.get(key)+" (ISBN: "+key+')');
        }
        newHashMap.remove("978-1-60309-444-3");

        for (String key:
                newHashMap.keySet()) {
            if (newHashMap.get(key) == "The Lab"){
                newHashMap.remove(key);
            }
        }
        System.out.println("");


        newHashMap.put("978-1-60309-450-4","They Called Us Enemy");
        newHashMap.put("978-1-60309-453-5","Why Did We Trust Him?");

        System.out.println(newHashMap.containsKey("478-0-61159-424-8"));
        System.out.println(newHashMap.get("978-1-60309-453-5"));
        for (String key: newHashMap.keySet()) {
            System.out.println(newHashMap.get(key)+" (ISBN: "+key+')');
        }

    }
}
