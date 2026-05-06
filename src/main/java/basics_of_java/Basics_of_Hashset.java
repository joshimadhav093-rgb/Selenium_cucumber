package basics_of_java;

import java.util.HashSet;
import java.util.Iterator;

public class Basics_of_Hashset {

    public static void main(String[] args) {
        Basics_of_Hashset hs = new Basics_of_Hashset();
        hs.hashset();

    }

    public void hashset() {

        //Declear Hashset
        HashSet<String> fr = new HashSet<>();

        //Add Elements in hashset using add() method

        fr.add("Apple");
        fr.add("Mango");
        fr.add("Banana");

        System.out.println("Original Hashset " + fr);

        //Removed element using remove() method

        fr.remove("Banana");

        System.out.println("After element removed " + fr);

        //Check Element is contain

        fr.contains("Graps");
        System.out.println("Check that Contains " + fr.contains("Graps"));

        //Check that hashmset is empty

        fr.isEmpty();

        System.out.println("Check Hashset is empty " + fr.isEmpty());

        //Check Size of hashset

        fr.size();

        System.out.println("Size of hashmap " + fr.size());

        //Iterate the values using the iterator () method

        Iterator<String> i = fr.iterator();
        i.hasNext();

        System.out.println("iterate the values " + i.hasNext());

        // Traversing HashSet
        while (i.hasNext()){
            System.out.println(i.next() + ", ");}

        // Using enhanced for loop to iterate Over the HashSet
        System.out.print("Using enhanced for loop : ");
        for (String element : fr){
            System.out.println(element + " , ");}

        System.out.println("HashSet: " + fr);

        // Creating a new cloned set
        HashSet cs = new HashSet();

        // Cloning the set using clone() method
        cs = (HashSet)fr.clone();

        System.out.println("ClonedSet: " + fr);

        //Remove all elements from set using clear ();
        fr.clear();

        System.out.println("After clear HashSet" + fr);
    }




}

