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
package problem1018;

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
            setSystemIn("576\n");
            String[] args = null;
            Main.main(args);
            assertEquals("576\n" +
                    "5 nota(s) de R$ 100,00\n" +
                    "1 nota(s) de R$ 50,00\n" +
                    "1 nota(s) de R$ 20,00\n" +
                    "0 nota(s) de R$ 10,00\n" +
                    "1 nota(s) de R$ 5,00\n" +
                    "0 nota(s) de R$ 2,00\n" +
                    "1 nota(s) de R$ 1,00\n", outContent.toString());
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
            setSystemIn("11257\n");
            String[] args = null;
            Main.main(args);
            assertEquals("11257\n" +
                    "112 nota(s) de R$ 100,00\n" +
                    "1 nota(s) de R$ 50,00\n" +
                    "0 nota(s) de R$ 20,00\n" +
                    "0 nota(s) de R$ 10,00\n" +
                    "1 nota(s) de R$ 5,00\n" +
                    "1 nota(s) de R$ 2,00\n" +
                    "0 nota(s) de R$ 1,00\n", outContent.toString());
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
            setSystemIn("503\n");
            String[] args = null;
            Main.main(args);
            assertEquals("503\n" +
                    "5 nota(s) de R$ 100,00\n" +
                    "0 nota(s) de R$ 50,00\n" +
                    "0 nota(s) de R$ 20,00\n" +
                    "0 nota(s) de R$ 10,00\n" +
                    "0 nota(s) de R$ 5,00\n" +
                    "1 nota(s) de R$ 2,00\n" +
                    "1 nota(s) de R$ 1,00\n", outContent.toString());
        } catch (IOException ex) {
            fail(ex.getMessage());
        }
    }
    
}
