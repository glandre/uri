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
package problem1008;

import base.TestBase;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
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
        try {
            setSystemIn("25\n100\n5.50\n");
            String[] args = null;
            Main.main(args);
            assertEquals("NUMBER = 25\nSALARY = U$ 550,00\n", outContent.toString());
        } catch (IOException ex) {
            fail(ex.getMessage());
        }
    }

    /**
     * Test of main method, of class Main.
     */
    @Test
    public void testMain_sample2() {
        try {
            setSystemIn("1\n200\n20.50\n");
            String[] args = null;
            Main.main(args);
            assertEquals("NUMBER = 1\nSALARY = U$ 4100,00\n", outContent.toString());
        } catch (IOException ex) {
            fail(ex.getMessage());
        }
    }

    /**
     * Test of main method, of class Main.
     */
    @Test
    public void testMain_sample3() {
        try {
            setSystemIn("6\n145\n15.55\n");
            String[] args = null;
            Main.main(args);
            assertEquals("NUMBER = 6\nSALARY = U$ 2254,75\n", outContent.toString());
        } catch (IOException ex) {
            fail(ex.getMessage());
        }
    }
    
}
