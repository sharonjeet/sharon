/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correct;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;



/**
 *
 * @author 1794085
 */
public class Correct {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       HashMap<Integer, String> hmap= new HashMap<Integer, String>();
       
       hmap.put(12,"zied");
       hmap.put(2,"kaur");
        hmap.put(7,"singh");
         hmap.put(76,"amit");
          hmap.put(54,"jyoti");
          
          Set set=hmap.entrySet();
          Iterator iterator=set.iterator();
          while(iterator.hasNext()){
             Map.Entry mentry=(Map.Entry) iterator.next();
             System.out.println("key is: "+mentry.getKey()+" & value is");
              System.out.println(mentry.getValue());
               System.out.println("shgayug");
          }
           String var=hmap.get(2);
           System.out.println("value at index 2 is "+var);
           
           hmap.remove(3);
           System.out.println("map key and values after removal:");
           Set set2=hmap.entrySet();
           Iterator iterator2=set2.iterator();
           while(iterator2.hasNext()){
                Map.Entry mentry2=(Map.Entry) iterator.next();
             System.out.println("key is: "+mentry2.getKey()+" & value is");
              
              System.out.println(mentry2.getValue());
           }
          
       
    }
    
}
