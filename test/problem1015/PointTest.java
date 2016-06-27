/*
 * Copyright (C) 2016 Geraldo B. Landre <geraldo.landre@gmail.com>
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package problem1015;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Geraldo B. Landre <geraldo.landre@gmail.com>
 */
public class PointTest {

    /**
     * Test of distance method, of class Point.
     */
    @Test
    public void testDistance() {
        Point instance = new Point(1, 7);
        Point p = new Point(5, 9);
        double expResult = 4.4721;
        double result = instance.distance(p);
        assertEquals(expResult, result, 0.0001);
    }

    /**
     * Test of distance method, of class Point.
     */
    @Test
    public void testDistance_1() {
        Point instance = new Point(1, 7);
        Point p = new Point(5, 9);
        double expResult = 4.4721;
        double result = p.distance(instance);
        assertEquals(expResult, result, 0.0001);
    }

    /**
     * Test of distance method, of class Point.
     */
    @Test
    public void testDistance2() {
        Point instance = new Point(-2.5, 0.4);
        Point p = new Point(12.1, 7.3);
        double expResult = 16.1484;
        double result = instance.distance(p);
        assertEquals(expResult, result, 0.0001);
    }

    /**
     * Test of distance method, of class Point.
     */
    @Test
    public void testDistance2_1() {
        Point instance = new Point(-2.5, 0.4);
        Point p = new Point(12.1, 7.3);
        double expResult = 16.1484;
        double result = p.distance(instance);
        assertEquals(expResult, result, 0.0001);
    }

    /**
     * Test of distance method, of class Point.
     */
    @Test
    public void testDistance3() {
        Point instance = new Point(2.5, -0.4);
        Point p = new Point(-12.2, 7.0);
        double expResult = 16.4575;
        double result = instance.distance(p);
        assertEquals(expResult, result, 0.0001);
    }

    /**
     * Test of distance method, of class Point.
     */
    @Test
    public void testDistance3_1() {
        Point instance = new Point(2.5, -0.4);
        Point p = new Point(-12.2, 7.0);
        double expResult = 16.4575;
        double result = p.distance(instance);
        assertEquals(expResult, result, 0.0001);
    }
    
}
