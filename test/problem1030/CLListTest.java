/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem1030;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Geraldo B. Landre <geraldo.landre@gmail.com>
 */
public class CLListTest {

    /**
     * Test of add method, of class CLList.
     */
    @Test
    public void testAddRemoveAndIsEmpty() {
        int i = 3;
        CLList instance = new CLList();
        assertEquals(true, instance.isEmpty());
        instance.add(i);
        assertEquals(false, instance.isEmpty());
        int value = instance.remove(0);
        assertEquals(3, value);
        assertEquals(true, instance.isEmpty());
        instance.add(1);
        value = instance.remove(30);
        assertEquals(1, value);
    }

    /**
     * Test of remove method, of class CLList.
     */
    @Test
    public void testJosephus() {
        
        int n = 5, k = 2;
        CLList instance = new CLList();
        
        for(int i = 1; i <= 5; i++) {
            instance.add(i);
        }
        
        assertEquals(5, instance.length());
        
        int survivor;
        do {
            survivor = instance.remove(k);
        }
        while(!instance.isEmpty());
        
        assertEquals(3, survivor);
    }
    
}
