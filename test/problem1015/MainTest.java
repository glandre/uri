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

import base.TestBase;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    public void testMain() {
        try {
            setSystemIn("1.0 7.0\n5.0 9.0\n");
            String[] args = null;
            Main.main(args);
            assertEquals("4,4721\n", outContent.toString());
        } catch (IOException ex) {
            fail(ex.getMessage());
        }
    }

    /**
     * Test of main method, of class Main.
     */
    @Test
    public void testMain_1() {
        try {
            setSystemIn("5.0 9.0\n1.0 7.0\n");
            String[] args = null;
            Main.main(args);
            assertEquals("4,4721\n", outContent.toString());
        } catch (IOException ex) {
            fail(ex.getMessage());
        }
    }

    /**
     * Test of main method, of class Main.
     */
    @Test
    public void testMain2() {
        try {
            setSystemIn("-2.5 0.4\n12.1 7.3\n");
            String[] args = null;
            Main.main(args);
            assertEquals("16,1484\n", outContent.toString());
        } catch (IOException ex) {
            fail(ex.getMessage());
        }
    }

    /**
     * Test of main method, of class Main.
     */
    @Test
    public void testMain2_1() {
        try {
            setSystemIn("12.1 7.3\n-2.5 0.4\n");
            String[] args = null;
            Main.main(args);
            assertEquals("16,1484\n", outContent.toString());
        } catch (IOException ex) {
            fail(ex.getMessage());
        }
    }

    /**
     * Test of main method, of class Main.
     */
    @Test
    public void testMain3() {
        try {
            setSystemIn("2.5 -0.4\n-12.2 7.0\n");
            String[] args = null;
            Main.main(args);
            assertEquals("16,4575\n", outContent.toString());
        } catch (IOException ex) {
            fail(ex.getMessage());
        }
    }

    /**
     * Test of main method, of class Main.
     */
    @Test
    public void testMain3_1() {
        try {
            setSystemIn("-12.2 7.0\n2.5 -0.4\n");
            String[] args = null;
            Main.main(args);
            assertEquals("16,4575\n", outContent.toString());
        } catch (IOException ex) {
            fail(ex.getMessage());
        }
    }
    
}
