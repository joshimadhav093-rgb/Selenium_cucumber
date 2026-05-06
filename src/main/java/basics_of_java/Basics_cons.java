package basics_of_java;

public class Basics_cons {

    public static void main(String[] args) {

        Basics_cons con = new Basics_cons();
        Basics_cons cons = new Basics_cons("Java");
        System.out.println(cons.getName());

    }




    //Default constructor
    public  Basics_cons(){

        System.out.println("This is Default no-argument Construcor");
    }
        String name;
    //Parameterized constructor
     public Basics_cons(String n){

        this.name=n;
        System.out.println("This is parameterize constructor");

     }
        //Method
     public String getName(){
         return name;
     }




}
