/* JavaCollectionsTest.java
 * Java class to test
 * @Author: Nolusindiso Makosa (219023557)
 * Due Date: 16 May 2021
 * */

package za.ac.cput.adp3Assignment2;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;
import org.hamcrest.collection.IsMapContaining;
import org.hamcrest.CoreMatchers;
import static org.hamcrest.MatcherAssert.assertThat;

class JavaCollectionsTest
{
    @Test
    public void implementCollection(){
        Map<String, String> map = new HashMap<>();
        map.put("2016","Alu");
        map.put("2019", "Tumelo");
        map.put("2015", "Wenzo");

        assertEquals("[2019, 2016, 2015]", map.keySet().toString());

        map.remove("2016");
        assertEquals("[2019, 2015]", map.keySet().toString());
        assertThat(map, IsMapContaining.hasEntry("2019","Tumelo"));
    }

    @Test
    public void implementMap(){
        TreeMap<Integer, String> treeMap = new TreeMap();
        treeMap.put(0, "Lindo");
        treeMap.put(1, "Nomusa");
        treeMap.put(2, "Mawande");
        treeMap.put(3, "Sindi");
        treeMap.put(4, "Nangamso");
        treeMap.put(5, "Aviwe");

        //Test Add
        assertEquals("[0, 1, 2, 3, 4, 5]", treeMap.keySet().toString());
        //Test Remove
        treeMap.remove(5);
        assertEquals("[0, 1, 2, 3, 4]", treeMap.keySet().toString());

        //Test Find
        assertThat(treeMap, IsMapContaining.hasEntry(3,"Sindi"));
    }

    @Test
    public void implementSet(){
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        //Test add
        assertEquals("[50, 20, 40, 10, 30]", set.toString());

        //Test Remove
        set.remove(10);
        assertEquals("[50, 20, 40, 30]", set.toString());

        //Test Find
        assertThat(set, CoreMatchers.hasItem(20));
    }

    @Test
    public void implementLinkedList(){
        // creating an instance of the LinkedList collection
        LinkedList<String> linkedList = new LinkedList<>();
        // adding values/elements into our list
        linkedList.add("Book A");
        linkedList.add("Book B");
        linkedList.add("Book C");
        linkedList.add("Book D");

        assertEquals("[Book A, Book B, Book C, Book D]", linkedList.toString());
        linkedList.remove("Book B");
        assertEquals("[Book A, Book C, Book D]", linkedList.toString());
        assertThat(linkedList, CoreMatchers.hasItem("Book A") );
    }

}