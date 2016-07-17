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
package problem1036;

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
            setSystemIn("10.0 20.1 5.1\n");
            String[] args = null;
            Main.main(args);
            assertEquals("R1 = -0,29788\n" +
                    "R2 = -1,71212\n", outContent.toString());
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
            setSystemIn("0.0 20.0 5.0\n");
            String[] args = null;
            Main.main(args);
            assertEquals("Impossivel calcular\n", outContent.toString());
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
            setSystemIn("10.3 203.0 5.0\n");
            String[] args = null;
            Main.main(args);
            assertEquals("R1 = -0,02466\n" +
                    "R2 = -19,68408\n", outContent.toString());
        } catch (IOException ex) {
            fail(ex.getMessage());
        }
    }

    /**
     * Test of main method, of class Main.
     */
    @Test
    public void testMain4() {
        try {
            setSystemIn("10.0 3.0 5.0\n");
            String[] args = null;
            Main.main(args);
            assertEquals("Impossivel calcular\n", outContent.toString());
        } catch (IOException ex) {
            fail(ex.getMessage());
        }
    }

}
