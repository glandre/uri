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
package problem1038;

import base.TestBase;
import java.io.IOException;
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
        setSystemIn("3 2");

        try {
            Main.main(null);
        } catch (IOException ex) {
            fail("Exception thrown... " + ex.getMessage());
        }
        assertEquals("Total: R$ 10,00\n", outContent.toString());
    }

    /**
     * Test of main method, of class Main.
     */
    @Test
    public void testMain_sample2() {
        setSystemIn("4 3");
        try {
            Main.main(null);
        } catch (IOException ex) {
            fail("Exception thrown... " + ex.getMessage());
        }
        assertEquals("Total: R$ 6,00\n", outContent.toString());
    }

    /**
     * Test of main method, of class Main.
     */
    @Test
    public void testMain_sample3() {
        setSystemIn("2 3");
        try {
            Main.main(null);
        } catch (IOException ex) {
            fail("Exception thrown... " + ex.getMessage());
        }
        assertEquals("Total: R$ 13,50\n", outContent.toString());
    }
    
}
