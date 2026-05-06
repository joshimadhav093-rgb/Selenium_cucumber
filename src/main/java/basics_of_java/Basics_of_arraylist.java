package basics_of_java;

import java.util.ArrayList;

public class Basics_of_arraylist {

    public static void main(String[] args) {

        Basics_of_arraylist ar = new Basics_of_arraylist();
            ar.arraylist();


    }
    public  void arraylist(){

        ArrayList<Integer> al= new ArrayList<>();

        //Add elements in list using

        al.add(1);
        al.add(1,2);
        al.add(3);
        al.add(4);
        al.add(5);

        System.out.println("Origanal List" +al);

        //Remove Element from list

        al.remove(2);
        System.out.println("After item Remove" +al);

        //Replce the item using Set () method for spacific index

        al.set(0,8);//index


        System.out.println("After update Item "+al);

        //Get the size of arraylist

        al.size();

        System.out.println("Size of Arraylist "+ al.size());

        //Get the Element by get() method for specific index

        al.get(1);

        System.out.println("Item at Index One " + al.get(1));

        //TO check Size for arraylist using size()

        al.size();

        System.out.println("Array list size " +al.size());

        // Trim size of Arraylist
        al.trimToSize();


    }





}
