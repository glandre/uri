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
package problem1009;

import base.TestBase;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Geraldo B. Landre <geraldo.landre@gmail.com>
 */
public class MainTest extends TestBase {

    /**
     * Test of main method, of class Main.
     */
    @Test
    public void testMain_sample1() {
        setSystemIn("JOAO\n500,00\n1230,30\n");
        String[] args = null;
        Main.main(args);
        // according to URI:
        // assertEquals("TOTAL = R$ 684,54\n", outContent.toString());
        // according to JUnit:
        assertEquals("TOTAL = R$ 684,55\n", outContent.toString());
    }

    /**
     * Test of main method, of class Main.
     */
    @Test
    public void testMain_sample2() {
        setSystemIn("PEDRO\n700,00\n00,0\n");
        String[] args = null;
        Main.main(args);
        assertEquals("TOTAL = R$ 700,00\n", outContent.toString());
    }

    /**
     * Test of main method, of class Main.
     */
    @Test
    public void testMain_sample3() {
        setSystemIn("MANGOJATA\n1700,00\n1230,50\n");
        String[] args = null;
        Main.main(args);
        assertEquals("TOTAL = R$ 1884,58\n", outContent.toString());
    }
    
}
