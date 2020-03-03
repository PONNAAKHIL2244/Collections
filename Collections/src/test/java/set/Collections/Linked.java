package set.Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class Linked{
   public static void main(String args[]){

     LinkedList<String> list=new LinkedList<String>();

     //Adding elements to the Linked list
     list.add("vamshi");
     list.add("shiva");
     list.add("arun");
     list.add("praveen");
     list.add("sai");
     list.add("manish");
     list.add("dinesh");
     list.add("charan");
     list.add("prajyoth");
     list.add("santhosh");
     list.add("kalyan");
     list.add(11,"pranay");
 
     System.out.println(list);
    
     //using index print value
     System.out.println("LinkedList Elements :");
     int i = 0;
	while (list.size() > i) {
   	  System.out.println(list.get(i));
   	  i++;
         }
	
     
  //Adding an element to the first position
     list.addFirst("nikhil");
     
     //Adding an element using position
    list.add(2, "jaju");
     list.add(5, "vilash");
   
//removing an element
     list.remove("santhosh"); 
     list.remove("kalyan");  
     list.remove("dinesh");  
  
     //adding
     list.add(11,"sailesh");
     list.add("rupak");
     System.out.println(list);
     
     //adding
     list.add(1,"sai charan");
     list.add(5,"vikranth");
     list.add(7,"rahul LE");
     list.add(9,"Subhash");
     System.out.println(list);
     //removing
     list.remove("charan"); 
     list.remove("arun");  
     list.remove("shiva");  
     
     System.out.println(list);
     Iterator<String> iterator=list.iterator();
     while(iterator.hasNext()){
       System.out.println(iterator.next());
         }
   } 
}