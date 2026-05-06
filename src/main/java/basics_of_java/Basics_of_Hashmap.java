package basics_of_java;

import java.util.HashMap;

public class Basics_of_Hashmap {


    public static void main(String[] args) {

        Basics_of_Hashmap hp= new Basics_of_Hashmap();
        hp.Hashmap();

    }

     public void Hashmap (){
        // Declearation of hashmap
        HashMap<Integer , String> hs = new HashMap<>();

        //Add elements in Hashmap using add()

         hs.put(1,"John");
         hs.put(2,"Sccot");
         hs.put(3,"Alex");
         hs.put(4,"Tom");

         System.out.println("Original Hashmap "+ hs);

         //Change Item value

         hs.put(4,"Eric");

         System.out.println("After change "+hs);

         //Remove Element
         hs.remove("Eric");

         System.out.println("After Remove "+hs);

         //Check that map is empty using isempty()

         hs.isEmpty();

         System.out.println("Check that map is ecmpty = " + hs.isEmpty());

         //Retrive values using get method

         hs.get("Tom");

         System.out.println("Get the Vlaues of key = "+hs.get("Tom"));

         //Check value  is contain in hashmap

         hs.containsValue(1);

         System.out.println("Is John is present "+hs.containsValue(1));

         //Check Key present
         hs.containsKey(4);

         System.out.println("The key value prenset " +hs.containsKey(4));

         //Check Size of the hashmap

         hs.size();

         System.out.println("Size of the Map "+hs.size());

         //Retrive the the values of key

         hs.values();

         System.out.println("the valeus of hashmap are "+hs.values());



     }
}
