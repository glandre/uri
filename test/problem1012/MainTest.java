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
package problem1012;

import base.TestBase;
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
    public void testMain1() {
        setSystemIn("3,0 4,0 5,2");
        String[] args = null;
        Main.main(args);
        String expectedResult = "TRIANGULO: 7,800\n" +
                                "CIRCULO: 84,949\n" +
                                "TRAPEZIO: 18,200\n" +
                                "QUADRADO: 16,000\n" +
                                "RETANGULO: 12,000\n";
        
        assertEquals(expectedResult, outContent.toString());
    }
    /**
     * Test of main method, of class Main.
     */
    @Test
    public void testMain2() {
        setSystemIn("12,7 10,4 15,2");
        String[] args = null;
        Main.main(args);
        String expectedResult = "TRIANGULO: 96,520\n" +
                                "CIRCULO: 725,833\n" +
                                "TRAPEZIO: 175,560\n" +
                                "QUADRADO: 108,160\n" +
                                "RETANGULO: 132,080\n";
        
        assertEquals(expectedResult, outContent.toString());
    }
    
}
