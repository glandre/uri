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
package common.samples;

import base.TestBase;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Geraldo B. Landre <geraldo.landre@gmail.com>
 */
public class Problem1019Test extends TestBase {

    /**
     * Test of main method, of class Main.
     */
    @Test
    public void testMain() {
        setSystemIn("556\n");
        String[] args = null;
        Problem1019.main(args);
        assertEquals("0:9:16\n", outContent.toString());
    }

    /**
     * Test of main method, of class Main.
     */
    @Test
    public void testMain2() {
        setSystemIn("1\n");
        String[] args = null;
        Problem1019.main(args);
        assertEquals("0:0:1\n", outContent.toString());
    }

    /**
     * Test of main method, of class Main.
     */
    @Test
    public void testMain3() {
        setSystemIn("140153\n");
        String[] args = null;
        Problem1019.main(args);
        assertEquals("38:55:53\n", outContent.toString());
    }
    
}
