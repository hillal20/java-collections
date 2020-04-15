package collections.collections;

import collections.collections.LinkedList.MyLinkedList;
import collections.collections.Map.MyHashTable;
import collections.collections.Map.MyMap;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.util.*;
import java.util.Map.Entry;
@SpringBootApplication
public class CollectionsApplication {

    public static void main(String[] args) {

        SpringApplication.run(CollectionsApplication.class, args);


        // linkedList
         MyLinkedList myLinkedList = new MyLinkedList();
         LinkedList linkedList = myLinkedList.linkedList;

         linkedList.add("H");
         linkedList.add("b");
         linkedList.add("J");
         linkedList.add("i");

         System.out.println(" 0 ====> " + linkedList.get(0));
         linkedList.addFirst("K");
         System.out.println(" 0 ====> " + linkedList);


         // looping  using iterator
        Iterator< String > it = linkedList.iterator();
        while (it.hasNext()){
            System.out.println(" next  ===> "+ it.next());
        }


      // Map

        MyMap myMap = new MyMap();
        HashMap map = myMap.myMap;
        map.put("hi", "hh");
        map.put("si", "ss");
        map.put("fi", "ff");
        map.put("bi", "bb");
        System.out.println(" map ===> "+ map.get("hi"));

            // print everything in the hashMap
            System.out.println(" all map ===> "+ map);

        // HashTable

        MyHashTable myHashTable = new MyHashTable();
        Hashtable hashtable = myHashTable.myHashTable;

        hashtable.put(1, "hi");
        hashtable.put(2, "bi");
        hashtable.put(3, "ci");
        hashtable.put(1,"o");
        hashtable.put(1,"o");
        System.out.println("hashTable ===> " + hashtable);



        // hashTable values via enumeration
         Enumeration e = hashtable.elements();
        while(e.hasMoreElements()){
            System.out.println(" e ===> "+ e.nextElement());
        }

        // hashTable values via entry set
        Set set = hashtable.entrySet();
        System.out.println(" set === " + set);



        System.out.println("=== collections app is running ======");
    }

}
