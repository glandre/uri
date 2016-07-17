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
package problem1026;

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
    public void testMain() {
        try {
            setSystemIn("4 6\n6 9\n");
            String[] args = null;
            Main.main(args);
            assertEquals("2\n15\n", outContent.toString());
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
            setSystemIn("4 6\n" +
                    "6 9\n" +
                    "3 5\n" +
                    "10 20\n" +
                    "100 55\n" +
                    "1000 1400\n" +
                    "255 255\n" +
                    "32000 31000\n" +
                    "31234 255\n" +
                    "1234 1234\n" +
                    "1010 2020\n");
            String[] args = null;
            Main.main(args);
            assertEquals("2\n" +
                    "15\n" +
                    "6\n" +
                    "30\n" +
                    "83\n" +
                    "1680\n" +
                    "0\n" +
                    "1048\n" +
                    "31485\n" +
                    "0\n" +
                    "1046\n", outContent.toString());
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
            setSystemIn("0 0\n" +
                        "2863311530 1431655765\n" +
                        "4294967295 4294967295\n");
            String[] args = null;
            Main.main(args);
            assertEquals("0\n" +
                        "4294967295\n" +
                        "0\n", outContent.toString());
        } catch (IOException ex) {
            fail(ex.getMessage());
        }
    }
    
}
