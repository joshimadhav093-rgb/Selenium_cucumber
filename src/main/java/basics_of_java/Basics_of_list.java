package basics_of_java;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Basics_of_list {


    public void List(){

        //Declear List
        List<String> li= new ArrayList<>();

        //Add Items using Add method
        li.add("Apple");
        li.add("Orange");
        li.add("Banana");
        li.add("Mango");
        li.add("Avacado");

        //Add item in specific Location

        li.add(3,"Graps");

        //Retrive the list of itmes

        System.out.println("Itmes in the List");
        for(String s:li){
            System.out.println( s);
        }

        //Remove the Itmes from list we can remove item by using index and object
        li.remove(1);
        System.out.println("After Removing itme");
        for (String r:li)
        {
            System.out.println(r);
        }

       //Retrive Specific Item

       li.get(1) ;

        System.out.println(li.get(1));

        //Update List using Set method
        li.set(3,"Test");

        System.out.println("After Uodate List");

        for(String U:li){
            System.out.println( U);
        }

        //Know the size of List using size method
        li.size();

        System.out.println(li.size());

        //Check the equality of list using equal method
        List<String> ani= new ArrayList<>();
        ani.add("Dog");
        ani.add("Cat");
        ani.add("Monkey");
        ani.add("Lion");
        ani.add("Frog");

        System.out.println(li.equals(ani));;

        //Check that list is empty using isEmpaty method
        li.isEmpty();
        System.out.println(li.isEmpty());

        //Check the eelement is contain in list of not
        ani.contains("Dog");
        System.out.println(ani.contains("Dog"));

        //Sort the list nat
        ani.sort(Comparator.naturalOrder());

        System.out.println(ani);

        //Sort itmes in revrse
        ani.sort(Comparator.reverseOrder());

        System.out.println(ani);

        //Clear all itmes from list using clear() method
        ani.clear();
        li.clear();
        System.out.println(ani);
        System.out.println(li);



    }



    public static void main(String[] args) {

        Basics_of_list bs= new Basics_of_list();
        bs.List();
    }
}
