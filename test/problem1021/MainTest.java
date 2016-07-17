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
package problem1021;

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
            setSystemIn("576.73\n");
            String[] args = null;
            Main.main(args);
            assertEquals("NOTAS:\n" +
                    "5 nota(s) de R$ 100.00\n" +
                    "1 nota(s) de R$ 50.00\n" +
                    "1 nota(s) de R$ 20.00\n" +
                    "0 nota(s) de R$ 10.00\n" +
                    "1 nota(s) de R$ 5.00\n" +
                    "0 nota(s) de R$ 2.00\n" +
                    "MOEDAS:\n" +
                    "1 moeda(s) de R$ 1,00\n" +
                    "1 moeda(s) de R$ 0,50\n" +
                    "0 moeda(s) de R$ 0,25\n" +
                    "2 moeda(s) de R$ 0,10\n" +
                    "0 moeda(s) de R$ 0,05\n" +
                    "3 moeda(s) de R$ 0,01\n", outContent.toString());
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
            setSystemIn("4.00\n");
            String[] args = null;
            Main.main(args);
            assertEquals("NOTAS:\n" +
                    "0 nota(s) de R$ 100.00\n" +
                    "0 nota(s) de R$ 50.00\n" +
                    "0 nota(s) de R$ 20.00\n" +
                    "0 nota(s) de R$ 10.00\n" +
                    "0 nota(s) de R$ 5.00\n" +
                    "2 nota(s) de R$ 2.00\n" +
                    "MOEDAS:\n" +
                    "0 moeda(s) de R$ 1,00\n" +
                    "0 moeda(s) de R$ 0,50\n" +
                    "0 moeda(s) de R$ 0,25\n" +
                    "0 moeda(s) de R$ 0,10\n" +
                    "0 moeda(s) de R$ 0,05\n" +
                    "0 moeda(s) de R$ 0,01\n", outContent.toString());
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
            setSystemIn("91.01\n");
            String[] args = null;
            Main.main(args);
            assertEquals("NOTAS:\n" +
                    "0 nota(s) de R$ 100.00\n" +
                    "1 nota(s) de R$ 50.00\n" +
                    "2 nota(s) de R$ 20.00\n" +
                    "0 nota(s) de R$ 10.00\n" +
                    "0 nota(s) de R$ 5.00\n" +
                    "0 nota(s) de R$ 2.00\n" +
                    "MOEDAS:\n" +
                    "1 moeda(s) de R$ 1,00\n" +
                    "0 moeda(s) de R$ 0,50\n" +
                    "0 moeda(s) de R$ 0,25\n" +
                    "0 moeda(s) de R$ 0,10\n" +
                    "0 moeda(s) de R$ 0,05\n" +
                    "1 moeda(s) de R$ 0,01\n", outContent.toString());
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
            setSystemIn("101.00\n");
            String[] args = null;
            Main.main(args);
            assertEquals("NOTAS:\n" +
                    "1 nota(s) de R$ 100.00\n" +
                    "0 nota(s) de R$ 50.00\n" +
                    "0 nota(s) de R$ 20.00\n" +
                    "0 nota(s) de R$ 10.00\n" +
                    "0 nota(s) de R$ 5.00\n" +
                    "0 nota(s) de R$ 2.00\n" +
                    "MOEDAS:\n" +
                    "1 moeda(s) de R$ 1,00\n" +
                    "0 moeda(s) de R$ 0,50\n" +
                    "0 moeda(s) de R$ 0,25\n" +
                    "0 moeda(s) de R$ 0,10\n" +
                    "0 moeda(s) de R$ 0,05\n" +
                    "0 moeda(s) de R$ 0,01\n", outContent.toString());
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
            setSystemIn("3.01\n");
            String[] args = null;
            Main.main(args);
            assertEquals("NOTAS:\n" +
                    "0 nota(s) de R$ 100.00\n" +
                    "0 nota(s) de R$ 50.00\n" +
                    "0 nota(s) de R$ 20.00\n" +
                    "0 nota(s) de R$ 10.00\n" +
                    "0 nota(s) de R$ 5.00\n" +
                    "1 nota(s) de R$ 2.00\n" +
                    "MOEDAS:\n" +
                    "1 moeda(s) de R$ 1,00\n" +
                    "0 moeda(s) de R$ 0,50\n" +
                    "0 moeda(s) de R$ 0,25\n" +
                    "0 moeda(s) de R$ 0,10\n" +
                    "0 moeda(s) de R$ 0,05\n" +
                    "1 moeda(s) de R$ 0,01\n", outContent.toString());
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
            setSystemIn("0.01\n");
            String[] args = null;
            Main.main(args);
            assertEquals("NOTAS:\n" +
                    "0 nota(s) de R$ 100.00\n" +
                    "0 nota(s) de R$ 50.00\n" +
                    "0 nota(s) de R$ 20.00\n" +
                    "0 nota(s) de R$ 10.00\n" +
                    "0 nota(s) de R$ 5.00\n" +
                    "0 nota(s) de R$ 2.00\n" +
                    "MOEDAS:\n" +
                    "0 moeda(s) de R$ 1,00\n" +
                    "0 moeda(s) de R$ 0,50\n" +
                    "0 moeda(s) de R$ 0,25\n" +
                    "0 moeda(s) de R$ 0,10\n" +
                    "0 moeda(s) de R$ 0,05\n" +
                    "1 moeda(s) de R$ 0,01\n", outContent.toString());
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
            setSystemIn("188.81\n");
            String[] args = null;
            Main.main(args);
            assertEquals("NOTAS:\n" +
                    "1 nota(s) de R$ 100.00\n" +
                    "1 nota(s) de R$ 50.00\n" +
                    "1 nota(s) de R$ 20.00\n" +
                    "1 nota(s) de R$ 10.00\n" +
                    "1 nota(s) de R$ 5.00\n" +
                    "1 nota(s) de R$ 2.00\n" +
                    "MOEDAS:\n" +
                    "1 moeda(s) de R$ 1,00\n" +
                    "1 moeda(s) de R$ 0,50\n" +
                    "1 moeda(s) de R$ 0,25\n" +
                    "0 moeda(s) de R$ 0,10\n" +
                    "1 moeda(s) de R$ 0,05\n" +
                    "1 moeda(s) de R$ 0,01\n", outContent.toString());
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
            setSystemIn("188.96\n");
            String[] args = null;
            Main.main(args);
            assertEquals("NOTAS:\n" +
                    "1 nota(s) de R$ 100.00\n" +
                    "1 nota(s) de R$ 50.00\n" +
                    "1 nota(s) de R$ 20.00\n" +
                    "1 nota(s) de R$ 10.00\n" +
                    "1 nota(s) de R$ 5.00\n" +
                    "1 nota(s) de R$ 2.00\n" +
                    "MOEDAS:\n" +
                    "1 moeda(s) de R$ 1,00\n" +
                    "1 moeda(s) de R$ 0,50\n" +
                    "1 moeda(s) de R$ 0,25\n" +
                    "2 moeda(s) de R$ 0,10\n" +
                    "0 moeda(s) de R$ 0,05\n" +
                    "1 moeda(s) de R$ 0,01\n", outContent.toString());
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
            setSystemIn("0.04\n");
            String[] args = null;
            Main.main(args);
            assertEquals("NOTAS:\n" +
                    "0 nota(s) de R$ 100.00\n" +
                    "0 nota(s) de R$ 50.00\n" +
                    "0 nota(s) de R$ 20.00\n" +
                    "0 nota(s) de R$ 10.00\n" +
                    "0 nota(s) de R$ 5.00\n" +
                    "0 nota(s) de R$ 2.00\n" +
                    "MOEDAS:\n" +
                    "0 moeda(s) de R$ 1,00\n" +
                    "0 moeda(s) de R$ 0,50\n" +
                    "0 moeda(s) de R$ 0,25\n" +
                    "0 moeda(s) de R$ 0,10\n" +
                    "0 moeda(s) de R$ 0,05\n" +
                    "4 moeda(s) de R$ 0,01\n", outContent.toString());
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
            setSystemIn("3.99\n");
            String[] args = null;
            Main.main(args);
            assertEquals("NOTAS:\n" +
                    "0 nota(s) de R$ 100.00\n" +
                    "0 nota(s) de R$ 50.00\n" +
                    "0 nota(s) de R$ 20.00\n" +
                    "0 nota(s) de R$ 10.00\n" +
                    "0 nota(s) de R$ 5.00\n" +
                    "1 nota(s) de R$ 2.00\n" +
                    "MOEDAS:\n" +
                    "1 moeda(s) de R$ 1,00\n" +
                    "1 moeda(s) de R$ 0,50\n" +
                    "1 moeda(s) de R$ 0,25\n" +
                    "2 moeda(s) de R$ 0,10\n" +
                    "0 moeda(s) de R$ 0,05\n" +
                    "4 moeda(s) de R$ 0,01\n", outContent.toString());
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
            setSystemIn("0.0\n");
            String[] args = null;
            Main.main(args);
            assertEquals("NOTAS:\n" +
                    "0 nota(s) de R$ 100.00\n" +
                    "0 nota(s) de R$ 50.00\n" +
                    "0 nota(s) de R$ 20.00\n" +
                    "0 nota(s) de R$ 10.00\n" +
                    "0 nota(s) de R$ 5.00\n" +
                    "0 nota(s) de R$ 2.00\n" +
                    "MOEDAS:\n" +
                    "0 moeda(s) de R$ 1,00\n" +
                    "0 moeda(s) de R$ 0,50\n" +
                    "0 moeda(s) de R$ 0,25\n" +
                    "0 moeda(s) de R$ 0,10\n" +
                    "0 moeda(s) de R$ 0,05\n" +
                    "0 moeda(s) de R$ 0,01\n", outContent.toString());
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
            setSystemIn("1000000.00\n");
            String[] args = null;
            Main.main(args);
            assertEquals("NOTAS:\n" +
                    "10000 nota(s) de R$ 100.00\n" +
                    "0 nota(s) de R$ 50.00\n" +
                    "0 nota(s) de R$ 20.00\n" +
                    "0 nota(s) de R$ 10.00\n" +
                    "0 nota(s) de R$ 5.00\n" +
                    "0 nota(s) de R$ 2.00\n" +
                    "MOEDAS:\n" +
                    "0 moeda(s) de R$ 1,00\n" +
                    "0 moeda(s) de R$ 0,50\n" +
                    "0 moeda(s) de R$ 0,25\n" +
                    "0 moeda(s) de R$ 0,10\n" +
                    "0 moeda(s) de R$ 0,05\n" +
                    "0 moeda(s) de R$ 0,01\n", outContent.toString());
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
            setSystemIn("999999.99\n");
            String[] args = null;
            Main.main(args);
            assertEquals("NOTAS:\n" +
                    "9999 nota(s) de R$ 100.00\n" +
                    "1 nota(s) de R$ 50.00\n" +
                    "2 nota(s) de R$ 20.00\n" +
                    "0 nota(s) de R$ 10.00\n" +
                    "1 nota(s) de R$ 5.00\n" +
                    "2 nota(s) de R$ 2.00\n" +
                    "MOEDAS:\n" +
                    "0 moeda(s) de R$ 1,00\n" +
                    "1 moeda(s) de R$ 0,50\n" +
                    "1 moeda(s) de R$ 0,25\n" +
                    "2 moeda(s) de R$ 0,10\n" +
                    "0 moeda(s) de R$ 0,05\n" +
                    "4 moeda(s) de R$ 0,01\n", outContent.toString());
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
            setSystemIn("0.05\n");
            String[] args = null;
            Main.main(args);
            assertEquals("NOTAS:\n" +
                    "0 nota(s) de R$ 100.00\n" +
                    "0 nota(s) de R$ 50.00\n" +
                    "0 nota(s) de R$ 20.00\n" +
                    "0 nota(s) de R$ 10.00\n" +
                    "0 nota(s) de R$ 5.00\n" +
                    "0 nota(s) de R$ 2.00\n" +
                    "MOEDAS:\n" +
                    "0 moeda(s) de R$ 1,00\n" +
                    "0 moeda(s) de R$ 0,50\n" +
                    "0 moeda(s) de R$ 0,25\n" +
                    "0 moeda(s) de R$ 0,10\n" +
                    "1 moeda(s) de R$ 0,05\n" +
                    "0 moeda(s) de R$ 0,01\n", outContent.toString());
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
            setSystemIn("0.10\n");
            String[] args = null;
            Main.main(args);
            assertEquals("NOTAS:\n" +
                    "0 nota(s) de R$ 100.00\n" +
                    "0 nota(s) de R$ 50.00\n" +
                    "0 nota(s) de R$ 20.00\n" +
                    "0 nota(s) de R$ 10.00\n" +
                    "0 nota(s) de R$ 5.00\n" +
                    "0 nota(s) de R$ 2.00\n" +
                    "MOEDAS:\n" +
                    "0 moeda(s) de R$ 1,00\n" +
                    "0 moeda(s) de R$ 0,50\n" +
                    "0 moeda(s) de R$ 0,25\n" +
                    "1 moeda(s) de R$ 0,10\n" +
                    "0 moeda(s) de R$ 0,05\n" +
                    "0 moeda(s) de R$ 0,01\n", outContent.toString());
        } catch (IOException ex) {
            fail(ex.getMessage());
        }
    }

    /**
     * Test of main method, of class Main.
     */
    @Test
    public void testMain16() {
        try {
            setSystemIn("0.25\n");
            String[] args = null;
            Main.main(args);
            assertEquals("NOTAS:\n" +
                    "0 nota(s) de R$ 100.00\n" +
                    "0 nota(s) de R$ 50.00\n" +
                    "0 nota(s) de R$ 20.00\n" +
                    "0 nota(s) de R$ 10.00\n" +
                    "0 nota(s) de R$ 5.00\n" +
                    "0 nota(s) de R$ 2.00\n" +
                    "MOEDAS:\n" +
                    "0 moeda(s) de R$ 1,00\n" +
                    "0 moeda(s) de R$ 0,50\n" +
                    "1 moeda(s) de R$ 0,25\n" +
                    "0 moeda(s) de R$ 0,10\n" +
                    "0 moeda(s) de R$ 0,05\n" +
                    "0 moeda(s) de R$ 0,01\n", outContent.toString());
        } catch (IOException ex) {
            fail(ex.getMessage());
        }
    }

    /**
     * Test of main method, of class Main.
     */
    @Test
    public void testMain17() {
        try {
            setSystemIn("0.5\n");
            String[] args = null;
            Main.main(args);
            assertEquals("NOTAS:\n" +
                    "0 nota(s) de R$ 100.00\n" +
                    "0 nota(s) de R$ 50.00\n" +
                    "0 nota(s) de R$ 20.00\n" +
                    "0 nota(s) de R$ 10.00\n" +
                    "0 nota(s) de R$ 5.00\n" +
                    "0 nota(s) de R$ 2.00\n" +
                    "MOEDAS:\n" +
                    "0 moeda(s) de R$ 1,00\n" +
                    "1 moeda(s) de R$ 0,50\n" +
                    "0 moeda(s) de R$ 0,25\n" +
                    "0 moeda(s) de R$ 0,10\n" +
                    "0 moeda(s) de R$ 0,05\n" +
                    "0 moeda(s) de R$ 0,01\n", outContent.toString());
        } catch (IOException ex) {
            fail(ex.getMessage());
        }
    }

    /**
     * Test of main method, of class Main.
     */
    @Test
    public void testMain18() {
        try {
            setSystemIn("1.00\n");
            String[] args = null;
            Main.main(args);
            assertEquals("NOTAS:\n" +
                    "0 nota(s) de R$ 100.00\n" +
                    "0 nota(s) de R$ 50.00\n" +
                    "0 nota(s) de R$ 20.00\n" +
                    "0 nota(s) de R$ 10.00\n" +
                    "0 nota(s) de R$ 5.00\n" +
                    "0 nota(s) de R$ 2.00\n" +
                    "MOEDAS:\n" +
                    "1 moeda(s) de R$ 1,00\n" +
                    "0 moeda(s) de R$ 0,50\n" +
                    "0 moeda(s) de R$ 0,25\n" +
                    "0 moeda(s) de R$ 0,10\n" +
                    "0 moeda(s) de R$ 0,05\n" +
                    "0 moeda(s) de R$ 0,01\n", outContent.toString());
        } catch (IOException ex) {
            fail(ex.getMessage());
        }
    }

    /**
     * Test of main method, of class Main.
     */
    @Test
    public void testMain19() {
        try {
            setSystemIn("2.00\n");
            String[] args = null;
            Main.main(args);
            assertEquals("NOTAS:\n" +
                    "0 nota(s) de R$ 100.00\n" +
                    "0 nota(s) de R$ 50.00\n" +
                    "0 nota(s) de R$ 20.00\n" +
                    "0 nota(s) de R$ 10.00\n" +
                    "0 nota(s) de R$ 5.00\n" +
                    "1 nota(s) de R$ 2.00\n" +
                    "MOEDAS:\n" +
                    "0 moeda(s) de R$ 1,00\n" +
                    "0 moeda(s) de R$ 0,50\n" +
                    "0 moeda(s) de R$ 0,25\n" +
                    "0 moeda(s) de R$ 0,10\n" +
                    "0 moeda(s) de R$ 0,05\n" +
                    "0 moeda(s) de R$ 0,01\n", outContent.toString());
        } catch (IOException ex) {
            fail(ex.getMessage());
        }
    }

    /**
     * Test of main method, of class Main.
     */
    @Test
    public void testMain20() {
        try {
            setSystemIn("5.00\n");
            String[] args = null;
            Main.main(args);
            assertEquals("NOTAS:\n" +
                    "0 nota(s) de R$ 100.00\n" +
                    "0 nota(s) de R$ 50.00\n" +
                    "0 nota(s) de R$ 20.00\n" +
                    "0 nota(s) de R$ 10.00\n" +
                    "1 nota(s) de R$ 5.00\n" +
                    "0 nota(s) de R$ 2.00\n" +
                    "MOEDAS:\n" +
                    "0 moeda(s) de R$ 1,00\n" +
                    "0 moeda(s) de R$ 0,50\n" +
                    "0 moeda(s) de R$ 0,25\n" +
                    "0 moeda(s) de R$ 0,10\n" +
                    "0 moeda(s) de R$ 0,05\n" +
                    "0 moeda(s) de R$ 0,01\n", outContent.toString());
        } catch (IOException ex) {
            fail(ex.getMessage());
        }
    }

    /**
     * Test of main method, of class Main.
     */
    @Test
    public void testMain25() {
        try {
            setSystemIn("5.00\n");
            String[] args = null;
            Main.main(args);
            assertEquals("NOTAS:\n" +
                    "0 nota(s) de R$ 100.00\n" +
                    "0 nota(s) de R$ 50.00\n" +
                    "0 nota(s) de R$ 20.00\n" +
                    "0 nota(s) de R$ 10.00\n" +
                    "1 nota(s) de R$ 5.00\n" +
                    "0 nota(s) de R$ 2.00\n" +
                    "MOEDAS:\n" +
                    "0 moeda(s) de R$ 1,00\n" +
                    "0 moeda(s) de R$ 0,50\n" +
                    "0 moeda(s) de R$ 0,25\n" +
                    "0 moeda(s) de R$ 0,10\n" +
                    "0 moeda(s) de R$ 0,05\n" +
                    "0 moeda(s) de R$ 0,01\n", outContent.toString());
        } catch (IOException ex) {
            fail(ex.getMessage());
        }
    }

    /**
     * Test of main method, of class Main.
     */
    @Test
    public void testMain21() {
        try {
            setSystemIn("10.00\n");
            String[] args = null;
            Main.main(args);
            assertEquals("NOTAS:\n" +
                    "0 nota(s) de R$ 100.00\n" +
                    "0 nota(s) de R$ 50.00\n" +
                    "0 nota(s) de R$ 20.00\n" +
                    "1 nota(s) de R$ 10.00\n" +
                    "0 nota(s) de R$ 5.00\n" +
                    "0 nota(s) de R$ 2.00\n" +
                    "MOEDAS:\n" +
                    "0 moeda(s) de R$ 1,00\n" +
                    "0 moeda(s) de R$ 0,50\n" +
                    "0 moeda(s) de R$ 0,25\n" +
                    "0 moeda(s) de R$ 0,10\n" +
                    "0 moeda(s) de R$ 0,05\n" +
                    "0 moeda(s) de R$ 0,01\n", outContent.toString());
        } catch (IOException ex) {
            fail(ex.getMessage());
        }
    }

    /**
     * Test of main method, of class Main.
     */
    @Test
    public void testMain22() {
        try {
            setSystemIn("20.00\n");
            String[] args = null;
            Main.main(args);
            assertEquals("NOTAS:\n" +
                    "0 nota(s) de R$ 100.00\n" +
                    "0 nota(s) de R$ 50.00\n" +
                    "1 nota(s) de R$ 20.00\n" +
                    "0 nota(s) de R$ 10.00\n" +
                    "0 nota(s) de R$ 5.00\n" +
                    "0 nota(s) de R$ 2.00\n" +
                    "MOEDAS:\n" +
                    "0 moeda(s) de R$ 1,00\n" +
                    "0 moeda(s) de R$ 0,50\n" +
                    "0 moeda(s) de R$ 0,25\n" +
                    "0 moeda(s) de R$ 0,10\n" +
                    "0 moeda(s) de R$ 0,05\n" +
                    "0 moeda(s) de R$ 0,01\n", outContent.toString());
        } catch (IOException ex) {
            fail(ex.getMessage());
        }
    }

    /**
     * Test of main method, of class Main.
     */
    @Test
    public void testMain23() {
        try {
            setSystemIn("50.00\n");
            String[] args = null;
            Main.main(args);
            assertEquals("NOTAS:\n" +
                    "0 nota(s) de R$ 100.00\n" +
                    "1 nota(s) de R$ 50.00\n" +
                    "0 nota(s) de R$ 20.00\n" +
                    "0 nota(s) de R$ 10.00\n" +
                    "0 nota(s) de R$ 5.00\n" +
                    "0 nota(s) de R$ 2.00\n" +
                    "MOEDAS:\n" +
                    "0 moeda(s) de R$ 1,00\n" +
                    "0 moeda(s) de R$ 0,50\n" +
                    "0 moeda(s) de R$ 0,25\n" +
                    "0 moeda(s) de R$ 0,10\n" +
                    "0 moeda(s) de R$ 0,05\n" +
                    "0 moeda(s) de R$ 0,01\n", outContent.toString());
        } catch (IOException ex) {
            fail(ex.getMessage());
        }
    }

    /**
     * Test of main method, of class Main.
     */
    @Test
    public void testMain24() {
        try {
            setSystemIn("100.00\n");
            String[] args = null;
            Main.main(args);
            assertEquals("NOTAS:\n" +
                    "1 nota(s) de R$ 100.00\n" +
                    "0 nota(s) de R$ 50.00\n" +
                    "0 nota(s) de R$ 20.00\n" +
                    "0 nota(s) de R$ 10.00\n" +
                    "0 nota(s) de R$ 5.00\n" +
                    "0 nota(s) de R$ 2.00\n" +
                    "MOEDAS:\n" +
                    "0 moeda(s) de R$ 1,00\n" +
                    "0 moeda(s) de R$ 0,50\n" +
                    "0 moeda(s) de R$ 0,25\n" +
                    "0 moeda(s) de R$ 0,10\n" +
                    "0 moeda(s) de R$ 0,05\n" +
                    "0 moeda(s) de R$ 0,01\n", outContent.toString());
        } catch (IOException ex) {
            fail(ex.getMessage());
        }
    }

    /**
     * Test of main method, of class Main.
     */
    @Test
    public void testMain26() {
        try {
            setSystemIn("188.91\n");
            String[] args = null;
            Main.main(args);
            assertEquals("NOTAS:\n" +
                    "1 nota(s) de R$ 100.00\n" +
                    "1 nota(s) de R$ 50.00\n" +
                    "1 nota(s) de R$ 20.00\n" +
                    "1 nota(s) de R$ 10.00\n" +
                    "1 nota(s) de R$ 5.00\n" +
                    "1 nota(s) de R$ 2.00\n" +
                    "MOEDAS:\n" +
                    "1 moeda(s) de R$ 1,00\n" +
                    "1 moeda(s) de R$ 0,50\n" +
                    "1 moeda(s) de R$ 0,25\n" +
                    "1 moeda(s) de R$ 0,10\n" +
                    "1 moeda(s) de R$ 0,05\n" +
                    "1 moeda(s) de R$ 0,01\n", outContent.toString());
        } catch (IOException ex) {
            fail(ex.getMessage());
        }
    }
}
