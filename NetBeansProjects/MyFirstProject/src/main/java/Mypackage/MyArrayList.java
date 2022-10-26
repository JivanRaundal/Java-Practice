
package Mypackage;

import java.util.ArrayList;


public class MyArrayList
{
    public static void main(String[] args)    
    {
        /*
        NOTE: -ArrayList is a collection in Java. (just like STL (Vectors, list, etc) in cpp)
              -It can contain set of elements of any datatype.
              -Some common methods => add(element)
                                      add(index, element)
                                      remove(element)
                                      remove(index)
        */
        ArrayList <String> lst = new ArrayList<>();
        
        //add(element)
        lst.add("C");
        lst.add("CPP");
        lst.add("JAVA");
        
        for(String s : lst)
        {
            System.out.println(" " + s);
        }
        
        System.out.println("---------------");
        
        //add(index, element)
        lst.add(0, "DS");
        lst.add(2,"ADS");
        
        System.out.println("After adding using index :");
        for(String s : lst)
        {
            System.out.println(" " + s);
        }

        System.out.println("---------------");
                
        //remove(element)
        lst.remove("ADS");
        
        System.out.println("After removing ADS");
        for(String s : lst)
        {
            System.out.println(" " + s);
        }
        
        System.out.println("---------------");
                
        //remove(index)
        lst.remove(2);
        
        System.out.println("After removing element at index 2");
        for(String s : lst)
        {
            System.out.println(" " + s);
        }
        
    }
}
