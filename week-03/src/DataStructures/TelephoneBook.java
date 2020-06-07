package DataStructures;

import java.util.HashMap;

public class TelephoneBook {
    public static void main(String[] args){
        HashMap<String, String> contacts = new HashMap<String, String>();
        contacts.put("William A. Lathan","405-709-1865");
        contacts.put("John K. Miller", "402-247-8568");
        contacts.put("Hortensia E. Foster", "606-481-6467");
        contacts.put("Amanda D. Newland", "319-243-5613");
        contacts.put("Brooke P. Askew", "307-687-2982");
        System.out.println("John K Miller's phone number is "+contacts.get("John K. Miller"));
        for (String item :
                contacts.keySet()) {
            if (contacts.get(item) == "307-687-2982"){
                System.out.println(item);
            }
        }
        System.out.println(contacts.containsKey("Chris E. Myers"));
    }
}
