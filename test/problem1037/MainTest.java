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
package problem1037;

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
            setSystemIn("-0.00001");
            String[] args = null;
            Main.main(args);
            assertEquals("Fora de intervalo\n", outContent.toString());
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
            setSystemIn("0.00000");
            String[] args = null;
            Main.main(args);
            assertEquals("Intervalo [0,25]\n", outContent.toString());
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
            setSystemIn("0.00001");
            String[] args = null;
            Main.main(args);
            assertEquals("Intervalo [0,25]\n", outContent.toString());
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
            setSystemIn("24.99999");
            String[] args = null;
            Main.main(args);
            assertEquals("Intervalo [0,25]\n", outContent.toString());
        } catch (IOException ex) {
            fail(ex.getMessage());
        }
    }

    /**
     * Test of main method, of class Main.
     */
    @Test
    public void testMain5() {
        try {
            setSystemIn("25.00000");
            String[] args = null;
            Main.main(args);
            assertEquals("Intervalo [0,25]\n", outContent.toString());
        } catch (IOException ex) {
            fail(ex.getMessage());
        }
    }

    /**
     * Test of main method, of class Main.
     */
    @Test
    public void testMain6() {
        try {
            setSystemIn("25.00001");
            String[] args = null;
            Main.main(args);
            assertEquals("Intervalo (25,50]\n", outContent.toString());
        } catch (IOException ex) {
            fail(ex.getMessage());
        }
    }

    /**
     * Test of main method, of class Main.
     */
    @Test
    public void testMain7() {
        try {
            setSystemIn("49.99999");
            String[] args = null;
            Main.main(args);
            assertEquals("Intervalo (25,50]\n", outContent.toString());
        } catch (IOException ex) {
            fail(ex.getMessage());
        }
    }

    /**
     * Test of main method, of class Main.
     */
    @Test
    public void testMain8() {
        try {
            setSystemIn("50.00000");
            String[] args = null;
            Main.main(args);
            assertEquals("Intervalo (25,50]\n", outContent.toString());
        } catch (IOException ex) {
            fail(ex.getMessage());
        }
    }

    /**
     * Test of main method, of class Main.
     */
    @Test
    public void testMain9() {
        try {
            setSystemIn("50.00001");
            String[] args = null;
            Main.main(args);
            assertEquals("Intervalo (50,75]\n", outContent.toString());
        } catch (IOException ex) {
            fail(ex.getMessage());
        }
    }

    /**
     * Test of main method, of class Main.
     */
    @Test
    public void testMain10() {
        try {
            setSystemIn("74.99999");
            String[] args = null;
            Main.main(args);
            assertEquals("Intervalo (50,75]\n", outContent.toString());
        } catch (IOException ex) {
            fail(ex.getMessage());
        }
    }

    /**
     * Test of main method, of class Main.
     */
    @Test
    public void testMain11() {
        try {
            setSystemIn("75.00000");
            String[] args = null;
            Main.main(args);
            assertEquals("Intervalo (50,75]\n", outContent.toString());
        } catch (IOException ex) {
            fail(ex.getMessage());
        }
    }

    /**
     * Test of main method, of class Main.
     */
    @Test
    public void testMain12() {
        try {
            setSystemIn("75.00001");
            String[] args = null;
            Main.main(args);
            assertEquals("Intervalo (75,100]\n", outContent.toString());
        } catch (IOException ex) {
            fail(ex.getMessage());
        }
    }

    /**
     * Test of main method, of class Main.
     */
    @Test
    public void testMain13() {
        try {
            setSystemIn("99.99999");
            String[] args = null;
            Main.main(args);
            assertEquals("Intervalo (75,100]\n", outContent.toString());
        } catch (IOException ex) {
            fail(ex.getMessage());
        }
    }

    /**
     * Test of main method, of class Main.
     */
    @Test
    public void testMain14() {
        try {
            setSystemIn("100.00000");
            String[] args = null;
            Main.main(args);
            assertEquals("Intervalo (75,100]\n", outContent.toString());
        } catch (IOException ex) {
            fail(ex.getMessage());
        }
    }

    /**
     * Test of main method, of class Main.
     */
    @Test
    public void testMain15() {
        try {
            setSystemIn("100.00001");
            String[] args = null;
            Main.main(args);
            assertEquals("Fora de intervalo\n", outContent.toString());
        } catch (IOException ex) {
            fail(ex.getMessage());
        }
    }
    
}
